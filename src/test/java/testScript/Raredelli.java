package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Raredelli {
 static	AndroidDriver driver; 
	public static List<WebElement> getitem() {
    	 return driver.findElementsByAccessibilityId("62cd35586c0e5a468e07e782");
     }
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//AppiumDriverLocalService service=AppiumDriverLocalService.buildDefaultService();
		//service.start();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		cap.setCapability(MobileCapabilityType.UDID, "ZD22242NXY");
		cap.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability("appPackage","com.myntra.android");
		cap.setCapability("appActivity", ".SplashActivity");
		cap.setCapability("noReset", true);
		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         TouchAction action=new TouchAction(driver);
       //   WebElement hamburgerbtn = driver.findElementByAccessibilityId("leftElement");
	     //action.tap(TapOptions.tapOptions().withElement(ElementOption.element(hamburgerbtn))).perform();
	    //  WebElement arrow = driver.findElementByXPath("//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[2]");
	     // action.tap(TapOptions.tapOptions().withElement(ElementOption.element(arrow))).perform(); 
	     //driver.findElementByAccessibilityId("mobile").sendKeys("8709988407");
	    // driver.findElementByAccessibilityId("form-button").click();
	     
	   //  int h = driver.manage().window().getSize().getHeight();
	   //  int w=driver.manage().window().getSize().getWidth()/2;
	    // int he=(int)(h*0.1);
	    
	    
	    // while(getitem().size()==0) {
	    //	 action.press(PointOption.point(w, h/2)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(w, he)).release().perform();
	  //  Thread.sleep(200);	 
	  //   }
	     
	      //service.stop();
	    driver.findElementByAccessibilityId("tabButton_profile").click();
	    driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"User Image\"]/android.widget.ImageView")).click();
	    driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"User Image\"])[2]/android.widget.ImageView")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]")).click();
	  //  driver.findElementByXPath("com.myntra.android:id/ll_mode_gallery").click();
	    driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"IMG-20220727-WA0000.jpg, 123 kB, 27 Jul\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView").click();
	    driver.findElement(By.xpath("com.myntra.android:id/btn_done")).click();
	}

}
