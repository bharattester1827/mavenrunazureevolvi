package com.evolvitest.AutoEvovliRail;

import org.openqa.selenium.By;

public class DeliveryMethodPage extends Utils {
	
	private By _ToDelivery = By.xpath("//ul[@id='ctl00_MasterContent_DeliveryMethodListWebPart_MyDeliveryMethodListRepeater_RepeaterDiv']/li[1]/div/div/div[3]/div/ul/li[9]/div[2]/button");
	private By _buynowbtn = By.xpath("//div[@id='YourFare']/div/div/div[6]/div[2]/input");
			//By.xpath(".//*[@value='BUY NOW']");
	private By _mticket = By.xpath("//ul[@id='ctl00_MasterContent_DeliveryMethodListWebPart_MyDeliveryMethodListRepeater_RepeaterDiv']/li[1]/div/div/div[3]/div/ul/li[7]/div[2]/button");								
	private By _kioskticket = By.xpath("//ul[@id='ctl00_MasterContent_DeliveryMethodListWebPart_MyDeliveryMethodListRepeater_RepeaterDiv']/li[1]/div/div/div[3]/div/ul/li[2]/div[2]/button");
	private By _eticket = By.xpath("//ul[@id='ctl00_MasterContent_DeliveryMethodListWebPart_MyDeliveryMethodListRepeater_RepeaterDiv']/li[1]/div/div/div[3]/div/ul/li[8]/div[2]/button");
	private By _selfprintticket = By.xpath("//ul[@id='ctl00_MasterContent_DeliveryMethodListWebPart_MyDeliveryMethodListRepeater_RepeaterDiv']/li[1]/div/div/div[3]/div/ul/li[6]/div[2]/button");
	//private By _secondclasspost = By.xpath("//*[@id='ctl00_MasterContent_DeliveryMethodListWebPart_MyDeliveryMethodListRepeater_sr_ctl04_sw_ctl01_DeliveryMethodPanelRepeater_RepeaterDiv']/li[4]/div[2]/button");
	private By _seasonticketcheckoutbutton = By.xpath("//div[@class='ConfirmButton buttonMargin']/input");
	
	
	
	public void ToDeliveryMethod () {
		JavaScriptForScrolldown(_ToDelivery);
		waitAndClick(_ToDelivery, 8);
	}
	public void BuyNowBtn () {
		JavaScriptForScrolldown(_buynowbtn);
		 waitForElementToBeDisplay(_buynowbtn, 15);
		//System.out.println(getTextFromElement(_buynowbtn));
		waitAndClick(_buynowbtn, 10);
		//javascriptexecutor(_buynowbtn);
	}
	public void MticketDelivery() {
		waitAndClick(_mticket, 5);
	}
	public void KioskTicket() {
		waitAndClick(_kioskticket, 5);
	}		
	public void ETicket() {
		scrolltoviewelement(_eticket);
		clickOnElement(_eticket);
	}
	public void selfprintticket () {
		javascriptexecutor(_selfprintticket);
	}
	public void deliveryMethodExamples (String deliverymethod) {
		waitForElementToBeDisplay(_ToDelivery, 5);
		String elementXpath = loadprop.getproperty(deliverymethod);
		scrolltoviewelement(_buynowbtn);
		driver.findElement(By.xpath(elementXpath)).click();
	}
	public void CheckoutButtonSeasonTicket () {
		waitAndClick(_seasonticketcheckoutbutton, 5);
	}

}
