package Tricentis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class enterProductData extends baseObeject{
	
	public enterProductData(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"startdate\"]")
	private WebElement startDate;
	
	@FindBy(xpath = "//*[@id=\"insurancesum\"]")
	private WebElement insurenceSum;
	
	@FindBy(xpath = "//*[@id=\"meritrating\"]")
	private WebElement meritRating;
	
	@FindBy(xpath = "//*[@id=\"damageinsurance\"]")
	private WebElement damageInsurance;
	
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")
	private WebElement optionalProd;
	
	@FindBy(xpath = "//*[@id=\"courtesycar\"]")
	private WebElement courtesyCar;
	
	@FindBy(xpath = "//*[@id=\"nextselectpriceoption\"]")
	private WebElement next;
	
	public void beginenterProductData() {
		
		startDate.sendKeys(Massa.START_DATE);
		
		Select comboboxinsurenceSum = new Select(insurenceSum);
		comboboxinsurenceSum.selectByValue("5000000");
		
		Select comboboxmeritRating = new Select(meritRating);
		comboboxmeritRating.selectByValue("Bonus 7");
		
		Select comboboxdamageInsurance = new Select(damageInsurance);
		comboboxdamageInsurance.selectByValue("No Coverage");
		
		optionalProd.click();
		
		Select comboboxcourtesyCar = new Select(courtesyCar);
		comboboxcourtesyCar.selectByValue("Yes");
		
		next.click();
	}

}
