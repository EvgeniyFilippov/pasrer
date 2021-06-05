package getApiEgr;

import getApiEgr.model.Row;
import getApiEgr.util.AnsiColorCode;
import org.json.simple.JSONObject;
import java.net.MalformedURLException;
import java.net.URL;

public class Demo {
    public static void main(String[] args) {
//        JsonSimpleParser jsonSimpleParser = new JsonSimpleParser();
//        Row row = jsonSimpleParser.parseFromFile();
//        System.out.println("Наименование: " + row.getOrganization().getShortName() + "\nСтатус: " + row.getOrganization().getState() );

        JsonSimpleParser jsonSimpleParserUrl = new JsonSimpleParser();
        JSONObject finishJsonObject = jsonSimpleParserUrl.parseFromUrl(192945049);
        Row row = jsonSimpleParserUrl.fillingRow(finishJsonObject);
        System.out.println("Краткое наименование: " + row.getOrganization().getShortName());
        if (row.getOrganization().getState().equals("Действующий")) {
            System.out.println(AnsiColorCode.FG_GREEN_BRIGHT + row.getOrganization().getState() + AnsiColorCode.RESET);
        } else {
            System.out.println(AnsiColorCode.FG_RED_BOLD_BRIGHT + row.getOrganization().getState() + AnsiColorCode.RESET);
        }
        System.out.printf("Полное наименование: %s\nСтатус: %s\nУНП: %s\nДата изменения состояния: %s",
                row.getOrganization().getFullName(), row.getOrganization().getState(),
                row.getOrganization().getUnp(), row.getOrganization().getDateOfChange());
    }
}
