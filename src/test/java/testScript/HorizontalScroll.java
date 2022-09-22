package testScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class HorizontalScroll {

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
				driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/list\")).scrollIntoView(new UiSelector().text(\"Tabs\"))")).click();
				driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"5. Scrollable\")")).click();
                driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/tabs\")).setAsHorizontalList().scrollTextIntoView(\"TAB 28\")")).click();
	}

}
