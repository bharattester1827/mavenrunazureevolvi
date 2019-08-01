package com.evolvitest.AutoEvovliRail;

import org.openqa.selenium.By;

public class AddOnSeasonsTicketPage extends Utils {
	
	
	private By _photocardnumber = By.xpath("//div[@id='ContentPlaceHolder1_PhotocardNew']/div[1]/div[1]/div[2]/input");
	private By _checkoutbutton = By.xpath(".//*[@class='ConfirmButton buttonMargin']/input");
	private By _continueasneworderbtn = By.xpath("//div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']/div/button[1]");
	
	
	
	public void photoCardNumberEnter () {
		waitForElementToBeDisplay(_photocardnumber, 40);
		enterText(_photocardnumber, "abc123");
	}
	public void checkOutButtonSeasonTicket () {
		waitAndClick(_checkoutbutton, 5);
	}
	public void continueAsNewOrderButton () {
		waitAndClick(_continueasneworderbtn, 20);
	}
	

}
