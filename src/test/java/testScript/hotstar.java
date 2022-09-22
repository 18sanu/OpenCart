package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import GenericUtility.MobileDriverUtility;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class hotstar {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		 DesiredCapabilities cap=new DesiredCapabilities();
	      cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
	      cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
	      cap.setCapability(MobileCapabilityType.UDID,"ZD22242NXY");
	      cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
	      cap.setCapability("appPackage", "in.startv.hotstar");
	      cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
	      
	      cap.setCapability(MobileCapabilityType.NO_RESET, true);
	  	cap.setCapability("appActivity",".rocky.launch.splash.SplashActivity");
	  	URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		MobileDriverUtility m = new MobileDriverUtility(driver);
		
		Thread.sleep(10000);
	
		String des="Best in Sports";
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\""+des+"\"))"));
		Thread.sleep(2000);
		String desc="All Goals: India vs New Zealand"; 
		driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true).instance(2)).setAsHorizontalList()" +
			         ".scrollIntoView(new UiSelector().description(\""+desc+"\"))"));
	}

}
