package com.evolvitest.AutoEvovliRail;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BasePage {
	
	LoadProp loadprop = new LoadProp();
	
	//to click on element
    public static void clickOnElement(By by) {
    	driver.findElement(by).click();
    	}    
    //to click on Mulitple elements
    public static void clickOnElements(By by) {
    	Boolean isPresent = driver.findElements(by).size()>0;
    	if(isPresent == true) {
    		isPresent.toString();
    	}
    	}
    // to clear and enter text
    public static void clearAndEnterText(By by, String text) {
    	driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
        }
    // to enter text
    public static void enterText(By by, String text) {
    	driver.findElement(by).sendKeys(text);
    	}
    // to get text from element
    public static String getTextFromElement(By by) {
    	return driver.findElement(by).getText();
    	}
    //copy text from element in string
    public String getTextOfElement(By by){
    	String elementText = driver.findElement(by).getText();
    	return elementText;
    	}
    // paste text in textfield from string
    	public String enterTextInField (By by, String elementText){
    	driver.findElement(by).clear();
    	driver.findElement(by).sendKeys(elementText);
		return elementText;
    	} 
    
    // for creating timestamp to use in email
    public static String timestamp() {
    	DateFormat format = new SimpleDateFormat("DDMMYYHHMM");
        return format.format(new Date());
        }
    //mouse hover with double click on element and move to somewhere else
    public static void mouseHover(By by) {
    	WebElement myelement = driver.findElement(by);
    	Actions action = new Actions(driver);  			
    	action.doubleClick();
    	//action.moveByOffset(0, 500);
    	action.moveToElement(myelement).click();
    	action.build().perform();
        }

    // to wait for element to be invisible
    public static void waitForElementToBeInvisible(By by, int time) {
    	WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
        }
    public static void waitForElementToBeVisible(By by, int time) {
    	WebDriverWait wait = new WebDriverWait(driver,  time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }

     // to wait for element to be display
    public static void waitForElementToBeDisplay(By by,int time) { 
    	WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
        }

    // to selecct from droplist by visible text
    public static void selectByVisibleText(By by, String name) {
    	new Select(driver.findElement(by)).selectByVisibleText(name);
    	}

    // to select ffrom droplist by index
    public static void selectByIndex(By by, int numb) {
    	new Select(driver.findElement(by)).selectByIndex(numb);
    	}

    // to wait and click
    public static void waitAndClick(By by,int time) { 
    	WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
        }

    //get text from given location
    public static String getText(By by) { 
    	driver.findElement(by).isDisplayed();
        return driver.findElement(by).getText();
        }    
    public static void javascriptexecutor (By by) {
		WebElement elements = driver.findElement(by);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();", elements);
    	}
    @SuppressWarnings("unlikely-arg-type")
	protected void javascriptexecutorelement(By by, List<WebElement> element) {
		WebElement elements = driver.findElement(by);
		List <WebElement> ele = elements.findElements(by);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.equals(ele);
	}
    
    public void scrolltoviewelement(By by) {
    	WebElement myelement = driver.findElement(by);
    	JavascriptExecutor jse2 = (JavascriptExecutor)driver;
    	jse2.executeScript("arguments[0].scrollIntoView()", myelement); 
    }
    public void JavaScriptForScrolldown(By by) {
        WebElement myelement = driver.findElement(by);
        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("window.scrollBy (0,1500)", myelement); 
        }
    public void JavaScriptForScrollUp(By by) {
        WebElement myelement = driver.findElement(by);
        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("window.scrollBy (0,-1500)", myelement); 
        }
    public void ExamplesMethod (String deliverymethod) {
		String elementXpath = loadprop.getproperty(deliverymethod);
		driver.findElement(By.xpath(elementXpath)).click();
	}
  //mouse hover with double click on element and move to somewhere else
    public void actionsMethod(By by) {
    	WebElement slider = driver.findElement(by);
    	Actions act = new Actions(driver);
    	act.clickAndHold(slider);
    	act.moveByOffset(0, 38);
    	act.release().build().perform();
    }
    
    public void mouseHoverOnElement (By by) {
    	WebElement element = driver.findElement(by);
    	Actions act = new Actions(driver);
    	act.click(element);
    	act.build().perform();
    }
    //upload files
    public void uploadFilesFromDesktop(By by, String locatorOfFile) {
    	WebElement uploadabc = driver.findElement(by);
    	uploadabc.sendKeys(locatorOfFile);
    }
    
    


}
