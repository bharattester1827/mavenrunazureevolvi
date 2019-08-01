package com.evolvitest.AutoEvovliRail;

import org.openqa.selenium.By;

public class ReservationPreferencePage extends Utils {
	
	
	private By _reservebutton = By.xpath("//div[@id='YourFare']/div/div/div[6]/div[2]/input");
	private By _obscures = By.xpath("//div[@class='ui-widget-overlay']");		
	


	public void Reservebutton () {
		//waitForElementToBeDisplay(_reservebutton, 5);
		waitForElementToBeInvisible(_obscures,10);
		scrolltoviewelement(_reservebutton);
		waitAndClick(_reservebutton, 5);
	}
	

}
