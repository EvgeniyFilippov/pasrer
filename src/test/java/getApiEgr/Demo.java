package getApiEgr;

import getApiEgr.model.Row;
import org.json.simple.JSONObject;
import java.net.MalformedURLException;
import java.net.URL;

public class Demo {
    public static void main(String[] args) {
//        JsonSimpleParser jsonSimpleParser = new JsonSimpleParser();
//        Row row = jsonSimpleParser.parseFromFile();
//        System.out.println("Наименование: " + row.getOrganization().getShortName() + "\nСтатус: " + row.getOrganization().getState() );

        JsonSimpleParser jsonSimpleParserUrl = new JsonSimpleParser();
        URL url = null;
        try {
            url = new URL("http://www.portal.nalog.gov.by/grp/getData?unp=192945049&charset=UTF-8&type=json");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        JSONObject finishJsonObject = jsonSimpleParserUrl.parseFromUrl(url);
        Row row = jsonSimpleParserUrl.fillingRow(finishJsonObject);

        System.out.printf("Краткое наименование: %s\nПолное наименование: %s\nСтатус: %s\nУНП: %s\nДата изменения состояния: %s", row.getOrganization().getShortName(), row.getOrganization().getFullName(), row.getOrganization().getState(), row.getOrganization().getUnp(), row.getOrganization().getDateOfChange());
    }
}
