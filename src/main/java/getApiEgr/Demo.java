package getApiEgr;

import getApiEgr.model.Row;

public class Demo {
    public static void main(String[] args) {
        JsonSimpleParser jsonSimpleParser = new JsonSimpleParser();
        Row row = jsonSimpleParser.parse();
        System.out.println("Наименование: " + row.getOrganization().getVNAIMK() + "\nСтатус: " + row.getOrganization().getVKODS() );
    }
}
