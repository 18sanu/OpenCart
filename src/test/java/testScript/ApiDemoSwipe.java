package testScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemoSwipe {

	public static void main(String[] args) throws MalformedURLException {
DesiredCapabilities cap=new DesiredCapabilities();
cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
cap.setCapability(MobileCapabilityType.UDID, "ZD22242NXY");
cap.setCapability(MobileCapabilityType.NO_RESET, true);
	cap.setCapability("appPackage","io.appium.android.apis");
		cap.setCapability("appActivity",".ApiDemos");
		 URL url=new URL("http://localhost:4723/wd/hub");
		//for opening the app
		AndroidDriver driver = new AndroidDriver(url, cap);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Views\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Gallery\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"1. Photos\")")).click();
		WebElement gallery =  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"io.appium.android.apis:id/gallery\")"));
		System.out.println(gallery.getRect().getWidth());
		System.out.println(gallery.getRect().getY());
		System.out.println(gallery.getRect().getHeight());
		WebElement photo = driver.findElementByXPath("//android.widget.LinearLayout/android.widget.Gallery/android.widget.ImageView[3]");
	   int h = driver.manage().window().getSize().getHeight();
	   int w = driver.manage().window().getSize().getWidth();
	   System.out.println(h+" " +w);
	
		}
		
		
        

	}

