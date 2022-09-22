package testScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class ApiDemoSeekBAR {

	public static void main(String[] args) throws MalformedURLException {
	   DesiredCapabilities cap = new DesiredCapabilities();
	   cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "android");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "11");
	cap.setCapability(MobileCapabilityType.UDID,  "ZD22242NXY");
	cap.setCapability(MobileCapabilityType.NO_RESET, true);
	cap.setCapability("appPackage","io.appium.android.apis");
	cap.setCapability("appActivity",".ApiDemos");
	URL url = new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,cap);
	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Views\")")).click();

	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/list\")).scrollIntoView(new UiSelector().text(\"Seek Bar\"))")).click();
    WebElement seekbar = driver.findElementById("io.appium.android.apis:id/seek");
	TouchAction action=new TouchAction(driver);
	action.press(ElementOption.element(seekbar)).waitAction().moveTo(PointOption.point(680,180)).release().perform();
	
	}

}
