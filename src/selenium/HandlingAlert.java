package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		d.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert=d.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();//simple alert : ok option
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		d.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		System.out.println(alert.getText());
		alert.dismiss();
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		d.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		alert.sendKeys("Automation Tester");
		System.out.println(alert.getText());
		alert.accept();
		
	}

}
