package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class JustDialAPP {
	static TouchAction action;
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
	cap.setCapability(MobileCapabilityType.UDID, "ZD22242NXY");
	cap.setCapability("autoGrantPermissions",true);
	cap.setCapability("appPackage", "com.justdial.search");
	cap.setCapability("appActivity", ".SplashScreenNewActivity");
	URL url = new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,cap);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElementById("terms_accept_btn").click();
	driver.findElementById("button_skip").click();
	
	cWait(driver,(MobileElement) driver.findElementByXPath("//android.widget.Button[@text=\"CANCEL\"]"));
	
	driver.findElementByXPath("//android.widget.Button[@text=\"CANCEL\"]").click();
	
	driver.findElementByXPath("//android.widget.TextView[@text=\"Travel\"]").click();

	driver.findElementByXPath("//*[@text='Bus']").click();
	driver.findElementById("FromEditText").click();
	Thread.sleep(1000);
	
	
	
	WebElement selectCityTextBox = driver.findElement(By.id("com.justdial.search:id/search_edit_text_flight"));
	selectCityTextBox.sendKeys("Bangalore");
	//driver.pressKeyCode(AndroidKeyCode.ENTER);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Bangalore']")).click();

	driver.findElement(By.id("com.justdial.search:id/ToEditText")).click();

	driver.findElement(By.id("com.justdial.search:id/search_edit_text_flight")).sendKeys("Hyderabad");
    Thread.sleep(2000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Hyderabad']")).click();

	Thread.sleep(4000);
	driver.findElement(By.id("com.justdial.search:id/DepartureEditText")).click();

	int ldt = LocalDate.now().plusDays(3).getDayOfMonth(); // we r using .getDayOfMont to fetch only day , because if dont use it will display full date format

	driver.findElement(By.xpath("//android.widget.TextView[@text='"+ldt+"']")).click();
	driver.findElement(By.id("com.justdial.search:id/searchbus_button")).click();
	Thread.sleep(10000);
	System.out.println(driver.getContext());
	

    driver.findElement(By.xpath("//android.view.View[@resource-id='busStation']")).click();
	Thread.sleep(4000);

	driver.findElement(By.xpath("(//android.widget.TextView[contains(@resource-id,'lseat')and @clickable='true'])[4]")).click();

	driver.findElement(By.xpath("//android.widget.Button[@text='Book']")).click();

	Thread.sleep(2000);
	
        action = new TouchAction(driver);

       action.tap(PointOption.point(54,666)).perform();
       action.tap(PointOption.point(430,1330)).perform();
       action.tap(PointOption.point(54,666)).perform();
       action.tap(PointOption.point(430,1330)).perform();
       driver.findElementById("continuesas").click();
   //    driver.findElementById("registration_name").sendKeys("sanu");
     //  driver.findElementById("registration_phone_number_value").sendKeys("8709988407");
       //driver.findElementById("continuesas").click();
       //driver.findElementByXPath("//android.widget.EditText[@resource-id='tEmail']").sendKeys("18sanu.k0@gmail.com");
       //driver.findElementById("confirm_user").click();
       driver.findElementByXPath("(//android.view.View[contains(@text,'Mr')])[1]").click();
       driver.findElementByXPath("//*[@resource-id='fname_0']").sendKeys("kumar");
       driver.findElementByXPath("//*[@resource-id='lname_0']").sendKeys("sanu");
       driver.findElementByXPath("//android.widget.Spinner[contains(@resource-id,'dob')]").click();
       driver.findElementByXPath("//android.widget.TextView[@resource-id='android:id/date_picker_header_year']").click();
       driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/date_picker_year_picker\")).scrollToBeginning(10,2)"));
       Thread.sleep(1000);
       
      while(true) {
       try {
           driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"1996\")")).click();
    	  break; 
       }
       catch(Throwable e) {
       action.press(PointOption.point(504, 1060)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(504,578)).release().perform();
       }
      }
}

public static void cWait(AndroidDriver driver,MobileElement element) {
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(element));
}
}
