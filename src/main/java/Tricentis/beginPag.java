package Tricentis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class beginPag extends baseObeject{
	
	public beginPag(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"make\"]")
	private WebElement click;
	
	@FindBy(xpath = "/*[@value=\"BMW\"]")
	private WebElement click2;
	
	@FindBy(xpath = "//*[@id=\"model\"]")
	private WebElement model;
	
	@FindBy(xpath = "//*[@id=\"cylindercapacity\"]")
	private WebElement cylinderCap;
	
	@FindBy(xpath = "//*[@id=\"engineperformance\"]")
	private WebElement engineperfor;
	
	@FindBy(xpath = "//*[@id=\"dateofmanufacture\"]")
	private WebElement dateManuf;
	
	@FindBy(xpath = "//*[@id=\"numberofseats\"]")
	private WebElement numberSeat;
	
	@FindBy(xpath = "//*[@id=\"numberofseatsmotorcycle\"]")
	private WebElement numberSeaMot;
	
	@FindBy(xpath = "//*[@id=\"fuel\"]")
	private WebElement fuelType;
	
	@FindBy(xpath = "//*[@id=\"payload\"]")
	private WebElement payload;
	
	@FindBy(xpath = "//*[@id=\"totalweight\"]")
	private WebElement totalWeight;
	
	@FindBy(xpath = "//*[@id=\"listprice\"]")
	private WebElement listPrice;
	
	@FindBy(xpath = "//*[@id=\"licenseplatenumber\"]")
	private WebElement licenseNum;
	
	@FindBy(xpath = "//*[@id=\"annualmileage\"]")
	private WebElement annualMile;
	
	@FindBy(xpath = "//*[@id=\"nextenterinsurantdata\"]")
	private WebElement next;
	
	public void beginElem() {		
		
			Select combobox = new Select(click);
	        combobox.selectByValue("BMW");
	        Select combobox4 = new Select(model);
	        combobox4.selectByValue("Scooter");
	        cylinderCap.sendKeys(Massa.CYLINDER_CAPACITY);
	        engineperfor.sendKeys(Massa.ENGINE_PERFORM);
	        dateManuf.sendKeys(Massa.DATE_MANUF);
	        Select combobox2 = new Select(numberSeat);
	        combobox2.selectByValue("6");
	        Select combobox5 = new Select(numberSeaMot);
	        combobox5.selectByValue("2");
	        Select combobox3 = new Select(fuelType);
	        combobox3.selectByValue("Gas");
	        payload.sendKeys(Massa.PAYLOAD);
	        totalWeight.sendKeys(Massa.TOTAL_WEIGHT);
	        listPrice.sendKeys(Massa.LIST_PRICE);
	        licenseNum.sendKeys(Massa.LICENSE_NUMBER);
	        annualMile.sendKeys(Massa.ANNUAL_MILEAGE);
	        next.click();

	}

}
