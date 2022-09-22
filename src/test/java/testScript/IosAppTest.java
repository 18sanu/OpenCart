package testScript;

import java.awt.RenderingHints.Key;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.windows.PressesKeyCode;

public class IosAppTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	   	DesiredCapabilities caps = new DesiredCapabilities();
	    	
	    	// Set your access credentials
	    	caps.setCapability("browserstack.user", "sanusingh_omUFX4");
	    	caps.setCapability("browserstack.key", "o5wzy2kq8Axypi3iyrZ3");
	    
	    	// Specify device and os_version for testing
	        caps.setCapability("device", "iPhone 12");
	        caps.setCapability("os_version", "14"); 
	        
	    	// Set other BrowserStack capabilities
	    	caps.setCapability("project", "First  Project");
	    	caps.setCapability("build", "browserstack-build-1");
	    	caps.setCapability("name", "first_test");
	    	caps.setCapability("browser","chrome");
	    	caps.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, true);
	    	
	 
	        IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(
	        		new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);
	        Thread.sleep(3000);
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        driver.get("https://www.justdial.com/");
	        System.out.println("executed");
	         Thread.sleep(4000);   
	        
	     	 Set<String> handles = driver.getContextHandles(); 
			 for (String str : handles)
			 { 
				 if (str.contains("WEBVIEW")) { 
					 driver.context(str);
					 break;
			   }
			}
		
			driver.findElement(By.xpath("//img[@alt='Travel']")).click();
			driver.findElement(By.xpath("//span[text()='Bus']")).click();
			IOSElement bang = driver.findElement(By.id("leaving_from"));
			bang.click();
			bang.clear();
			bang.sendKeys("Bangalore");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Bangalore")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("going_to")).click();
			driver.findElement(By.id("going_to")).sendKeys("goa");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Goa")).click();
			driver.findElement(By.id("calnshow")).click();
			driver.findElement(By.xpath("//span[text()='June']/ancestor::div[@class='ui-datepicker-group ui-datepicker-group-first']/descendant::a[text()='24']")).click();
			driver.findElement(By.id("search_buses")).click();
			Thread.sleep(3000);
		//	List<IOSElement> buslist = driver.findElements(By.xpath("//div[@class='turnm']"));
	         JavascriptExecutor js = (JavascriptExecutor)driver;
	 		IOSElement busName = driver.findElement(By.xpath("//div[contains(text(),'VRL')]/child::span[text()='NON A/C Seater / Sleeper (2+1)']"));	
             js.executeScript("arguments[0].scrollIntoView(true);", busName);
	     	busName.click();
	        driver.quit();
	   
	        
		}
	

}
//   Runtime.getRuntime().exec(null)
