package com.evolvitest.AutoEvovliRail;

import org.openqa.selenium.By;

public class CheckoutPage extends Utils {
	
	private By _checkoutbutton = By.xpath(".//*[@class='ConfirmBasketMethod buttonMargin floatright']/input");						 
	private By _checkoutpagetitle = By.id("ctl00_MasterContent_BasketMessage");
	private By _continuebtnpopseasonticket = By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons']/div[11]/div/button[2]/span");
	private By _divisionofemployee = By.xpath("//div[@id='CustomFieldsWebPart']/div[1]/div/div/div/div/div/div/div[3]/div/div[2]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/input[1]");
	private By _typeofemployee = By.xpath("//div[@id='CustomFieldsWebPart']/div[1]/div/div/div/div/div/div/div[3]/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/input[1]");
	private By _savebuttonondialogue = By.xpath("//div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']/div/button[2]/span");
	
	
	
	
	
	public void CheckoutButton () {
		waitForElementToBeDisplay(_checkoutbutton, 10);
		waitAndClick(_checkoutbutton, 5);
	}
	public void baskettitle() {
		getTextFromElement(_checkoutpagetitle);
	}
	public void continuePopDialogSeasonsTicket () {
		waitAndClick(_continuebtnpopseasonticket, 5);
		//driver.getWindowHandle().wait();
		//driver.manage().ime();
		//driver.navigate().to("https://evolvi-v2-uat.fastrailticketing.com/order/buy.aspx");
	}		
	public void DivisionOfEmployee () {
		clearAndEnterText(_divisionofemployee, "Medical");
	} 
	public void TypeOfEmployee () {
		clearAndEnterText(_typeofemployee, "Captain");
	}
	public void SaveButtonDialogue () {
		clickOnElement(_savebuttonondialogue);
	}

}
