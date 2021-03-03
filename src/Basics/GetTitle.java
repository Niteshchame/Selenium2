package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle {

	public static void main(String[] args) {
		String str="Chrome";
		WebDriver driver=null;
		if(str.equals("Chrome"))
		{ 
		  driver=new ChromeDriver();
		  driver.get("http://facebook.com");
		  
		}
		else if(str.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		    driver.get("http://facebook.com");
		}
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
