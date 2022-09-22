package testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;

public class JDdoctor {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		   	DesiredCapabilities caps = new DesiredCapabilities();
		    	
		    	// Set your access credentials
		    	caps.setCapability("browserstack.user", "sanusingh_omUFX4");
		    	caps.setCapability("browserstack.key", "o5wzy2kq8Axypi3iyrZ3");
		    	
		    	// Set URL of the application under test
		   // 	caps.setCapability("app", "bs://4642b933e8f1c7f323f13ce6b29e3ce4df6f32bb");
		    	
		    	// Specify device and os_version for testing
		        caps.setCapability("device", "iPhone 12");
		        caps.setCapability("os_version", "14");
		        
		    	// Set other BrowserStack capabilities
		    	caps.setCapability("project", "First  Project");
		    	caps.setCapability("build", "browserstack-build-1");
		    	caps.setCapability("name", "first_test");
		    	caps.setCapability("browser","chrome");
		    	caps.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, true);
		    	
		    	
		    	// Initialise the remote Webdriver using BrowserStack remote URL
		    	// and desired capabilities defined above
		        IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(
		        		new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);
		        Thread.sleep(3000);
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		        driver.get("https://www.justdial.com/");
		        Thread.sleep(2000);
		       driver.findElement(By.xpath("//img[@alt='Doctors']")).click();
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//span[text()='Dentists']")).click();
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//div[text()=\"Book Now\"]")).click();
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//div[@class='card-panel card-panel-hospital z-depth-1']")).click();
		      int day = LocalDate.now().plusDays(3).getDayOfMonth();
		      driver.findElement(By.xpath("//span[text()='"+day+"']")).click();
		      Thread.sleep(2000);
		      List<IOSElement> time = driver.findElements(By.xpath("//button[contains(@ng-click,'validateTime')]"));
		        int high = time.size();
		        int low=1;
		        Random random = new Random();
		        int num = random.nextInt(high-low)+low;
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("(//button[contains(@ng-click,'validateTime')])["+num+"]")).click();
		        Thread.sleep(2000);
		      driver.findElement(By.xpath("//label[contains(@class,'checkBox')]")).click();
		      Thread.sleep(2000);
		      driver.findElement(By.id("patientName")).sendKeys("sanu");
		      Thread.sleep(2000);
		      driver.findElement(By.id("patientMobile")).sendKeys("9204567632");
		      Thread.sleep(2000);
		      driver.findElement(By.id("btValidateLogin")).click();
		      Thread.sleep(2000);
		      String toast = driver.findElement(By.xpath("//span[@class='app-font-color card-title-font']/p")).getText();
		      String msg="Enter verification code sent to ";
		      Assert.assertTrue(toast.contains(msg));

	}

}
