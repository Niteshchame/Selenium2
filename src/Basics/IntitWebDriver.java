package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IntitWebDriver {

	public static void main(String[] args) {
		String str="Chrome";
		if(str.equals("Chrome"))
		{
			WebDriver driver=new ChromeDriver();
			driver.get("http://facebook.com");
			driver.quit();
		}
		else if(str.equals("Firefox"))
		{
			WebDriver driver=new FirefoxDriver();
			driver.get("http://facebook.com");
			driver.quit();
		}
		

	}

}
