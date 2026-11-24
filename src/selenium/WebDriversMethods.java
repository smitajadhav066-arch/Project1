package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriversMethods {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.youtube.com/");
		String title=d.getTitle();
		System.out.println(title);
		String url=d.getCurrentUrl();
		System.out.println(url);
		String code=d.getPageSource();
		System.out.println(code);
		d.quit();

	}

}
