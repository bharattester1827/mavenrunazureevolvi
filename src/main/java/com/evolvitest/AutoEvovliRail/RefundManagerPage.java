package com.evolvitest.AutoEvovliRail;

import org.openqa.selenium.By;

//import junit.framework.Assert;

public class RefundManagerPage extends Utils {
	
	
	
	//private By _orderitemreferencepaste = By.xpath("//div[@id='ctl00_MasterContent_SearchForBooking_divSearchContents']/div[3]/div/input");
	
	private By _admintabsonheading = By.xpath("//div[@id='ctl00_TopNavigationBar_NavBarDiv']/div/ul[1]/li[2]/a");
	private By _refundmanagerlink = By.xpath("//div[@id='ctl00_TopNavigationBar_NavBarDiv']/div/ul[1]/li[2]/div/div[2]/div[2]/p[1]/a");
	private By _todreferencetext = By.xpath("//div[@id='ctl00_MasterContent_SearchForBooking_divSearchContents']/div[2]/div[5]/div[2]/input");
	private By _orderitemtext = By.xpath("//div[@id='ctl00_MasterContent_SearchForBooking_divSearchContents']/div[3]/div[1]/input");
	private By _searchbutton = By.xpath("//div[@class='buttonBar']/input");
	private By _toDreferencenumber = By.xpath("//div[@id='TodDiv']/table/tbody/tr[1]/td/span[3]/b");
	private By _orderItemReferencenumber = By.xpath("//div[@class='OrderSearchResultsWebPart']/div/div[3]/div/div[3]/div[3]/div/table/tbody/tr[2]/td[2]");
	private By _cancelticketsbutton = By.xpath("//div[@class='refundingBookingDetails']/input");
	private By _cancelallbuttonpop = By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable']/div[2]/div[1]/form/div[3]/div[2]/input");
	private By _closebuttonpop = By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable']/div[1]/a/span");
	
	private By _yesradiobuttonforfullrefund = By.xpath("//div[@id='refundableConfirmation']/table/tbody/tr[1]/td/input");
	private By _autorefundbutton = By.xpath("//div[@id='divDetailPanes']/div[2]/div[5]/div[4]/input[3]");
	private By _radiobuttonforallcouponspresent = By.xpath("//div[@id='CouponVerification']/div[3]/span[2]/input");
	private By _verifycouponsbutton = By.xpath("//div[@id='CouponVerification']/div[4]/input[2]");
	private By _invalidatecouponsbutton = By.xpath("//div[@id='CouponVerification']/div[4]/input[4]");
	//private By _validatestatusofrefund = By.xpath("//div[@id='divDetailPanes']/div[1]/div[1]/span[2]");
	String statusrefund = "Refunded";
	private By _uncollectedautorefund = By.xpath("//div[@class='refundSearchDetails applyForRefund']/div[4]/input[3]");
	private By _clickOnOkpopup = By.xpath("//div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']/div/button[2]");
	String refundstatus = "Refunded";
	//private By _refundbookingstatus = By.xpath("//div[@class='refundingBookingStatus']/span[2]");
	private By _acceptedrefund = By.xpath("//div[@class='refundSearchDetails refundProgress']/div[4]/div/table/tbody/tr[2]/td[2]");
	//private By _obscures = By.xpath("//div[@class='ui-widget-overlay']");
	//private By _clickonpopup = By.xpath("//div[@id='RefundRequestTicketListDiv']");
	
	
	

	
	public void OrderItemReferencePaste () {
		//copy _tod reference number from Orderconfirmation page 
		String element = getTextFromElement(_orderItemReferencenumber);
		System.out.println(element);
		mouseHoverOnElement(_admintabsonheading);
		javascriptexecutor(_refundmanagerlink);
		//paste text tod reference number here
		enterText(_orderitemtext, element);				
	}
	public void searchButton () {
		clickOnElement(_searchbutton);
	}
	public void copyToDReference () {
		//copy _tod reference number from Orderconfirmation page 
		String element = getTextFromElement(_toDreferencenumber);
		System.out.println(element);
		mouseHoverOnElement(_admintabsonheading);
		javascriptexecutor(_refundmanagerlink);
		//paste text tod reference number here
		enterText(_todreferencetext, element);
	}
	public void cancelTicket() {
		waitAndClick(_cancelticketsbutton, 6);
	}
	public void cancelAllButtonPop () {
		waitAndClick(_cancelallbuttonpop, 6);
	}
	public void closeButtonOnPop () {
		//waitAndClick(_obscures, 10);				
		//waitForElementToBeDisplay(_clickonpopup, 10);
		//waitAndClick(_clickonpopup, 5);
		System.out.println(getTextFromElement(_closebuttonpop));
		javascriptexecutor(_closebuttonpop);
	}
	public void yesRadioButtonForFullRefund () {
		driver.navigate().refresh();
		driver.switchTo().alert().accept();
		waitAndClick(_yesradiobuttonforfullrefund, 4);
	}
	public void autoRefundButton () {
		clickOnElement(_autorefundbutton);
	}
	public void confirmAllCouponsPresents () {
		waitAndClick(_radiobuttonforallcouponspresent, 4);
	}
	public void verifyCouponsButton () {
		waitAndClick(_verifycouponsbutton, 2);
	}
	public void invalidateCouponsButton () {
		waitAndClick(_invalidatecouponsbutton, 60);
	}
	public void validateStatusOfRefund () {
		//assertEquals(statusrefund, _validatestatusofrefund);
		//Assert.assertEquals(_validatestatusofrefund, statusrefund );
	}
	public void UncollectedAutoRefundButton () {
		waitAndClick(_uncollectedautorefund, 5);
	}
	public void clickOnPopUpOk () {
		waitAndClick(_clickOnOkpopup, 4);
	}
	public void verifyRefundStatus () {
		waitForElementToBeDisplay(_acceptedrefund, 10);
		//Assert.assertEquals(refundstatus, getTextFromElement(_refundbookingstatus));
	}
	

}
