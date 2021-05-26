package getApiEgr;

import getApiEgr.model.Root;

public class Demo {
    public static void main(String[] args) {
        JsonSimpleParser jsonSimpleParser = new JsonSimpleParser();
        Root root = jsonSimpleParser.parse();
        System.out.println("Root " + root.toString());
    }
}
