package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import GenericUtility.MobileDriverUtility;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class irctc {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		  DesiredCapabilities cap=new DesiredCapabilities();
	      cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
	      cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
	      cap.setCapability(MobileCapabilityType.UDID,"ZD22242NXY");
	      cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
	      cap.setCapability("appPackage", "cris.org.in.prs.ima");
	      cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
	      cap.setCapability(MobileCapabilityType.NO_RESET, true);
	  	cap.setCapability("appActivity","cris.org.in.ima.activities.IRCTCConnectActivity");
	  	URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		MobileDriverUtility m=new MobileDriverUtility(driver);
		driver.findElementById("android:id/button1").click();
        m.uiSelectorText("Login").click();
        m.uiSelectorContentDesc("enter pin").sendKeys("7605");
        Thread.sleep(10000);
        driver.findElementById("cris.org.in.prs.ima:id/tv_login").click();
     //   m.uiSelectorText("LOGIN").click();
        m.uiSelectorText("Train").click();
        m.uiSelectorText("Book Ticket").click();
       m.uiSelectorText("GENERAL").click();
       m.uiSelectorResourceId("cris.org.in.prs.ima:id/tv_item").click();
       m.uiSelectorText("02 Jul").click();
       m.uiSelectorText("SEARCH TRAINS").click();
       
        
	}

}
