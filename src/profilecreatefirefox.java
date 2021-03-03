import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

@SuppressWarnings("deprecation")
public class profilecreatefirefox {

	public static void main(String[] args) 
	{
		ProfilesIni firepro =new ProfilesIni();
		FirefoxProfile profile= firepro.getProfile("nitesh");
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		WebDriver driver =new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://cyberdroid.biz/vtiger");

	}

}
