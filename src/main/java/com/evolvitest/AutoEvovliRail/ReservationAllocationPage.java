package com.evolvitest.AutoEvovliRail;

import org.openqa.selenium.By;

public class ReservationAllocationPage extends Utils {

	
	private By _resaddtobasket = By.xpath("//div[@id='ReservationAllocation']/div[4]/div[1]/input");
	private By _resaddtobasket1 = By.xpath("//div[@id='ReservationAllocation']/div[5]/div[1]/input");
	
	
	public void resaddtobasket() {		
		waitAndClick(_resaddtobasket, 6);
	}
	public void resaddtobasket1() {		
		waitAndClick(_resaddtobasket1, 6);
	}
	
	
	
	
}
