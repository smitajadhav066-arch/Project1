package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotcode {

	public static void main(String[] args) throws IOException, InterruptedException {
//		WebDriver d=new ChromeDriver();
		WebDriver d=new FirefoxDriver();
		d.get("https://www.mxplayer.in/");
		d.manage().window().maximize();
		File source=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File("C:\\Users\\Admin\\OneDrive\\Documents\\files\\pic1.png"));
		System.out.println("done!!");
		Thread.sleep(2000);
		d.quit();
		
		;

	}

}
