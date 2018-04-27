package com.RightMove.Pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.RightMove.Utilities.RM_BasePage;

public class RM_Letting_Page extends RM_BasePage{

	public void clickToRentButton() {
		
		WebElement ToRentButton = driver.findElement(By.cssSelector("#rent"));
		click(ToRentButton );
		
	}

	public void verifyHeaderTitle() {
		WebElement headerTitle = driver.findElement(By.cssSelector("#headerTitle"));
		verifyDisplayedMessage(headerTitle,"property to rent in E14");
	
	}

	public void sortByFilter() throws InterruptedException {
		WebElement sortOptions = driver.findElement(By.cssSelector("#sortType"));
		getAllOptions(sortOptions );
		Thread.sleep(5000);
		verifyDisplayedMessage(sortOptions,"Newest Listed\nOldest Listed\n" +
                "Highest Price\nLowest Price" );
		Select select = new Select(sortOptions);
		select.selectByVisibleText("Newest Listed");
	}
	
	public void selectNonFeaturedToRent(){
		int NonFeaturedProperties = driver.findElements(By.cssSelector(".propertyCard-section")).size();
		System.out.println("Total number of non-featured properties are " + NonFeaturedProperties);
		Random random = new Random();
		int randomoption = random.nextInt(NonFeaturedProperties);
		System.out.println("Selected property index is --> " + randomoption);
		if(randomoption>1&&randomoption<=NonFeaturedProperties){
		WebElement selectNonFeatured = driver.findElement(By.xpath(".//*[@id='l-searchResults']/div["+randomoption+"]/div/div[1]/div[4]/div[1]"));
		click(selectNonFeatured);
		}else{
			WebElement selectNonFeatured = driver.findElement(By.xpath(".//*[@id='l-searchResults']/div[2]/div/div[1]/div[4]/div[1]"));
			click(selectNonFeatured);
		}
	}

	public void verifyFilterPage() {
		WebElement filterArea = driver.findElement(By.cssSelector("#lettingsearchcriteria"));
		filterArea .isDisplayed();
	}

}
