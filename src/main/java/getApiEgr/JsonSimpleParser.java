package getApiEgr;

import getApiEgr.model.Root;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class JsonSimpleParser {
    public Root parse() {
        Root root = new Root();
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader("src/main/java/getApiEgr/JsonParser.java")) {
            JSONObject rootJsonObject = (JSONObject) parser.parse(reader);
            String name = rootJsonObject.get("name").toString();
            root.setName(name);
            return root;
        } catch (Exception e) {
            System.out.println("Error parsing: " + e.toString());
        }
        return null;
    }
}
