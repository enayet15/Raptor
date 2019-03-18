package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LoginChromeSmartCard {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "C:\\AutomationTools\\driver\\chromedriver.exe");
			DesiredCapabilities capabilities= DesiredCapabilities.chrome();
			capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS	, true);
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS	, true);
					
			   
		       WebDriver driver=new ChromeDriver(capabilities);
		      // driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.navigate().to("https://gaia.stage.hq.nasa.gov/raptor/");
			
			driver.navigate().to("https://enayat:test@auth.launchpad-sbx.nasa.gov/kv/unauth/iwa20.fcc");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			driver.findElement(By.cssSelector("#AUID-desktop")).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebElement userid= driver.findElement(By.id("USER1"));
			//driver.findElement(By.id("USER1")).sendKeys("mhkhan");
			userid.sendKeys("mhkhan");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebElement password= driver.findElement(By.id("PASSWORD1"));
			password.sendKeys("Aani12345!@#zxc90");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebElement login= driver.findElement(By.xpath(".//*[@id='AUID-form']/div/form/fieldset/div[2]/div/input"));
			login.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.navigate().to("https://gaia.stage.hq.nasa.gov/raptor/");
			
			
			
		}

	}
