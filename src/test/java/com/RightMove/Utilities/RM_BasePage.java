package com.RightMove.Utilities;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RM_BasePage extends RM_BrowserFactory{
	
	
	// get application URL
	public static void getURL(){
		
		String url = "http://www.rightmove.co.uk/";
		driver.get(url);
	}
	
	// click method
		public static void click(WebElement element){
			element.click();
		}
		
		
	   //verify text 
	    public static void verifyDisplayedMessage(WebElement string, String message){
	      try{
	          assertEquals(message,string.getText());
	      }catch (Exception e){
	          System.out.println("Cannot find the Message");
	      }
	      }
	    
	    //enter details
	    public void enterDetails(WebElement element, String value){
	        element.clear();
	        element.sendKeys(value);
	    }
	   
	//generate random email id
		public static String getEmailId(){
	        String email = ( UUID.randomUUID().toString()).replaceAll("-", "");
	        System.out.println("Random email generated is " + email);
	        return email;
	        //.substring(0, length);
	    }

	//getAllOPtionsOfDropdown
    public void  getAllOptions(WebElement element){
    	Select select = new Select(element);
    	List<WebElement> dropdownOptions = select.getOptions();
    int 	itemCount = dropdownOptions.size();
    System.out.println("Total number of options in a dropdown is " + itemCount);
    	for(int l = 0; l < itemCount; l++)
    	{
    	    System.out.println(dropdownOptions.get(l).getText());
    	}
    	
    	
    }
    
    
}
