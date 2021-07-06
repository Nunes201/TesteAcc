package teste;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Tricentis.beginPag;
import Tricentis.beginSendQuote;
import Tricentis.enterProductData;
import Tricentis.insurantData;
import Tricentis.priceOption;

public abstract class baseClass {
	
	protected WebDriver driver;
	protected beginPag beginPage;
	protected insurantData insurant;
	protected enterProductData enterProductData;
	protected priceOption selectPriceoption;
	protected beginSendQuote sendQuot;

	public void openApplication() {
		System.setProperty(Config.NOME_DRIVER, Config.CAMINHO_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.URL_APLICACAO);
		
		beginPage = new beginPag(driver);
		insurant = new insurantData(driver);
		enterProductData = new enterProductData(driver);
		selectPriceoption = new  priceOption(driver);
		sendQuot = new beginSendQuote(driver);
	}
	
	public void closeApplication() throws Exception{
		Thread.sleep(6000);
		driver.quit();
	}
}
