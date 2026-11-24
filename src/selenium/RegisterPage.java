package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("C:\\Users\\Admin\\OneDrive\\Pictures\\134085538691894151.jpg");
		d.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("John");
		d.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("May");
		d.findElement(By.xpath("//textarea[@ng-model='Adress']"))
				.sendKeys("Street:  Gala 2, Bharbhekar Nagar, Charkop, Opp Sejal Glass Work, Kandivali (west)");
		d.findElement(By.xpath("//input[@type='email']")).sendKeys("john11@gmail.com");
		d.findElement(By.xpath("//input[@type='tel']")).sendKeys("98696216566");
		d.findElement(By.xpath("//input[@value='Male']")).click();
		d.findElement(By.xpath("//input[@id='checkbox1']")).click();
		d.findElement(By.xpath("//input[@id='checkbox2']")).click();
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,400)");
		d.findElement(By.id("msdd")).click();
		d.findElement(By.xpath("//a[text()='English']")).click();
		d.findElement(By.xpath("//a[text()='Italian']")).click();
		WebElement skills=d.findElement(By.xpath("//select[@id='Skills']"));
		Select s=new Select(skills);
		s.selectByVisibleText("Java");
		d.findElement(By.xpath("//span[@role='combobox']")).click();
		d.findElement(By.xpath("//input[@type='search']")).sendKeys("India");
		d.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
		WebElement year=d.findElement(By.xpath("//select[@id='yearbox']"));
		Select s1=new Select(year);
		s1.selectByValue("1991");
		WebElement month=d.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s2=new Select(month);
		s2.selectByValue("October");
		WebElement day=d.findElement(By.xpath("//select[@id='daybox']"));
		Select s3=new Select(day);
		s3.selectByValue("23");
		d.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("john123");
		d.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("john123");
		d.findElement(By.xpath("//button[@id='submitbtn']")).click();
		d.findElement(By.xpath("//button[@id='Button1']")).click();
		d.quit();
	}

}
