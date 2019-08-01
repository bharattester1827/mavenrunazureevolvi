package com.evolvitest.AutoEvovliRail;


import org.openqa.selenium.By;

public class OrderManagerPage extends Utils {
	
	
	
	
	private By _orderManagertabs = By.xpath("//div[@id='ctl00_TopNavigationBar_NavBarDiv']/div/ul[1]/li[5]");
	private By _detailstabs = By.xpath("//div[@id='ctl00_MasterContent_OrderSearchWebPart_ItemContent']/div/ul/li[2]/a");
	private By _searchbutton = By.xpath("//div[@id='Div1']/div/div[2]/input");
	//private By _orderreferencenumber = By.xpath("//div[@class='EVi confirmationPage']/div[2]/table/tbody/tr[1]/td[2]");
	private By _orderitemreference = By.xpath("//div[@id='gbox_ctl00_MasterContent_OrderSearchResultsWebPart_SearchResultGridTable']/div[3]/div[3]/div/table/tbody/tr[2]/td[2]");
	private By _cancelbuttondetails = By.xpath("//input[@id='ctl00_MasterContent_OrderSearchResultDetailWebPart_CancelButton']");
	private By _dialogboxmessage = By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-dialog-buttons']/div[3]/div/button[1]/span");
	private By _obscures = By.xpath("//div[@class='ui-widget-overlay']");
	String expected = "Cancelled";
	private By _statusofnonissueticket = By.xpath("//div[@id='gbox_ctl00_MasterContent_OrderSearchResultsWebPart_SearchResultGridTable']/div[3]/div[3]/div/table/tbody/tr[2]/td[11]");
	
	
	
	
	public void obscuresdelayed () {
		waitForElementToBeInvisible(_obscures, 60);
	}
	public void orderManagerTabs () {
		waitForElementToBeInvisible(_obscures, 60);
		waitAndClick(_orderManagertabs, 60);
	}
	public void detialsTabs (){
		waitAndClick(_detailstabs, 3);
	}
	public void searchButton () {
		waitAndClick(_searchbutton, 7);
	}
	public void orderItemReference () {
		System.out.println(getTextFromElement(_orderitemreference));
		waitAndClick(_orderitemreference, 5);
	}
	public void cancelButtonDetails () {			
		waitAndClick(_cancelbuttondetails, 5);
	}
	public void dialogBoxMessage () {
		waitAndClick(_dialogboxmessage, 5);
	}
	public void closeDialogBoxMessage() {
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}			
		System.out.println(getTextFromElement(_dialogboxmessage));
		javascriptexecutor(_dialogboxmessage);
	}
	public void verifyStatusOfNonIssueTicket () {
		System.out.println(getTextFromElement(_statusofnonissueticket));
		
		//Assert.assertEquals(expected, getTextFromElement(_statusofnonissueticket));
	}

}
