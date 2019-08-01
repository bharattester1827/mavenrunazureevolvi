package com.evolvitest.AutoEvovliRail;

import org.openqa.selenium.By;

public class LogOffPage extends Utils {
	
	private By _logoffbtn = By.xpath(".//*[@class='leftButton icon-link']/li[6]/a");
	private By _unwantedoverlay = By.xpath(".//div[@class='ui-widget-overlay']"); 
	
	
	public void UnwantedOverlay() {
		
	}		
	public void LogOffButton () {
		
		waitForElementToBeInvisible(_unwantedoverlay, 10);
		clickOnElement(_logoffbtn);
	}

}
