package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Basics {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://Facebook.com");		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}

}
