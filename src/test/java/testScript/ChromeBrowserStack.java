package testScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;

public class ChromeBrowserStack {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	   	DesiredCapabilities caps = new DesiredCapabilities();
	    	
	    	// Set your access credentials
	    	caps.setCapability("browserstack.user", "sanusingh_omUFX4");
	    	caps.setCapability("browserstack.key", "o5wzy2kq8Axypi3iyrZ3");
	    	
	    	// Set URL of the application under test
	    //	caps.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");
	    	
	    	// Specify device and os_version for testing
		    caps.setCapability("device", "iPhone 13 Pro");
	        caps.setCapability("os_version", "15");
	        caps.setCapability(IOSMobileCapabilityType.BROWSER_NAME, "chrome");
	    
	        
	    	// Set other BrowserStack capabilities
	    	caps.setCapability("project", "Second Java Project");
	    	caps.setCapability("build", "browserstack-build-1");
	    	caps.setCapability("name", "first_test");
	    	
	    	
	    	// Initialise the remote Webdriver using BrowserStack remote URL
	    	// and desired capabilities defined above
	        IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(
	        		new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);
	        driver.get("https://www.justdial.com/");
	        
	        // Test case for the BrowserStack sample iOS app. 
	        // If you have uploaded your app, update the test case here. 
	       
	    
	        // Invoke driver.quit() after the test is done to indicate that the test is completed.
	        driver.quit();
		}
	}


