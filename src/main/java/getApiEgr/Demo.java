package getApiEgr;

import getApiEgr.model.Row;

import java.net.MalformedURLException;
import java.net.URL;

public class Demo {
    public static void main(String[] args) {
        JsonSimpleParser jsonSimpleParser = new JsonSimpleParser();
        Row row = jsonSimpleParser.parse();
        System.out.println("Наименование: " + row.getOrganization().getVNAIMK() + "\nСтатус: " + row.getOrganization().getVKODS() );

        JsonSimpleParser jsonSimpleParserUrl = new JsonSimpleParser();
        URL url = null;
        try {
            url = new URL("http://www.portal.nalog.gov.by/grp/getData?unp=192945049&charset=UTF-8&type=json");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Row rowUrl = jsonSimpleParserUrl.parseFromUrl(url);
        System.out.println("Наименование: " + rowUrl.getOrganization().getVNAIMK() + "\nСтатус: " + rowUrl.getOrganization().getVKODS() );
    }
}
