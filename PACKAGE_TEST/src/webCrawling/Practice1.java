package webCrawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Practice1 {

	public static void main(String[] args) {
		System.out.println("running...");
		Document doc1;
		String url = "https://news.google.com/topstories?hl=en-US&gl=US&ceid=US:en";
		try {
			doc1 = Jsoup.connect(url).get();
			Elements tag = doc1.select(".DY5T1d");
			for(Element val : tag) {
				System.out.println(val.text());
			}
			
			String title = doc1.title();
			print("Title: " + title);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("done");
	}
	
	public static void print(String str) {
		System.out.println(str);
	}
}
