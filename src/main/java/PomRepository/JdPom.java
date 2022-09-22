package PomRepository;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class JdPom {
AndroidDriver driver;
	public JdPom(AndroidDriver driver){
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}
	
	public AndroidDriver getDriver() {
		return driver;
	}
	

	public MobileElement getAgreebtn() {
		return agreebtn;
	}

	@AndroidFindBy(id="com.justdial.search:id/terms_accept_btn")
	private MobileElement agreebtn;
	
	@AndroidFindBy(id="button_skip")
	private MobileElement skipbtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='CANCEL']")
	private MobileElement cancelBtn;
	
	@AndroidFindBy(id="control_background")
	private MobileElement controlbtn;
	
	public MobileElement getControlbtn() {
		return controlbtn;
	}

	public MobileElement getSkipbtn() {
		return skipbtn;
	}

	public MobileElement getCancelBtn() {
		return cancelBtn;
	}
	
	
    
	
}
