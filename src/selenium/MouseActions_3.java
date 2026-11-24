package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demoqa.com/menu/");
		d.manage().window().maximize();
		WebElement scroll=d.findElement(By.xpath("//h1[@class='text-center']"));
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].scrollIntoView();",scroll);
		WebElement w=d.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
		Actions act=new Actions(d);
		act.moveToElement(w).perform();
		WebElement w1=d.findElement(By.xpath("//a[normalize-space()='SUB SUB LIST »']"));
		act.moveToElement(w1).perform();
		WebElement w2=d.findElement(By.xpath("//a[normalize-space()='Sub Sub Item 2']"));
		act.moveToElement(w2).perform();
		Thread.sleep(2000);
		d.quit();
	}

}
