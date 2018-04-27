package com.RightMove.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.RightMove.Utilities.RM_BasePage;
import com.RightMove.Utilities.RM_Exceptional_Handling;

public class RM_BackGround_Pages extends RM_BasePage{
	

	public void goToApplication() throws RM_Exceptional_Handling{
		
		getURL();
		
	}

	public void verifyLogo() throws RM_Exceptional_Handling{
		
		WebElement Logo = driver.findElement(By.cssSelector("#rm-site-logo"));
		
		Logo.isDisplayed();
	}

	public void verifyPrimaryNav() throws RM_Exceptional_Handling{
		
		WebElement primaryNav = driver.findElement(By.cssSelector(".globalNav-link"));
		WebElement searchBar = driver.findElement(By.cssSelector("#searchLocation"));
		WebElement primaryNav_Buy = driver.findElement(By.cssSelector("a[class='globalNav-link'][data-analytics-label='buy']"));
		WebElement primaryNav_Rent = driver.findElement(By.cssSelector("a[class='globalNav-link'][data-analytics-label='rent']"));
		WebElement primaryNav_FindAgent = driver.findElement(By.cssSelector("a[class='globalNav-link'][data-analytics-label='find-agent']"));
		WebElement primaryNav_HousePrices= driver.findElement(By.cssSelector("a[class='globalNav-link'][data-analytics-label='house-prices']"));
		WebElement primaryNav_Commercial= driver.findElement(By.cssSelector("a[class='globalNav-link'][data-analytics-label='commercial']"));
		WebElement primaryNav_Overseas= driver.findElement(By.cssSelector("a[class='globalNav-link'][data-analytics-label='overseas']"));
		WebElement primaryNav_SignIn=driver.findElement(By.cssSelector(".globalNav-signin"));
		
		primaryNav.isDisplayed();
		verifyDisplayedMessage(primaryNav_Buy,"Buy");
		verifyDisplayedMessage(primaryNav_Rent,"Rent");
		verifyDisplayedMessage(primaryNav_FindAgent,"Find Agent");
		verifyDisplayedMessage(primaryNav_HousePrices,"House Prices");
		verifyDisplayedMessage(primaryNav_Commercial,"Commercial");
		verifyDisplayedMessage(primaryNav_Overseas,"Overseas");
		verifyDisplayedMessage(primaryNav_SignIn,"Sign In");
		searchBar.isDisplayed();
	}

	public void enterPostCode(String postcode) throws RM_Exceptional_Handling{
		
		WebElement postCode = driver.findElement(By.cssSelector("#searchLocation"));
		enterDetails(postCode ,postcode);
	}

}
