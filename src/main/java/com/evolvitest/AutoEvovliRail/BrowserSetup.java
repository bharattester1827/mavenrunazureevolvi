package com.evolvitest.AutoEvovliRail;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetup extends BasePage {
	
	LoadProp loadprop = new LoadProp();
	String browser = loadprop.getproperty("Browser");
	
	//creating method for multi browser
    public void selectBrowser(){
        
        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","src\\test\\java\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src\\test\\java\\BrowserDriver\\MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","src\\test\\java\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }else{System.out.print("Wrong Browser");
        }
    }

}
