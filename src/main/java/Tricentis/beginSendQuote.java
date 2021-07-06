package Tricentis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class beginSendQuote extends baseObeject{
	
	public beginSendQuote(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id=\"username\"]")
	private WebElement userName;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"confirmpassword\"]")
	private WebElement confPassw;
	
	@FindBy(xpath = "//*[@id=\"Comments\"]")
	private WebElement comments;
	
	@FindBy(xpath = "//*[@id=\"sendemail\"]")
	private WebElement send;
	
	@FindBy(xpath = "/html/body/div[4]/h2")
	private WebElement mess;
	
	public void beginQuote(){
		
		email.sendKeys(Massa.E_MAIL);
		
		userName.sendKeys(Massa.USER_NAME);
		
		password.sendKeys(Massa.PASSWORD);
		
		confPassw.sendKeys(Massa.PASSWORD);
		
		comments.sendKeys(Massa.COMMENTS);
		
		send.click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Ocorreu um erro no carregamento da Pagina");
		}
		
		if (mess.getText().equals(Massa.MSS)) {
			
			System.out.println("Teste Finalizado!");
			
		}else {
			System.out.println("Ocorreu um erro na validação");
		}
		}
		
	
}


