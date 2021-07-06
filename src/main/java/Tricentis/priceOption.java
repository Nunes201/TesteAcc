package Tricentis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class priceOption extends baseObeject{
	
	public priceOption(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span")
	private WebElement ultimate;
	
	@FindBy(xpath = "//*[@id=\"nextsendquote\"]")
	private WebElement next;
	
	public void beginPriceOption() {
		
		ultimate.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Ocorreu um erro no carregamento da Pagina");
		}
		if(next.isDisplayed() == true){
			
		next.click();
		
		}else {
			System.out.println("Ocorreu um erro no carregamento da pagina");
		}
		
	}
	

}
