import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class editionpage {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
        driver.get("http://edition.cnn.com");
        WebElement linkText = driver.findElement(By.xpath("//a[@ class='link-banner']h2"));
        String text = linkText.getText();
        System.out.println(text);
        //System.out.println(driver.findElement(By.xpath("//a[@class='link banner']/h2")).getText();
        driver.quit();
	}

}
