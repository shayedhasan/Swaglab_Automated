package SwagLab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class But_a_Product {

	public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriverManager.firefoxdriver().setup();
			WebDriverManager.edgedriver().setup();
			
			//Get the website
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(1000);
			
			//select the email and send keys 
			WebElement element = driver.findElement(By.id("user-name"));
			element.sendKeys("standard_user");
			Thread.sleep(500);
			
			//select the Password and send keys 
			element = driver.findElement(By.id("password"));
			element.sendKeys("secret_sauce");
			Thread.sleep(500);
			
			//Click Login Button
			element = driver.findElement(By.id("login-button"));
			element.click();
			Thread.sleep(1000);
			
			//Click the add to cart button
			element = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
			element.click();
			Thread.sleep(1000);
			
			//Explore Add to card
			element = driver.findElement(By.className("shopping_cart_container"));
			element.click();
			Thread.sleep(1000);
			
			//Checkout
			element = driver.findElement(By.className("checkout_button"));
			element.click();
			Thread.sleep(1000);
		
			
			//First Name
			element = driver.findElement(By.xpath("//input[@id='first-name']"));
			element.sendKeys("Shayed");
			Thread.sleep(1000);
			
			//Last name
			element = driver.findElement(By.xpath("//input[@id='last-name']"));
			element.sendKeys("Hasan");
			Thread.sleep(500);
			
			//Postal Code
			element = driver.findElement(By.xpath("//input[@id='postal-code']"));
			element.sendKeys("6500");
			Thread.sleep(500);
			
			//Click Continue
			element = driver.findElement(By.xpath("//input[@id='continue']"));
			element.click();
			Thread.sleep(1000);
			
			//Click Finish
			element = driver.findElement(By.id("finish"));
			element.click();
			Thread.sleep(1000);
			
	
			//Back to Home
			element = driver.findElement(By.id("back-to-products"));
			element.click();
			//Wait 5 second 
			Thread.sleep(2000);
			
			//Exit
			driver.close();
			
			
			
			
			
	}

}
