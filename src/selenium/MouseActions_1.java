package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions_1{

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Static.html");
		d.manage().window().maximize();
		WebElement element=d.findElement(By.id("angular"));
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].scrollIntoView();",element);
		WebElement a=d.findElement(By.id("angular"));
		WebElement b=d.findElement(By.id("droparea"));
		Actions act=new Actions(d);
//		act.dragAndDrop(a, b).perform();
		act.clickAndHold(a).release(b).perform();
		
		d.get("https://demo.automationtesting.in/Dynamic.html");
		WebElement element1=d.findElement(By.id("angular"));
		js.executeScript("arguments[0].scrollIntoView();",element1);
		WebElement x=d.findElement(By.id("angular"));
		WebElement y=d.findElement(By.id("droparea"));
		act.dragAndDrop(x,y).perform();
		
		
	}

}
