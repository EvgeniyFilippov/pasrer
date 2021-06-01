package getApiEgr;

import getApiEgr.model.Organization;
import getApiEgr.model.Row;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class JsonSimpleParser {
//    public Row parseFromFile() {
//        Organization organization = new Organization();
//        Row row = new Row(organization);
//        JSONParser parser = new JSONParser();
//        try (FileReader reader = new FileReader("src/main/java/getApiEgr/test2.json")) {
//            JSONObject rowJsonObject = (JSONObject) parser.parse(reader);
//            JSONObject allFieldsOfOrganization = (JSONObject) rowJsonObject.get("ROW");
//            row = fillingRow(allFieldsOfOrganization, row);
//            return row;
//        } catch (Exception e) {
//            System.out.println("Error parsing: " + e.toString());
//        }
//        return null;
//    }

    public JSONObject parseFromUrl(URL url) {
        StringBuilder stringBuilder = new StringBuilder();
        JSONObject finishJsonObject = new JSONObject();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String inputLine = in.readLine();
            stringBuilder.append(inputLine);
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(inputLine);
            finishJsonObject = (JSONObject) jsonObject.get("ROW");
        } catch (IOException | ParseException e) {
            System.out.println("Error get info from URL. " + e.getMessage());
        }
        return finishJsonObject;
    }

    public Row fillingRow(JSONObject finishJsonObject) {
        Organization organization = new Organization();
        Row row = new Row(organization);
        row.getOrganization().setUnp(getValueFromJsonObject(finishJsonObject, "VUNP"));
        row.getOrganization().setFullName(getValueFromJsonObject(finishJsonObject, "VNAIMP"));
        row.getOrganization().setShortName(getValueFromJsonObject(finishJsonObject, "VNAIMK"));
        row.getOrganization().setAddress(getValueFromJsonObject(finishJsonObject, "VPADRES"));
        row.getOrganization().setDateOfRegistration(getValueFromJsonObject(finishJsonObject, "DREG"));
        row.getOrganization().setСodeOfTax(getValueFromJsonObject(finishJsonObject, "NMNS"));
        row.getOrganization().setNameOfTax(getValueFromJsonObject(finishJsonObject, "VMNS"));
        row.getOrganization().setState(getValueFromJsonObject(finishJsonObject, "VKODS"));
        row.getOrganization().setDateOfChange(getValueFromJsonObject(finishJsonObject, "DLIKV"));
        row.getOrganization().setReasonOfChange(getValueFromJsonObject(finishJsonObject, "VLIKV"));
        return row;
    }

    public String getValueFromJsonObject(JSONObject finishJsonObject, String key) {
        String value = "";
        if (finishJsonObject.get(key) != null) {
            value = finishJsonObject.get(key).toString();
        } else {
            value = "Нет данных";
        }
        return value;
    }
}
