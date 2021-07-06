package Tricentis;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseObeject {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public void BaseObject(WebDriver driver) {
		this.driver = driver;
	}

}
