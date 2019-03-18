package selenium;

import java.awt.event.KeyEvent;

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
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class loginChrome extends RunnableTask {
	
	
	
		public static void main(String[] args) {
			
			
					 try {
				 System.out.println("In try loop");
				 
				 
				   Thread mthread = new Thread(new RunnableTask());
				   mthread.start();


			    	  System.out.println("Thread started. Creating robot.");
					   Robot robot = new Robot();

					    robot.setAutoDelay(40);
					    robot.setAutoWaitForIdle(true);
					    
					    // This sleep time is important. Set as per required to stop from ENTER 
					    // being hit too early.
					    Thread.sleep(20000);
					    System.out.println("Attempting Enter Key Press");
						
					  robot.keyPress(KeyEvent.VK_ENTER);
					  robot.keyRelease(KeyEvent.VK_ENTER);
					  
					  robot.delay(1000);
					  
					  robot.keyPress(KeyEvent.VK_5);
					  robot.keyPress(KeyEvent.VK_6);
					  robot.keyPress(KeyEvent.VK_5);
					  robot.keyPress(KeyEvent.VK_4);
					  robot.keyPress(KeyEvent.VK_5);
					  robot.keyPress(KeyEvent.VK_8);
					  robot.keyPress(KeyEvent.VK_8);
					  robot.delay(1000);
					  robot.keyPress(KeyEvent.VK_ENTER);
					  robot.keyRelease(KeyEvent.VK_ENTER);
					  
					
				 } catch (Exception e) {
				          e.printStackTrace();
				 }
			
//			WebElement userid= driver.fin
				//	 dElement(By.id("USER1"));
//			//driver.findElement(By.id("USER1")).sendKeys("mhkhan");
//			userid.sendKeys("mhkhan");
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			
//			WebElement password= driver.findElement(By.id("PASSWORD1"));
//			/password.sendKeys("Aani12345!@#zxc89");
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			
//			WebElement login= driver.findElement(By.xpath(".//*[@id='AUID-form']/div/form/fieldset/div[2]/div/input"));
//			login.click();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.navigate().to(url);
//			
			
			
			
		}

	}
