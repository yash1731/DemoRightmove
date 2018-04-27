package com.RightMove.StepDefs;



import com.RightMove.Utilities.RM_BrowserFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class RM_Hooks {
	
    RM_BrowserFactory browser = new RM_BrowserFactory();
	
	@Before
	public void beforeScenario(){
		
		browser.getDriver("firefox");
		
	}
	
	@After
    public void afterScenario()
	{	
	//browser.clearCookies();
	browser.closeDeviceWebDriver();
		
	}

}
