package getApiEgr;

import getApiEgr.model.Organization;
import getApiEgr.model.Root;
import getApiEgr.model.Row;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class JsonSimpleParser {
    public Row parse() {
        Organization organization = new Organization();
        Row row = new Row(organization);
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader("src/main/java/getApiEgr/test2.json")) {
            JSONObject rowJsonObject = (JSONObject) parser.parse(reader);
            JSONObject allFieldsOfOrganization = (JSONObject) rowJsonObject.get("ROW");
            row.getOrganization().setVNAIMK(allFieldsOfOrganization.get("VNAIMK").toString());
            row.getOrganization().setVKODS(allFieldsOfOrganization.get("VKODS").toString());
            return row;
        } catch (Exception e) {
            System.out.println("Error parsing: " + e.toString());
        }
        return null;
    }
}
