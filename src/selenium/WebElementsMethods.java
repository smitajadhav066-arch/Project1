package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementsMethods {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com/");
		WebElement username = d.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement pwd = d.findElement(By.id("password"));
		pwd.sendKeys("secret_sauce");
		WebElement login = d.findElement(By.id("login-button"));
		login.submit();
		WebElement product = d.findElement(By.xpath("//span[@data-test='title']"));
		if (product.isDisplayed()) {
			System.out.println("login successfully!! products displayed properly");
		} else {
			System.out.println("login failed!!");
		}

		WebElement addtocartbtn = d.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		if (addtocartbtn.isEnabled()) {
			System.out.println("login successfully!! add to cart button is enabled");
		} else {
			System.out.println("add to cart button is not enabled");
		}
		WebElement filter = d.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select s=new Select(filter);
		String selectoption=s.getFirstSelectedOption().getText();
		if (selectoption.contains("Name")) {
			System.out.println("Name and Price filter working properly");
		} else {
			System.out.println("Name and Price filter not working properly");
		}
		d.quit();

	}

}
