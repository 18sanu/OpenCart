package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;

public class JDselectCity {
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
		Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@alt='Travel']")).click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			IOSElement sing = driver.findElement(By.xpath("//div[text()='Singapore']"));
			js.executeScript("arguments[0].scrollIntoView(true)", sing);
			Thread.sleep(2000);
			sing.click();
			
}
}
