package com.evolvitest.AutoEvovliRail;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
	
		LoadProp loadprop = new LoadProp();
		
		private By _username = By.id("ctl00_MasterContent_LogonWebPart_Email");
		private By _password = By.id("ctl00_MasterContent_LogonWebPart_Password");
		private By _logonbtn = By.id("ctl00_MasterContent_LogonWebPart_SubmitButton");
		private By _headertitle = By.id("ctl00_HeaderLogoWebPart_HeaderLogoDiv");

		
		
		
		public void Username() {
			clearAndEnterText(_username, loadprop.getproperty("Username"));
			
		}
		public void Password() {
			clearAndEnterText(_password,loadprop.getproperty("Password"));
		}	
		public void Loginbtn () {
			clickOnElement(_logonbtn);
		}
		public void HeaderTitle () {
			getTextFromElement(_headertitle);
		}

}
