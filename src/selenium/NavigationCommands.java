package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.youtube.com/");
		System.out.println(d.getTitle());
		d.navigate().to("https://www.amazon.in/");
		System.out.println(d.getTitle());
		d.navigate().back();
		System.out.println(d.getTitle());
		d.navigate().forward();
		System.out.println(d.getTitle());
		d.navigate().refresh();
		System.out.println(d.getTitle());
		d.quit();
		
		;

	}

}
