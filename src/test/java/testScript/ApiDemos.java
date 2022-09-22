package testScript;

import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import GenericUtility.MobileDriverUtility;
import GenericUtility.MobileDriverUtility.Direction;
import io.appium.java_client.LocksDevice;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.ios.ShakesDevice;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.windows.PressesKeyCode;

public class ApiDemos {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	//AppiumDriverLocalService service=AppiumDriverLocalService.buildDefaultService();
	//service.start();
		
		AppiumDriverLocalService server = AppiumDriverLocalService.buildDefaultService();
		//server.start();
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
		
		MobileDriverUtility m = new MobileDriverUtility(driver);
		
		
		MobileElement views =m.uiSelectorText("Views");
		m.tapOnElement(views);
		Thread.sleep(2000);
	   m.swipeScreenSmall(Direction.UP);
		
		
	}

}
