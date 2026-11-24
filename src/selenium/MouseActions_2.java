package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/simple_context_menu.html");
		d.manage().window().maximize();
		WebElement w=d.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(d);
		act.contextClick(w).perform();
		WebElement editOption = d.findElement(By.cssSelector(".context-menu-icon-copy"));
        editOption.click();
        d.switchTo().alert().accept();
        Thread.sleep(2000);
        WebElement doubleclick= d.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        act.doubleClick(doubleclick).perform();
        Thread.sleep(2000);
        d.switchTo().alert().accept();
        d.quit();
        

	}

}
