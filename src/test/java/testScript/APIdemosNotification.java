package testScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import GenericUtility.MobileDriverUtility;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class APIdemosNotification {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
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
				m.implicitWait();
				m.uiSelectorText("App").click();
			    m.uiSelectorText("Notification").click();
			    m.uiSelectorText("IncomingMessage").click();
		    	m.uiSelectorContentDesc("Show App Notification").click();
		    	m.openNotification();
		    	Thread.sleep(2000);
		    	System.out.println(m.readNotificationsTitle().get(0).getText());
		    	Thread.sleep(2000);
		    	System.out.println(m.readNotificationsText().get(0).getText());

	}}
