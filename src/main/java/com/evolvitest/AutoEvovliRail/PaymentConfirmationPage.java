package com.evolvitest.AutoEvovliRail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PaymentConfirmationPage extends Utils {
	
		LoadProp loadprop = new LoadProp();
		

		
		private By _termsandcondition = By.id("ctl00_MasterContent_TermsAndConditions_AgreeOrDisagree_AgreeOrDisagree_1");
		private By _disagreetandc = By.id("ctl00_MasterContent_TermsAndConditions_AgreeOrDisagree_AgreeOrDisagree_0");
		private By _confirmbtn = By.xpath(".//*[@value='Confirm']");
		private By _confirmbtnseasonticket = By.xpath(".//*[@value='CONFIRM']");
		private By _selectaccount = By.id("ctl00_MasterContent_PaymentAccountWebPart_AccountList"); 
		private By _seasonticketaccountlist = By.id("ContentPlaceHolder1_MainAccountWebPart_AccountDropDownList");
		private By _dumpexternalacc = By.id("ctl00_MasterContent_PaymentAccountWebPart_ExternalSystemAccountNumber");
		private By _cvvnumber = By.id("ctl00_MasterContent_PaymentCreditCardWebPart_CVV");
		private By _checkboxIndividualcards = By.id("ctl00_MasterContent_PaymentAccountWebPart_CheckPaymentCard");
		private By _cardholderName = By.id("ctl00_MasterContent_PaymentCreditCardWebPart_CardHolderName");
		private By _selectcardtype = By.id("ctl00_MasterContent_PaymentCreditCardWebPart_PaymentCardTypeList");
		private By _cardNumberEnter = By.id("ctl00_MasterContent_PaymentCreditCardWebPart_CardNumber");
		private By _cardendmonth = By.id("ctl00_MasterContent_PaymentCreditCardWebPart_ExpiresEndMonth"); 
		private By _cardendyear = By.id("ctl00_MasterContent_PaymentCreditCardWebPart_ExpiresEndYear");
		private By _savecarddetails = By.id("ctl00_MasterContent_PaymentCreditCardWebPart_SaveCardDetails");
										//div[@id='ctl00_MasterContent_PaymentCreditCardWebPartDiv']/div/div/fieldset/div/div[1]/div[1]/div[14]/div/input
		
		
		
		public void selectPaymentAccount (String selectaccount) {
			String elementXpath = loadprop.getproperty(selectaccount);
			driver.findElement(By.xpath(elementXpath)).click();			
		}
		
		public void selectaccountwithcarddetails (String externalnumbers) {
			WebElement element = driver.findElement(_dumpexternalacc);
			WebElement elementa = driver.findElement(_cvvnumber);
				if(element.isDisplayed()) {
					enterText(_dumpexternalacc, loadprop.getproperty(externalnumbers));
				} else if(elementa.isDisplayed()){
					enterText(_cvvnumber, loadprop.getproperty(externalnumbers));
					clearAndEnterText(_cvvnumber, loadprop.getproperty(externalnumbers));
				}			
		}
		public void ImmediateLodgedaccount () {
			selectByVisibleText(_selectaccount, loadprop.getproperty("cardsdetails"));
		}
		public void DirectDebitAcc () {
			selectByVisibleText(_selectaccount, loadprop.getproperty("directdebit"));
		}
		public void DirectDebitAccountSeasonTicket() {
			//selectByVisibleText(_seasonticketaccountlist, loadprop.getproperty("directdebits"));
			selectByIndex(_seasonticketaccountlist, 5);
		}
		
		public void DumpAcc () {
			selectByVisibleText(_selectaccount, loadprop.getproperty("dumpaccount"));
			enterText(_dumpexternalacc, loadprop.getproperty("ExternalSystemACC"));
		}
		public void CheckboxIndividualCards () {
			clickOnElement(_checkboxIndividualcards);
		}
		public void cardHolderName () {
			enterText(_cardholderName, loadprop.getproperty("CardHolderName"));
		}
		public void SelectCardType () {
			selectByVisibleText(_selectcardtype, loadprop.getproperty("cardtype"));
		}
		public void CardNumberEntered () {
			enterText(_cardNumberEnter, loadprop.getproperty("cardNumber"));
		}
		public void CardEndMonth() {
			selectByVisibleText(_cardendmonth, loadprop.getproperty("cardendmonth"));
		}
		public void CardEndYear () {
			selectByVisibleText(_cardendyear, loadprop.getproperty("cardendyear"));
		}
		public void CVVenterednumber () {
			enterText(_cvvnumber, loadprop.getproperty("CVV"));
			clearAndEnterText(_cvvnumber, loadprop.getproperty("CVV"));				
		}
		public void SaveCardDetails () {
			clickOnElement(_savecarddetails);
		}
		public void TermAndCondition () {
			JavaScriptForScrolldown(_confirmbtn);
			clickOnElement(_termsandcondition);
			clickOnElement(_disagreetandc);
			clickOnElement(_termsandcondition);
		}
		public void ConfirmButtonWithCheckBox () {
			JavaScriptForScrollUp(_selectcardtype);
			selectByVisibleText(_selectcardtype, loadprop.getproperty("cardtypevisa"));
			selectByVisibleText(_selectcardtype, loadprop.getproperty("cardtype"));
			JavaScriptForScrolldown(_confirmbtn);				
			waitAndClick(_confirmbtn, 10);
		}
		public void ConfirmButton()  {
			JavaScriptForScrollUp(_selectcardtype);
			selectByVisibleText(_selectcardtype, loadprop.getproperty("cardtypevisa"));
			mouseHover(_cardNumberEnter);
			selectByVisibleText(_selectcardtype, loadprop.getproperty("cardtype"));
			JavaScriptForScrolldown(_confirmbtn);				
			waitAndClick(_confirmbtn, 10);
		}
		public void ConfirmButtonNoCard () {
			JavaScriptForScrolldown(_confirmbtn);
			waitAndClick(_confirmbtn, 4);
		}
		public void ConfirmButtonSeasonTicket () {
			JavaScriptForScrolldown(_confirmbtnseasonticket);
			waitAndClick(_confirmbtnseasonticket, 4);
		}

}
