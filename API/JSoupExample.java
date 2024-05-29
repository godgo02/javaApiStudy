package API;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JSoupExample {
    public static void main(String[] args) throws IOException {
        String url = "https://sum.su.or.kr:8888/bible/today";
        Document document = Jsoup.connect(url).get();

        Element bibleTest = document.getElementById("bible_text");
        Element bibleinfoBox = document.getElementById("bibleinfo_box");
        System.out.println(bibleTest.text());
        System.out.println(bibleinfoBox.text());

        Elements numElements = document.select(".num");
        Elements infoElements = document.select(".info");

        for(int i =0;i< numElements.size();i++){
            System.out.println(numElements.get(i).text()+":"+
                    infoElements.get(i).text());
        }
    }
}
