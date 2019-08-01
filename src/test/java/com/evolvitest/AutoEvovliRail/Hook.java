package com.evolvitest.AutoEvovliRail;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hook extends BasePage {
	
	BrowserSetup browsersetup = new BrowserSetup();
	LoadProp loadprop = new LoadProp();
	
	
	@Before
	public void openBrowser()
    {
        // so it will open browser which mention in testdataconfig file.
        browsersetup.selectBrowser();
        driver.get(loadprop.getproperty("url"));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);        
    }
	
	@After
    public void screenshot(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            try {
                // Code to capture and embed images in test reports (if scenario fails)
            	final File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          	  	FileUtils.copyFile(screenshot, new File("src\\test\\Resrouceses\\ScreenShots\\" + System.currentTimeMillis()+"\\testfailed.png"));
          	  
          	   }catch (WebDriverException somePlatformsDontSupportScreenshots){
          	   	System.err.println(somePlatformsDontSupportScreenshots.getMessage());
          	   
          	   }
            //driver.close();
        }
	}

}
