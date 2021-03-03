import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
	    driver.get("http:\\facebook.com");
	    driver.findElement(By.id("email")).sendKeys("chamenitesh2@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("Nick@1996");
	    driver.findElement(By.id("loginbutton")).click();
	    
	}

}
