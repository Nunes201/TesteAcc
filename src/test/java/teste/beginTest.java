package teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class beginTest extends baseClass{
	
	@Before
	public void openChrome() {
		openApplication();
	}
	
	@Test
	public void beginTest() {
		beginPage.beginElem();
		insurant.beginInsurant();
		enterProductData.beginenterProductData();
		selectPriceoption.beginPriceOption();
		sendQuot.beginQuote();
		
	}
	
	@After
	public void CloseTest() throws Exception {
		closeApplication();
	}

}
