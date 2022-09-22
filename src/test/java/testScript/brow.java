package testScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class brow {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("browserstack.user", "sanusingh_omUFX4");
    	caps.setCapability("browserstack.key", "o5wzy2kq8Axypi3iyrZ3");
    	caps.setCapability("name", "demo");
    	// Set URL of the application under test
    	caps.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
    	
    	// Specify device and os_version for testing
        caps.setCapability("device", "Xiaomi Redmi Note 7");
        caps.setCapability("os_version", "9.0");
        
    	
    	// Initialise the remote Webdriver using BrowserStack remote URL
    	// and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
        		new URL("http://hub.browserstack.com/wd/hub"), caps);
        System.out.println("launched");
	}

}
