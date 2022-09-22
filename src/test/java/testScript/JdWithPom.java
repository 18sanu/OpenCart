package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PomRepository.JdPom;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class JdWithPom {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
      DesiredCapabilities cap=new DesiredCapabilities();
      cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
      cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
      cap.setCapability(MobileCapabilityType.UDID,"ZD22242NXY");
      cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto e40");
      cap.setCapability("appPackage", "com.justdial.search");
      cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
  	cap.setCapability("appActivity", ".SplashScreenNewActivity");
  	URL url = new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,cap);
	JdPom j = new JdPom(driver);
	j.getAgreebtn().click();
	Thread.sleep(2000);
	j.getSkipbtn().click();
	cWait(driver,j.getCancelBtn());
	j.getCancelBtn().click();
	
	Thread.sleep(3000);
	Dimension dimension = driver.manage().window().getSize();
	int x=dimension.getWidth()/2;
	int y=(int)(dimension.getHeight()*0.1);
	int y2=(int)(dimension.getHeight()*0.9);
	scroll(driver,x,y2, x, y);
	Thread.sleep(2000);
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollTextIntoView(\"Hotel & Stay\")"));
	Thread.sleep(2000);
	WebElement tophotel = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.justdial.search:id/recycler_view\").scrollable(true)).setAsHorizontalList().scrollTextIntoView(\"Top Hotels\")"));
Thread.sleep(3000);
driver.findElement(By.xpath("//android.widget.TextView[@text='Top Hotels']")).click();
Thread.sleep(6000);
driver.findElementByXPath("//android.widget.TextView[@text='The Leela Palace']").click();
Thread.sleep(5000);
driver.findElementByXPath("//android.widget.TextView[@resource-id='com.justdial.search:id/tvCount']").click();
Thread.sleep(5000);
driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.NumberPicker\").scrollable(true)).scrollTextIntoView(\"3\")"));
Thread.sleep(1000);
driver.findElementById("com.justdial.search:id/okButton").click();


	}
	
	
	
	
	public static void cWait(AndroidDriver driver,MobileElement element) {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void scroll(AndroidDriver driver,MobileElement element,int x2,int y2) throws InterruptedException {
		TouchAction t=new TouchAction(driver);
		t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(element))).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(x2, y2)).perform().release();
	   Thread.sleep(2000);
		System.out.println("method executed");
	}
	public static void scroll(AndroidDriver driver,int x1,int y1,int x2,int y2) throws InterruptedException {
		TouchAction t=new TouchAction(driver);
		t.press(PointOption.point(x1, y1)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(x2, y2)).release().perform();
		Thread.sleep(2000);
		System.out.println("method executed");
	}
    public static void scrollIntoView(AndroidDriver driver,String text) {
    	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollTextIntoView("+text+")")).click();
    }
}
