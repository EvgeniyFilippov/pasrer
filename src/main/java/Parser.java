import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Parser {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://www.court.gov.by/ru/public/orderproduction/orderproduction/?court=155&start=20.02.2021&end=26.02.2021/")
                .userAgent("Chrome/4.0.249.0 Safari/532.5")
                .referrer("http://www.google.com")
                .get();
        Elements listNews = doc.select("div.text.h-ugc");
        System.out.println(listNews);
    }
}
