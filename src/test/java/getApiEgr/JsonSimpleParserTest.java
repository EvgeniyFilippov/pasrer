package getApiEgr;

import junit.framework.TestCase;
import org.json.simple.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;

public class JsonSimpleParserTest extends TestCase {

    public void testParseFromUrl() {
        JsonSimpleParser jsonSimpleParserUrl = new JsonSimpleParser();
        URL url = null;
        try {
            url = new URL("http://www.portal.nalog.gov.by/grp/getData?unp=192945049&charset=UTF-8&type=json");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        String expected = "{\"DREG\":\"25.07.2017\",\"NMNS\":\"107\",\"VLIKV\":null,\"VNAIMK\":\"ООО \\\"" +
                "Спорт Витал\\\"\",\"VMNS\":\"Инспекция МНС по Первомайскому району г.Минска \",\"VKODS\":" +
                "\"Действующий\",\"VUNP\":\"192945049\",\"VNAIMP\":\"Общество с ограниченной ответственностью " +
                "\\\"Спорт Витал\\\"\",\"VPADRES\":\"г. Минск,ул. Городецкая, д.44, пом. 155А\",\"CKODSOST\":\"1" +
                "\",\"DLIKV\":null}";

        String actual = jsonSimpleParserUrl.parseFromUrl(url).toString();
        assertEquals(expected, actual);

    }

    public void testFillingRow() {
    }

    public void testGetValueFromJsonObject() {
    }
}