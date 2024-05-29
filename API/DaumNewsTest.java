package API;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class DaumNewsTest {
    public static void main(String[] args) throws IOException {
        String url = "https://news.daum.net/?nil_profile=mini&nil_src=news";
        Document document = Jsoup.connect(url).get();
        //System.out.println(document.text());
        Elements elements = document.select(".list_newsissue");
        //System.out.println(elements.size());
        //for(Element e : elements){
        //    System.out.println(e.text());
        //}
        Element element = elements.get(0);
        Elements links = element.select(".link_txt");
        System.out.println(links.size());
        for(Element e : links){
            System.out.println(e.text());
        }
    }
}
