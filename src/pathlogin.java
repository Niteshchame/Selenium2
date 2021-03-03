import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pathlogin {

	public static void main(String[] args) throws InterruptedException 
	{ 
		WebDriver driver =new ChromeDriver();
		driver.get("http\\paytm.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div[2]/div/header/div/a")).click();

	}

}
