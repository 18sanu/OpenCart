package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedSet;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class JdWeb {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability(MobileCapabilityType.UDID, "ZD22242NXY");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\n\\eclipse-workspace101\\OpenCart\\src\\test\\resources\\chromedriver_win32_v102.0.5005.61.exe");
		cap.setCapability("chromeOptions", ImmutableMap.of("w3c",false));
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(url,cap);
		Thread.sleep(2000);
		driver.get("https://www.justdial.com/");
		driver.context("NATIVE_APP");
	    driver.findElement(By.xpath(".//android.widget.Button[@text='Allow']")).click();
		
		
		

	}

}
