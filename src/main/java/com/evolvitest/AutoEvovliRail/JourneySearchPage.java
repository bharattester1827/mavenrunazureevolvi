package com.evolvitest.AutoEvovliRail;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JourneySearchPage extends Utils {
	
	private By _suggestedfareselect = By.id("ctl00_MasterContent_FareOptionsWebPart_FareOptionsCheapestWebPart_CheapestSuggestedButton");
	private By _headerjourneysearchtitle = By.id("ctl00_MasterContent_TitleLabel");
	private By _obscures = By.xpath("//div[@class='ui-widget-overlay']");
	private By _addtobasket = By.xpath("//div[@id='YourFare']/div/div/div[6]/div[2]/input");
	private By _eticketradio = By.id("eTicket");
	private By _mticketradio = By.id("MobileTicket");
	private By _selfprintradio = By.id("SelfPrint");
	private By _table3 = By.xpath("//div[@class='rowFareOptionDetail SingleFares']");
	private By _tableI3 = By.xpath("//div[@class='Dual Single Fares FaresWrapper']/div[3]/div");
	private By _row = By.xpath("//div[@class=' FareRowWrapperDiv']");
	private By _cele = By.xpath("//*[contains(@data-fulfilment, ' eTicket')]");
	private By _celm = By.xpath("//*[contains(@data-fulfilment, ' MobileTicket ')]");
	private By _cels = By.xpath("//*[starts-with(@data-fulfilment, 'ToD Kiosk SelfPrint ')]");
	private By _celk = By.xpath("//*[starts-with(@data-fulfilment, 'ToD Kiosk ')]");
	private By _celt = By.xpath("//*[starts-with(@data-fulfilment, 'ToD ')]");
	private By _carnetpriceprint = By.xpath("//*[@id='ctl00_MasterContent_YourFareWebPart_YourFareFare1_TotalLineValue']");

	// private By _travelcardtabs = By.id("TravelcardTab");
	private By _plusbus = By.xpath("//div[@id='SupplementOptions']/div[1]/div[2]/ul/li[2]/a");
	private By _plusbuscheckedstartdate = By.xpath("//div[@id='ctl00_MasterContent_AddOnsWebPart_PlusBusTabDiv']/div/div[2]/div[2]/input[1]");
	private By _plusbuscheckedenddate = By.xpath("//div[@id='ctl00_MasterContent_AddOnsWebPart_PlusBusTabDiv']/div/div[2]/div[2]/input[2]");
	private By _offpeakpriceonetosixzone = By.xpath("//div[@id='ctl00_MasterContent_AddOnsWebPart_TravelcardWebPart_TravelcardFareRepeaterWebPart1_TravelcardWrapper']/div[4]/div[2]/div[3]/span[2]");
	private By _travelcardcalendar2 = By.xpath("//div[@id='ctl00_MasterContent_AddOnsWebPart_TravelcardWebPart_TravelcardFareRepeaterWebPart2_TravelcardWrapper']/div/img");
	private By _selectdatefortravelcard2 = By.xpath("//div[@id='ui-datepicker-div']/table/tbody//td[contains(@data-handler,'selectDay')][3]");
	private By _peakpriceonetosixzoneday2 = By.xpath("//div[@id='ctl00_MasterContent_AddOnsWebPart_TravelcardWebPart_TravelcardFareRepeaterWebPart2_TravelcardWrapper']/div[4]/div[2]/div[3]/span[1]");
	private By _offpeakpriceonetosixzoneday2 = By.xpath("//div[@id='ctl00_MasterContent_AddOnsWebPart_TravelcardWebPart_TravelcardFareRepeaterWebPart2_TravelcardWrapper']/div[4]/div[2]/div[3]/span[2]");
	private By _firstclassfaresuggested = By.id("ctl00_MasterContent_FareOptionsWebPart_FareOptionsCheapestWebPart_CheapestFirstButton");
	// By.xpath("//div[@id='FareOptions']/div[1]/div[1]/div[1]/div[1]/table/tbody/tr[7]/td[1]/div[1]/input");
	private By _edittravellernames = By.xpath("//div[@id='YourFare']/div/div/div[6]/div[4]/input");
	private By _addtravellernames = By.xpath("//div[@id='MyTravellersListWebPartDiv']/div/div/div[1]/div[2]/div/div[3]/div/div[1]/div[7]/div[1]/span");
	// div[@id='MyTravellersListWebPartDiv']/div/div/div[1]/div[2]/div/div[3]/div/div[1]/div[7]/div[1]/span
	// div[@id='MyTravellersListWebPartDiv']/div/div/div[3]/div[2]/div/div[5]/div/div[1]/div[7]/div[1]/span
	private By _savebuttonaddtraveller = By.xpath("//div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']/div/button[2]/span");
	private By _onemonthseasonsticketprice = By.xpath("//div[@id='SearchResultsSection']/table/tbody[2]/tr[2]/td[2]/div");
	private By _seasonticketaddtobasket = By.xpath("//div[@id='seasonTicketSearchResultsVue']/div[2]/div[2]/div[1]/input[1]");
	private By _tableexpandreturnfares = By.xpath("//div[@class='farePricingOptions']/div[1]");
	private By _expandreturnfarestable = By.xpath("//span[@class='FareOptionsExpand showHideIconWrapper ReturnFares_DOWN icon-expand IconActive']");
	private By _returnfarestable = By.xpath("//div[@class='farePricingOptions']/div[1]/div[3]");
	// private By _rowreturnfarestable =
	// By.xpath("//div[@class='farePricingOptions']/div[1]/div[3]/div");
	private By _cellreturnfarestable = By.xpath("//div[@class='farePricingOptions']/div[1]/div[3]/div/div[2]/div/div");

	
	
	
	
	
	
	
	
	
	public void returnFaresTicket() {
		System.out.println(getTextFromElement(_cellreturnfarestable));
		
		WebElement table = driver.findElement(_returnfarestable);
		List<WebElement> col = table.findElements(_celk);
		waitForElementToBeVisible(_celk, 6);
		
		for (WebElement a : col) {
			//String kiosk = " Kiosk ";
			if (a.isDisplayed()) {
				//System.out.println(a.getAttribute(kiosk));
				System.out.println(a.getText());
				a.click();
				break;
			}
		}
		// javascriptexecutor(_cellreturnfarestable);

	}

	public void tickettryingdifferent() {
		waitForElementToBeDisplay(_addtobasket, 5);

		WebElement table = driver.findElement(_table3);
		List<WebElement> eticket = table.findElements(_cele);
		List<WebElement> mobileticket = table.findElements(_celm);
		List<WebElement> selfprint = table.findElements(_cels);
		List<WebElement> kiosk = table.findElements(_celk);
		List<WebElement> tod = table.findElements(_celt);

		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollBy (0,1500)", table);

		try {
			for (WebElement e : eticket) {
				if (e.isDisplayed()) {
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].click();", e);
					break;
				}
			}
			for (WebElement k : kiosk) {
				if (k.isDisplayed()) {
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].click();", k);
					break;
				}
			}
			for (WebElement a : selfprint) {
				if (a.isDisplayed()) {
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].click();", a);
					break;
				}
			}
			for (WebElement t : tod) {
				if (t.isDisplayed()) {
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].click();", t);
					break;
				}
			}
			for (WebElement m : mobileticket) {
				if (m.isDisplayed()) {
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].click();", m);
					break;
				}
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}
	/*
	 * for (WebElement e : eticket) { if (e.isDisplayed()) { JavascriptExecutor
	 * executor = (JavascriptExecutor)driver;
	 * executor.executeScript("arguments[0].click();", e); break; } } for
	 * (WebElement m : mobileticket) { if (0){ JavascriptExecutor executor =
	 * (JavascriptExecutor)driver; executor.executeScript("arguments[0].click();",
	 * m); break; } for (WebElement s : selfprint) { JavascriptExecutor executor =
	 * (JavascriptExecutor)driver; executor.executeScript("arguments[0].click();",
	 * s); break; } else if (k.isDisplayed()) { JavascriptExecutor executor =
	 * (JavascriptExecutor)driver; executor.executeScript("arguments[0].click();",
	 * k); break; } else if (t.isDisplayed()) { JavascriptExecutor executor =
	 * (JavascriptExecutor)driver; executor.executeScript("arguments[0].click();",
	 * t); break; } else {
	 * System.out.println(" something wrong - yes there is something wrong "); } }
	 * 
	 * }
	 */
	/*
	 * for (WebElement cell : col) { if (cell.getText().contains(eticket) ) {
	 * cell.findElement(_cele).click(); break; }else if
	 * (cell.getText().contains(selfprint)) { cell.findElement(_cels).click();
	 * break; } else if (cell.getText().contains(mobileticket)) {
	 * cell.findElement(_celm); break; }if (cell.getText().contains(kiosk)) {
	 * cell.findElement(_celk).click(); break; }else if
	 * (cell.getText().contains(tod)) { cell.findElement(_celt).click(); break;
	 * }else { System.out.println("No Ticket available, try next time."); }
	 * 
	 * }
	 */

	@SuppressWarnings("unlikely-arg-type")
	public void mulittickettype() {
		WebElement table = driver.findElement(_row);
		List<WebElement> row = table.findElements(_table3);
		System.out.println("Up to now I find  " + getTextFromElement(_row) + " element on page.");
		System.out.println("No of Rows: " + row.size());
		// row.contains(_cels);
		// List<WebElement> celtry = table.findElements(_cele);

		if (row.contains(_cele)) {
			JavaScriptForScrolldown(_cele);
			javascriptexecutor(_cele);
		} else if (row.contains(_celm)) {
			JavaScriptForScrolldown(_celm);
			javascriptexecutor(_celm);
		} else if (row.contains(_cels)) {
			JavaScriptForScrolldown(_cels);
			javascriptexecutor(_cels);
		} else if (row.contains(_celk)) {
			JavaScriptForScrolldown(_celk);
			javascriptexecutor(_celk);
		} else {
			row.contains(_celt);
			JavaScriptForScrolldown(_celt);
			javascriptexecutor(_celt);
		}
	}

	public void eticketdualfare() {
		WebElement tableI3 = driver.findElement(_tableI3);
		List<WebElement> row = tableI3.findElements(_row);
		System.out.println("Up to now I find  " + getTextFromElement(_row) + " element on page.");
		System.out.println("No of Rows: " + row.size());
		List<WebElement> celd = tableI3.findElements(_cele);
		System.out.println("Up to now I find  " + getTextFromElement(_cele) + " element on page.");
		System.out.println("No of Col: " + celd.size());
		JavaScriptForScrolldown(_addtobasket);
		javascriptexecutorelement(_cele, celd);
	}

	public void selfprintticketdualfare() {
		WebElement element = driver.findElement(_tableI3);
		List<WebElement> row = element.findElements(_row);
		System.out.println("Up to now I find  " + getTextFromElement(_row) + " element on page.");
		System.out.println("No of Rows: " + row.size());
		List<WebElement> celsp = element.findElements(_cels);
		System.out.println("Up to now I find  " + getTextFromElement(_cels) + " element on page.");
		System.out.println("No of Cell: " + celsp.size());
		JavaScriptForScrolldown(_addtobasket);
		javascriptexecutorelement(_cels, celsp);
	}

	public void TicketTypeExamples(String TicketType) {
		String elementXpath = loadprop.getproperty(TicketType);
		driver.findElement(By.xpath(elementXpath)).click();

	}

	public void SuggestionFareSelect() {
		waitAndClick(_suggestedfareselect, 10);
	}

	public void JourneySearchTitle() {
		System.out.println("Currently, user is on " + getTextFromElement(_headerjourneysearchtitle) + "page.");
	}

	public void AddToBasket() {
		waitForElementToBeInvisible(_obscures, 15);
		JavaScriptForScrolldown(_addtobasket);
		waitAndClick(_addtobasket, 12);
	}

	public void eticketradiobtnselect() {
		javascriptexecutor(_eticketradio);
	}

	public void mticketRadioButton() {
		waitForElementToBeInvisible(_obscures, 10);
		waitAndClick(_mticketradio, 5);
	}

	public void selfPrintRadioSelect() {
		javascriptexecutor(_selfprintradio);
	}

	public void eticketselectfare() {
		WebElement element = driver.findElement(_table3);
		List<WebElement> row = element.findElements(_row);
		System.out.println("Up to now I find  " + getTextFromElement(_row) + " element on page.");
		System.out.println("No of Rows: " + row.size());
		List<WebElement> cel = element.findElements(_cele);
		System.out.println("Up to now I find  " + getTextFromElement(_cele) + " element on page.");
		System.out.println("No of Cell: " + cel.size());
		JavaScriptForScrolldown(_cele);
		javascriptexecutor(_cele);
	}

	public void mticketselectfare() {
		WebElement element = driver.findElement(_table3);
		List<WebElement> row = element.findElements(_row);
		System.out.println("Up to now I find  " + getTextFromElement(_row) + " element on page.");
		System.out.println("No of Rows: " + row.size());
		List<WebElement> cel = element.findElements(_celm);
		System.out.println("Up to now I find  " + getTextFromElement(_celm) + " element on page.");
		System.out.println("No of Cell: " + cel.size());
		JavaScriptForScrolldown(_celm);
		javascriptexecutor(_celm);
	}

	public void selfprintticketselectfare() {
		WebElement element = driver.findElement(_table3);
		List<WebElement> row = element.findElements(_row);
		System.out.println("Up to now I find  " + getTextFromElement(_row) + " element on page.");
		System.out.println("No of Rows: " + row.size());
		List<WebElement> cel = element.findElements(_cels);
		System.out.println("Up to now I find  " + getTextFromElement(_cels) + " element on page.");
		System.out.println("No of Cell: " + cel.size());
		JavaScriptForScrolldown(_cels);
		javascriptexecutor(_cels);
	}

	public void kioskticketselectfare() {
		WebElement element = driver.findElement(_table3);
		List<WebElement> row = element.findElements(_row);
		System.out.println("Up to now I find  " + getTextFromElement(_row) + " element on page.");
		System.out.println("No of Rows: " + row.size());
		List<WebElement> cel = element.findElements(_celk);
		System.out.println("Up to now I find  " + getTextFromElement(_celk) + " element on page.");
		System.out.println("No of Cell: " + cel.size());
		JavaScriptForScrolldown(_celk);
		javascriptexecutor(_celk);
	}

	public void todticketselectfare() {
		WebElement element = driver.findElement(_table3);
		List<WebElement> row = element.findElements(_row);
		System.out.println("Up to now I find  " + getTextFromElement(_row) + " element on page.");
		System.out.println("No of Rows: " + row.size());
		List<WebElement> cel = element.findElements(_celt);
		System.out.println("Up to now I find  " + getTextFromElement(_celt) + " element on page.");
		System.out.println("No of Cell: " + cel.size());
		JavaScriptForScrolldown(_celt);
		javascriptexecutor(_celt);
	}

	public void carnetPricePrint() {
		waitForElementToBeVisible(_carnetpriceprint, 5);
		System.out.println("This is Carnet Ticket Price " + getTextFromElement(_carnetpriceprint) + ".");
	}

	public void Travelcardd1offpeakonetosix() {
		JavaScriptForScrolldown(_offpeakpriceonetosixzone);
		System.out.println("Off peak price on day 1: " + getTextFromElement(_offpeakpriceonetosixzone));
		waitAndClick(_offpeakpriceonetosixzone, 10);
	}
	public void selecDateTravecardD2() {
		WebElement element = driver.findElement(_travelcardcalendar2);
		waitAndClick(_travelcardcalendar2, 4);
		List<WebElement> travelcardday2 = element.findElements(_selectdatefortravelcard2);
		waitForElementToBeVisible(_selectdatefortravelcard2, 10);
		System.out.println("Up to now I find  " + getTextFromElement(_selectdatefortravelcard2) + " element on page.");
		System.out.println("No of Rows: " + travelcardday2.size());
		for (WebElement e : travelcardday2) {
			e.click();
			break;
		}
	}
	public void peakonetosixday2tc() {
		WebElement element = driver.findElement(_peakpriceonetosixzoneday2);
		if (element.isDisplayed()) {
			waitAndClick(_peakpriceonetosixzoneday2, 8);
		} else {
			waitAndClick(_offpeakpriceonetosixzoneday2, 8);
		}
	}
	public void plusBustabs() {
		JavaScriptForScrolldown(_plusbus);
		waitAndClick(_plusbus, 5);
	}
	public void chekcPlusBusStartDate() {
		clickOnElement(_plusbuscheckedstartdate);
	}
	public void checkPlusBusEndDate() {
		clickOnElement(_plusbuscheckedenddate);
	}
	public void firstClassFareSuggest() {
		waitForElementToBeVisible(_firstclassfaresuggested, 20);
		clickOnElement(_firstclassfaresuggested);
	}
	public void editTravellerNames() {
		clickOnElement(_edittravellernames);
	}
	public void addTravellerName() {
		waitAndClick(_addtravellernames, 4);
	}
	public void saveButtonOnAddTravellerPop() {
		waitAndClick(_savebuttonaddtraveller, 6);
	}
	public void fareOfSeasonTicketsOneMonth() {
		System.out.println(getTextFromElement(_onemonthseasonsticketprice));
		javascriptexecutor(_onemonthseasonsticketprice);
		// waitAndClick(_onemonthseasonsticketprice, 6);
		waitForElementToBeDisplay(_seasonticketaddtobasket, 15);
	}
	public void seasonTicketAddToBasket() {
		driver.switchTo().activeElement().click();
		javascriptexecutor(_seasonticketaddtobasket);
		
	}
	public void expandReturnFaresTable() {
		waitForElementToBeDisplay(_tableexpandreturnfares, 10);
		WebElement expand = driver.findElement(_tableexpandreturnfares);
		List<WebElement> expandbutton = expand.findElements(_expandreturnfarestable);
		waitForElementToBeInvisible(_obscures, 10);
		//System.out.println(getTextFromElement(_tableexpandreturnfares));
		System.out.println(getTextFromElement(_expandreturnfarestable));
		for (WebElement e : expandbutton) {
			e.click();
			break;
		}

	}
	

}
