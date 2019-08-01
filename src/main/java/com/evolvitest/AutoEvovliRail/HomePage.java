package com.evolvitest.AutoEvovliRail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Utils {

	LoadProp loadprop = new LoadProp ();
	
	
	private By _headertitle = By.xpath("//div[@class='container_12 MainContainer']/h2");
	private By _fromlocation = By.id("ctl00_MasterContent_JourneySearchWebPart_UkRailWebPart_FromStationTextBox_Station");
	private By _tolocation = By.id("ctl00_MasterContent_JourneySearchWebPart_UkRailWebPart_ToStationTextBox_Station");
	private By _faresearch = By.id("ctl00_MasterContent_JourneySearchWebPart_UkRailWebPart_SearchButton");
	private By _seasonticketfaresearch = By.xpath("//div[@id='ctl00_MasterContent_JourneySearchWebPart_ItemContent']/div[1]/div[2]/div[1]/div[3]/div[3]/input[1]");
			//By.id("SeasonTicketFareSearch");
	private By _singlejourneybooking = By.id("IsUkRailSingleLabel");
	private By _carnetjourney = By.id("IsUkRailCarnetLabel");
	private By _seasonjourney = By.id("ctl00_MasterContent_JourneySearchWebPart_UkRailWebPart_UkRailButtonGroup_IsUkSeasonLabel");
	private By _returncalendar = By.xpath("//div[@class='ReturnDateDiv']/img");
	private By _returndateselect = By.xpath("//div[@id='ui-datepicker-div']/div/table/tbody[1]//td[contains(@data-handler,'selectDay')][5]");
	private By _selectorganisation = By.xpath("//div[@id='ctl00_MasterContent_JourneySearchWebPart_UkRailTabDiv']/div[2]/div[4]/div/div[2]/select");
	private By _seasonticketselectorganisation = By.xpath("//div[@id='ukRailSeasonTickets']/div[2]/div[3]/div/div[4]/select");
	private By _seasonticketfromlocation = By.id("SeasonTicketFromStation");
	private By _seasontickettolocation = By.id("SeasonTicketToStation");
	private By _randomlyclickonpage = By.xpath("//div[@id='ctl00_MasterContent_JourneySearchWebPart_ItemContent']/div[1]/div[2]/div[1]/div[3]/div[3]/input[2]");
	private By _edittravellerandrailcard = By.id("ctl00_MasterContent_JourneySearchWebPart_UkRailWebPart_EditTravellersButton");
	private By _railcardcategories = By.cssSelector("select#MyTravellersContentWebPart_TravellingWebPart_sr_ctl03_sw_ctl01_lRailCardList");
	private By _savebuttonaddtraveller = By.xpath("//div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']/div/button[2]/span");
	
	
	//RailCard
	private By _railcard = By.id("RailcardTab");
	private By _1625RailCard = By.id("IsYNGLabel");
	private By _twoToTogetherRailCard =By.id("Is2TRLabel");
	private By _titleofname = By.id("ctl00_MasterContent_JourneySearchWebPart_RailcardWebPart_chTitle1");
	private By _titleofname2 = By.id("ctl00_MasterContent_JourneySearchWebPart_RailcardWebPart_chTitle2");
	private By _forenameyoung = By.id("ctl00_MasterContent_JourneySearchWebPart_RailcardWebPart_chForename1");
	private By _forename2 = By.id("ctl00_MasterContent_JourneySearchWebPart_RailcardWebPart_chForename2");
	private By _lastnameyoung = By.id("ctl00_MasterContent_JourneySearchWebPart_RailcardWebPart_chSurname1");
	private By _lastname2 = By.id("ctl00_MasterContent_JourneySearchWebPart_RailcardWebPart_chSurname2");
	private By _emailyoung = By.id("ctl00_MasterContent_JourneySearchWebPart_RailcardWebPart_EmailBox");
	private By _telephonenoyoung = By.id("ctl00_MasterContent_JourneySearchWebPart_RailcardWebPart_TelephoneBox");
	private By _photoidyoung = By.id("ctl00_MasterContent_JourneySearchWebPart_RailcardWebPart_PhotocardBox");
	private By _clickoncalendarfordob = By.xpath("//div[@class='grid_3x ']/div[5]/div[4]/div[1]/img");
	private By _clickondobyear = By.xpath("//div[@id='ui-datepicker-div']/div[1]/div[1]/select/option[4]");
	private By _dobyoung = By.xpath("//div[@id='ui-datepicker-div']/table/tbody//td[contains(@data-handler, 'selectDay')][7]");
	private By _checkboxofcompletedrailcard = By.id("ctl00_MasterContent_JourneySearchWebPart_RailcardWebPart_cbCompleteApp");
	private By _checkboxofagerestrictions = By.id("ctl00_MasterContent_JourneySearchWebPart_RailcardWebPart_cbAgeSeen");
	private By _checkboxofphotocard = By.id("ctl00_MasterContent_JourneySearchWebPart_RailcardWebPart_cbPhotoSeen");
	private By _railcardaddtobasketbtn = By.id("ctl00_MasterContent_JourneySearchWebPart_RailcardWebPart_RailcardAddButton");
	private By _expandbutton = By.xpath("//div[@id = 'ukRailStandard']/div[7]/div/span");
	
	
	
	
	
	
	
	
	
	public void expandButtonTrail () {
		clickOnElement(_expandbutton);
	}
	
	public void HomePageTitle () {
		System.out.println(getTextFromElement(_headertitle));
	}
	public void OriginAndDestinationExamples (String origin, String destination) {
		clearAndEnterText(_fromlocation, loadprop.getproperty(origin));
		clearAndEnterText(_tolocation, loadprop.getproperty(destination));
	}	
	public void railCardOption() {
		clickOnElement(_railcard);
	}
	public void SingleJourneyBooking () {
		waitAndClick(_singlejourneybooking, 3);
	}
	public void CarnetJourneyRoute() {
		clickOnElement(_carnetjourney);
	}
	public void SeasonJourney(){
		clickOnElement(_seasonjourney);
	}
	public void FromLocation () {
		clearAndEnterText(_fromlocation, loadprop.getproperty("From"));
	}
	public void ToLocation() {
		clearAndEnterText(_tolocation, loadprop.getproperty("To"));
	}
	public void EticketFrom () {
		clearAndEnterText(_fromlocation, loadprop.getproperty("Eticketfrom"));
	}
	public void EticketTo() {
		clearAndEnterText(_tolocation, loadprop.getproperty("Eticketto"));
	}
	public void SelfprintticketFrom () {
		clearAndEnterText(_fromlocation, loadprop.getproperty("Selfprintticketfrom"));
	}
	public void SelfprintticketTo() {
		clearAndEnterText(_tolocation, loadprop.getproperty("Selfprintticketto"));
	}
	public void CreditcardFrom () {
		clearAndEnterText(_fromlocation, loadprop.getproperty("Creditcardfrom"));
	}
	public void CreditcardTo() {
		clearAndEnterText(_tolocation, loadprop.getproperty("Creditcardto"));
	}
	public void TodticketFrom () {
		clearAndEnterText(_fromlocation, loadprop.getproperty("Todticketfrom"));
	}
	public void TodticketTo() {
		clearAndEnterText(_tolocation, loadprop.getproperty("Todticketto"));
	}
	public void MobileticketFrom () {
		clearAndEnterText(_fromlocation, loadprop.getproperty("Mobileticketfrom"));
	}
	public void MobileticketTo() {
		clearAndEnterText(_tolocation, loadprop.getproperty("Mobileticketto"));
	}
	public void KioskticketFrom () {
		clearAndEnterText(_fromlocation, loadprop.getproperty("Kioskticketfrom"));
	}
	public void KioskticketTo() {
		clearAndEnterText(_tolocation, loadprop.getproperty("Kioskticketto"));
	}
	public void CarnetjourneyFrom() {
		clearAndEnterText(_fromlocation, loadprop.getproperty("CarnetFrom"));
	}
	public void CarnetjourneyTo() {
		clearAndEnterText(_tolocation, loadprop.getproperty("CarnetTo"));
	}
	public void seasonTicketFromStation () {
		clearAndEnterText(_seasonticketfromlocation, loadprop.getproperty("seasonticketfrom"));
	}
	public void seasonTicketToStation () {
		clearAndEnterText(_seasontickettolocation, loadprop.getproperty("seasonticketto"));
		mouseHoverOnElement(_randomlyclickonpage);
	}
	
	public void returndateselect () {
		WebElement element = driver.findElement(_returncalendar);
		clickOnElement(_returncalendar);
		List <WebElement> returndate = element.findElements(_returndateselect);
		System.out.println("Up to now I find Date " + getTextFromElement(_returndateselect) + " element on page.");
		System.out.println("No of Day: " + returndate.size());
		for(WebElement e: returndate) {
			e.click();
			break;
		}
	}	
	public void FareSearch() {
		clickOnElement(_faresearch);
	}
	public void seasonTicketFareSearchBtn () {
		javascriptexecutor(_seasonticketfaresearch);
	}
	public void TwoToTogetherRailCard () {
		clickOnElement(_twoToTogetherRailCard);
	}
	public void youngRailCardOption() {
		clickOnElement(_1625RailCard);
	}
	public void TitleOfName() {
		enterText(_titleofname, "Mr.");
	}
	public void TwotogetherTitleOfName2 () {
		enterText(_titleofname2, "Mrs");
	}
	public void ForeName () {
		enterText(_forenameyoung, "John");
	}
	public void TwotogetherForeName() {
		enterText(_forename2, "Jenni");
	}
	public void LastName () {
		enterText(_lastnameyoung, "Smith");
	}
	public void TwotogetherLastName () {
		enterText(_lastname2, "Whitton");
	}
	public void Email () {
		enterText(_emailyoung, "jenniferw@evolvi.co.uk");
	}
	public void TelephoneNumber () {
		enterText(_telephonenoyoung, "07412345678");
	}
	public void photoID () {
		enterText(_photoidyoung, "PP123456");
	}
	public void dateOfBirthYoung() {
		WebElement element = driver.findElement(_clickoncalendarfordob);
		clickOnElement(_clickoncalendarfordob);
		List <WebElement> dobyear = element.findElements(_clickondobyear);
		for(WebElement a: dobyear) {
			a.click();
			break;
		}
		List <WebElement> dobday = element.findElements(_dobyoung);
		waitForElementToBeVisible(_dobyoung, 5 );
		System.out.println("Up to now I find  " + getTextFromElement(_dobyoung) + " element on page.");
		System.out.println("No of Rows: " + dobday.size());
		for(WebElement e: dobday) {
			e.click();
			break;
		}		
	}
	public void CheckboxCompletedRailCard () {
		clickOnElement(_checkboxofcompletedrailcard);
	}
	public void CheckboxAgeRestrictionYoung () {
		clickOnElement(_checkboxofagerestrictions);
	}
	public void CheckboxPhotoCard () {
		clickOnElement(_checkboxofphotocard);
	}
	public void RailCardAddtoBasket () {
		clickOnElement(_railcardaddtobasketbtn);
	}
	public void selectOrganisation () {
		selectByVisibleText(_selectorganisation, loadprop.getproperty("Organisation"));
	}
	public void seasonTicketSelectOrganisation () {
		selectByVisibleText(_seasonticketselectorganisation, loadprop.getproperty("Organisation"));
	}
	public void EditTravellerAndRailcard () {
		waitAndClick(_edittravellerandrailcard, 4);
	} 
	public void RailCardCategories () {
		selectByVisibleText(_railcardcategories, loadprop.getproperty("Tada"));
	}
	public void saveButtonPopUp () {
		waitAndClick(_savebuttonaddtraveller, 6);
	}

	
	
}
