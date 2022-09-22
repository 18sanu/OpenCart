package PomRepository;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	AndroidDriver driver;
HomePage(AndroidDriver driver){
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}
	
@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"leftElement\"]/android.widget.TextView")
private MobileElement humburgerButton;
}
