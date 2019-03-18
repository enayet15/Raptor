package selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\AutomationTools\\driver\\geckodriver.exe");
		
				
		   ProfilesIni profile = new ProfilesIni();
	       FirefoxProfile ffProfile = profile.getProfile("default"); 
	       ffProfile.setAcceptUntrustedCertificates(true);
	       ffProfile.setAcceptUntrustedCertificates(false);
	       WebDriver driver=new FirefoxDriver(ffProfile);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://gaia.stage.hq.nasa.gov/raptor/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement agencyId= driver.findElement(By.xpath(".//*[@id='AUID-desktop']"));
		agencyId.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement userid= driver.findElement(By.id("USER1"));
		//driver.findElement(By.id("USER1")).sendKeys("mhkhan");
		userid.sendKeys("mhkhan");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement password= driver.findElement(By.id("PASSWORD1"));
		password.sendKeys("Aani12345!@#zxc99");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement login= driver.findElement(By.xpath(".//*[@id='AUID-form']/div/form/fieldset/div[2]/div/input"));
		login.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}

}
