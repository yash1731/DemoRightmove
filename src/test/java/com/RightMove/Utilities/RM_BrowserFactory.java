package com.RightMove.Utilities;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class RM_BrowserFactory {
	
public  static WebDriver driver ;
    
	
	public WebDriver getDriver(String browserName)
	{
	
	if(browserName.equalsIgnoreCase("safari"))
	{
		driver = new SafariDriver();
		
	}
	
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		
	System.setProperty("webdriver.gecko.driver","//Users//yashpaldewangan//Downloads//geckodriver");
	driver = new FirefoxDriver();
	
	}
	else if(browserName.equalsIgnoreCase("chrome"))
	{	
	System.setProperty("webdriver.chrome.driver","//Users//yashpaldewangan//Downloads//chromedriver");
	driver = new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;

	}
	
	public void clearCookies() {
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie cookie : cookies) {
           driver.manage().deleteCookie(cookie);
        }
	}
	
	
	public void closeDeviceWebDriver() {
		
        if (driver != null) {
            driver.close();
            driver = null;
        }
	}  
      
	
	public void refresh() {
		
		driver.navigate().refresh();
		
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
	

}
