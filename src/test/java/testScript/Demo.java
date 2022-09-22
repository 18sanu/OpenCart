package testScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo {

	public static void main(String[] args) throws MalformedURLException {
DesiredCapabilities cap=new DesiredCapabilities();
		
		//common capability of android
		
		cap.setCapability("deviceName", "moto e40");
		cap.setCapability("udid","ZD22242NXY" );
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "11");
		
		//capability of app
		cap.setCapability("appPackage","com.google.android.calculator");
		cap.setCapability("appActivity","com.android.calculator2.Calculator");
		
		//Appium server url
		
	  URL url=new URL("http://localhost:4723/wd/hub");
	  
	  AndroidDriver driver = new AndroidDriver(url, cap);
	   TouchActions action=new TouchActions(driver);
	   

	}

}
