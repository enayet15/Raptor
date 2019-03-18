package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Ram_login {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\AutomationTools\\driver\\geckodriver.exe");
		
				
		   ProfilesIni profile = new ProfilesIni();
	       FirefoxProfile ffProfile = profile.getProfile("default"); 
	       ffProfile.setAcceptUntrustedCertificates(true);
	       ffProfile.setAcceptUntrustedCertificates(false);
	       WebDriver driver=new FirefoxDriver(ffProfile);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://hqjazzram01.ndc.nasa.gov:9443/ram");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		/*WebElement agencyId= driver.findElement(By.xpath(".//*[@id='AUID-desktop']"));
		agencyId.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		
		WebElement userid= driver.findElement(By.xpath(".//*[@id='username']"));
		//driver.findElement(By.id("USER1")).sendKeys("mhkhan");
		userid.sendKeys("mhkhan");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement password= driver.findElement(By.xpath(".//*[@id='password']"));
		password.sendKeys("Aani12345!@#zxc09");
		//password.sendKeys(decrypt("bWtEybyzFHIS1GeteywMe8Aq1fXuULez5Wd5qUJnlYA="));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement login= driver.findElement(By.xpath(".//*[@id='loginFormFragment:loginButton']"));
		login.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Assets= driver.findElement(By.xpath(".//*[@id='navigation-tabs']/ul/li[4]/a"));
		Assets.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		
	}

	

}



