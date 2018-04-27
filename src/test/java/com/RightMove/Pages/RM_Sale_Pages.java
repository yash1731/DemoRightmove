package com.RightMove.Pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.RightMove.Utilities.RM_BasePage;
import com.RightMove.Utilities.RM_Exceptional_Handling;

public class RM_Sale_Pages extends RM_BasePage{

	public void clickForSaleButton() throws RM_Exceptional_Handling{
	
		WebElement forSaleButton = driver.findElement(By.cssSelector("#buy"));
		
		click(forSaleButton );
	}

	public void verifyFilterPage() throws RM_Exceptional_Handling{
		
		WebElement filterArea = driver.findElement(By.cssSelector("#buyingsearchcriteria"));
		filterArea .isDisplayed();
		
	}

	public void verifyPageHeader() throws RM_Exceptional_Handling {
		
		WebElement headerTitle = driver.findElement(By.cssSelector("#headerTitle"));
		verifyDisplayedMessage(headerTitle,"property for sale in E14");
	}

	public void selectFilters() throws RM_Exceptional_Handling, InterruptedException {
		
		WebElement searchRadius = driver.findElement(By.xpath(".//*[@id='primarycriteria']/div[2]/label"));
		WebElement searchRadiusBox = driver.findElement(By.cssSelector("#radius"));
		WebElement priceRange = driver.findElement(By.xpath(".//*[@id='primarycriteria']/div[3]/label"));
		WebElement minPriceBox = driver.findElement(By.cssSelector("#minPrice"));
		WebElement maxPriceBox = driver.findElement(By.cssSelector("#maxPrice"));
		WebElement bedRooms = driver.findElement(By.xpath(".//*[@id='primarycriteria']/div[4]/label"));
		WebElement propertyType = driver.findElement(By.xpath(".//*[@id='secondarycriteria']/div[1]/label"));
		WebElement addedToSite = driver.findElement(By.xpath(".//*[@id='secondarycriteria']/div[2]/label"));
		WebElement minbedRoomsBox = driver.findElement(By.cssSelector("#minBedrooms"));
		WebElement maxbedRoomsBox = driver.findElement(By.cssSelector("#maxBedrooms"));
		WebElement propertyTypeBox = driver.findElement(By.cssSelector("#displayPropertyType"));
		WebElement addedToSiteBox = driver.findElement(By.cssSelector("#maxDaysSinceAdded"));
		
		
		
		//verifications of filter
		verifyDisplayedMessage(searchRadius,"Search radius");
		searchRadiusBox.isDisplayed();
		verifyDisplayedMessage(priceRange,"Price range (£)");
		minPriceBox.isDisplayed();
		maxPriceBox.isDisplayed();
		verifyDisplayedMessage(bedRooms,"No. of bedrooms");
		minbedRoomsBox.isDisplayed();
		maxbedRoomsBox.isDisplayed();
		verifyDisplayedMessage(propertyType,"Property type");
		propertyTypeBox.isDisplayed();
		verifyDisplayedMessage(addedToSite,"Added to site");
		addedToSiteBox.isDisplayed();
		
		//Get all the options of Search by Radius
		Thread.sleep(3000);
		getAllOptions(searchRadiusBox);
		verifyDisplayedMessage(searchRadiusBox,"This postcode only\nWithin ¼ mile\n" +
		                        "Within ½ mile\nWithin 1 mile\nWithin 3 miles" +
				                "\nWithin 5 miles\nWithin 10 miles\nWithin 15 miles\n" +
		                        "Within 20 miles\nWithin 30 miles\nWithin 40 miles");
		
		//Select the random option from the search radius dropdown
		
		int searchRadiusOption_Size = driver.findElements(By.cssSelector("#radius>option")).size();
		 Random random = new Random();
	        int randomOption = random.nextInt(searchRadiusOption_Size)+1;
	        System.out.println("The Selected random option index is " + randomOption);
	        
	        if(randomOption>0 && randomOption<=searchRadiusOption_Size){
	           
	         	searchRadiusBox.click();
	         	WebElement selectedradiusOption = driver.findElement(By.xpath(".//*[@id='radius']/option[" + randomOption +"]"));
	         	System.out.println(selectedradiusOption.getText());
	            selectedradiusOption.click();
	            
	         	}
	        
	        //randomly selecting minimum price option
	        getAllOptions(minPriceBox);
	        int minPrice_Size = driver.findElements(By.cssSelector("#minPrice>option")).size();
			 Random minPricerandom = new Random();
		        int minPricerandomOption = minPricerandom.nextInt(minPrice_Size)+1;
		        System.out.println("The Selected random option index is " + minPricerandomOption);
		        
		        if(minPricerandomOption>0 && minPricerandomOption<=minPrice_Size){
		           
		           	minPriceBox.click();
		         	WebElement selectedminPriceOption = driver.findElement(By.xpath(".//*[@id='minPrice']/option["+minPricerandomOption+"]"));
		         	System.out.println(selectedminPriceOption.getText());
		         	selectedminPriceOption.click();
		            
		         	}
		        
		        getAllOptions(minbedRoomsBox);
		        verifyDisplayedMessage(minbedRoomsBox,"No min\nStudio\n" +
                        "1\n2\n3" +
		                "\n4\n5");

		        int minbedRoomsBox_Size = driver.findElements(By.cssSelector("#minBedrooms>option")).size();
				 Random minbedRoomsBoxrandom = new Random();
			        int minbedRoomsBoxrandomOption = minbedRoomsBoxrandom.nextInt(minbedRoomsBox_Size)+1;
			        System.out.println("The Selected random option index is " + minbedRoomsBoxrandomOption);
			        
			        if(minbedRoomsBoxrandomOption>0 && minbedRoomsBoxrandomOption<=minbedRoomsBox_Size){
			           
			        	    minbedRoomsBox.click();
			         	WebElement selectedminbedRoomsOption = driver.findElement(By.xpath(".//*[@id='minBedrooms']/option["+ minbedRoomsBoxrandomOption +"]"));
			         	System.out.println(selectedminbedRoomsOption.getText());
			         	selectedminbedRoomsOption.click();
			            
			         	}
			        
	}

	public void clickFindProperties() throws InterruptedException,RM_Exceptional_Handling {
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, -250);");
		WebElement findPropertiesButton= driver.findElement(By.cssSelector("#submit"));
		findPropertiesButton.isDisplayed();
		click(findPropertiesButton);
	}

	public void verifyMatchesList() throws RM_Exceptional_Handling{
		WebElement matchingList= driver.findElement(By.cssSelector(".searchHeader-resultCount"));
		matchingList.isDisplayed();
	}

	public void listFeaturedProperties() throws RM_Exceptional_Handling{
		int FeaturedProperties = driver.findElements(By.cssSelector(".propertyCard-moreInfoFeaturedTitle")).size();
		System.out.println("Total number of featured properties are " + FeaturedProperties);
	}

	public void listNONFeaturedProperties() throws InterruptedException ,RM_Exceptional_Handling {
		int paginationSize = driver.findElements(By.cssSelector(".select.pagination-dropdown>option")).size();
		System.out.println("Total number of pages are " + paginationSize);
		/*for(int i =1;i<=paginationSize;i++){
			System.out.println("Displaying page '" + i + "' list ");
			int NonFeaturedProperties = driver.findElements(By.cssSelector(".propertyCard-moreInfo")).size();
			System.out.println("Total number of non-featured properties are " + NonFeaturedProperties);
			WebElement nextPage = driver.findElement(By.xpath(".//*[@id='l-container']/div[3]/div/div/div/div[2]/div/select/option[" + i +"]"));
			Thread.sleep(3000);
			click(nextPage);
		}*/
		
	}

	public void sortFilterToNewest() throws InterruptedException {
		WebElement sortOptions = driver.findElement(By.cssSelector("#sortType"));
		getAllOptions(sortOptions );
		Thread.sleep(5000);
		verifyDisplayedMessage(sortOptions,"Highest Price\nLowest Price\n" +
                "Newest Listed\nOldest Listed" );
		Select select = new Select(sortOptions);
		select.selectByVisibleText("Newest Listed");

	}

	public void selectNonFeatured() {
		int NonFeaturedProperties = driver.findElements(By.cssSelector(".propertyCard-moreInfo")).size();
		System.out.println("Total number of non-featured properties are " + NonFeaturedProperties);
		Random random = new Random();
		int randomoption = random.nextInt(NonFeaturedProperties);
		System.out.println("Selected property index is --> " + randomoption);
		if(randomoption>1&&randomoption<=NonFeaturedProperties){
		WebElement selectNonFeatured = driver.findElement(By.xpath(".//*[@id='l-searchResults']/div["+randomoption+"]/div/div[1]/div[4]/div[1]"));
		click(selectNonFeatured);
		}else  if(randomoption==0){
			WebElement selectNonFeatured = driver.findElement(By.xpath(".//*[@id='l-searchResults']/div[2]/div/div[1]/div[4]/div[1]"));
			click(selectNonFeatured);
		}else{
			System.out.println("No search element found");
		}
	}

	public void verifyPropertyDetailPage() throws InterruptedException {
		Thread.sleep(3000);
		WebElement header = driver.findElement(By.cssSelector(".fs-22"));
		header.isDisplayed();
	}

}
