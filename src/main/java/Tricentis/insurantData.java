package Tricentis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class insurantData extends baseObeject{
	
	public insurantData(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"firstname\"]")
	private WebElement firstName;
	
	@FindBy(xpath = "//*[@id=\"lastname\"]")
	private WebElement lastName;
	
	@FindBy(xpath = "//*[@id=\"birthdate\"]")
	private WebElement birthDate;
	
	@FindBy(xpath = "//*[@id=\"streetaddress\"]")
	private WebElement streetAd;
	
	@FindBy(xpath = "//*[@id=\"country\"]")
	private WebElement country;
	
	@FindBy(xpath = "//*[@id=\"zipcode\"]")
	private WebElement zipCode;
	
	@FindBy(xpath = "//*[@id=\"occupation\"]")
	private WebElement occupation;
	
	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")
	private WebElement hobbies;
	
	@FindBy(xpath = "//*[@id=\"nextenterproductdata\"]")
	private WebElement next;
	
	public void beginInsurant() {
		
		firstName.sendKeys(Massa.FIRST_NAME);
		
		lastName.sendKeys(Massa.LAST_NAME);
		
		birthDate.sendKeys(Massa.DATE_BIRTH);
		
		streetAd.sendKeys(Massa.STREET);
		
		Select comboboxCountry = new Select(country);
		comboboxCountry.selectByValue("Australia");
		
		zipCode.sendKeys(Massa.ZIP_CODE);
		
		Select comboboxOccupation = new Select(occupation);
		comboboxOccupation.selectByValue("Employee");
		
		hobbies.click();
		next.click();
		
		
	}

}
