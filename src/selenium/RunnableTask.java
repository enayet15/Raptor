package selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class RunnableTask implements Runnable {
	public void run() {

	    try {
	    	
	    	// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "C:\\AutomationTools\\driver\\chromedriver.exe");
			DesiredCapabilities capabilities= DesiredCapabilities.chrome();
			capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS	, true);
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS	, true);
					
			   
		       WebDriver driver=new ChromeDriver(capabilities);
		       
		       String url = "https://shop4nasa.test.hq.nasa.gov/";
		   	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		       
		      // String url = "https://shop4nasa.test.hq.nasa.gov/";
		      // driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.navigate().to("https://gaia.stage.hq.nasa.gov/raptor/");
		
   
		       
			//driver.navigate().to("https://enayat:test@auth.launchpad-sbx.nasa.gov/kv/unauth/iwa20.fcc");
			driver.navigate().to(url);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//driver.findElement(By.xpath("#//a[contains(text(),'Login')]")).click();
			
			
			driver.findElement(By.cssSelector("#SMARTCARD-desktop")).click();		
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			System.out.println("Click - Smartcard Log In button");
			
			//driver.findElement(By.cssSelector("#SCLOGIN")).click();
			
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		  
			} catch (Exception e) {
		          e.printStackTrace();
		       }
	}
}