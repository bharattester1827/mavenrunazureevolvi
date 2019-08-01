package com.evolvitest.AutoEvovliRail;

import org.openqa.selenium.By;

public class TicketingPrintingPage extends Utils {
	
	
	
	private By _printbutton = By.xpath("//div[@class='TabContent']/div[1]/div[4]/div[2]/div[5]/input");
	//private By _elementvisible = By.xpath("//div[@id='ToPrintTabDiv']/div[1]/div[3]/div[3]/div/table/tbody/tr[2]/td[1]");
	private By _ordermanagertabs = By.xpath("//div[@id='ctl00_TopNavigationBar_NavBarDiv']/div/ul[1]/li[5]");
	private By _printtodaytabs = By.id("ctl00_MasterContent_TicketingTabsWebPart_PrintedTab");
	private By _nonissuebutton = By.id("ctl00_MasterContent_TicketingTabsWebPart_PrintedTabWebPart_NonIssueButton");
	private By _yesbuttononpopup = By.id("btnGeneralQuestionYES");
	private By _obscures = By.xpath("//div[@class='ui-widget-overlay']");
	
	
	
	
	
	public void printbutton () {
		waitAndClick(_printbutton, 5);
	}
	public void OrderManagerTabs () {
		waitForElementToBeDisplay(_ordermanagertabs, 60);
	}
	public void printTodayTabs () {
		waitForElementToBeInvisible(_obscures, 15);
		waitAndClick(_printtodaytabs, 5);
	}
	public void nonIssueButton () {
		waitAndClick(_nonissuebutton, 5);
	}
	public void yesButtonOnPopUp () {
		waitAndClick(_yesbuttononpopup, 6);
	}
	

}
