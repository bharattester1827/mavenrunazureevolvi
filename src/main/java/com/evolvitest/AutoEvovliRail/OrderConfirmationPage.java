package com.evolvitest.AutoEvovliRail;

import org.openqa.selenium.By;

public class OrderConfirmationPage extends Utils {
	
	private By _ordernumber = By.xpath("//div[@class='EVi confirmationPage']/div/h2/span[1]");
	private By _deliverymethodtext = By.xpath("//div[@id='SummaryDiv']/table/tbody/tr[4]/td[4]");
	//private By _orderreferencenumbercopy = By.xpath("//div[@id='SummaryDiv']/table/tbody/tr[1]/td[2]");
	private By _printticket = By.xpath("//div[@class='container_12 MainContainer']/div[5]/div[3]/input");
	
	
	public void orderNumberText () {
		waitForElementToBeVisible(_ordernumber, 25);
		System.out.println("Confirmation: " + getTextFromElement(_ordernumber));
	}
	public void deliverygettext() {
		System.out.println("Delivery Method Selected: " + getTextFromElement(_deliverymethodtext)+ ".");
	}
	public void printticket() {
		clickOnElement(_printticket);
	}

}
