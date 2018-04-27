@Sale @all

Feature:  Selling properties Test Scenarios
Description:  As a Buyer
              I want to access RightMove website to see the list of  properties to buy
              so that I can do inquiry to visit property
              
              
Background:   Verify that the user can access the Right Move website

Given         RightMove home page is opened in a browser
Then          Verify the title of the website
And           Verify the primary navigations and search bar are displayed
When          User enter the post code in the search bar
              |    postcode        |
              |    E14             |


Scenario:     Verify user can search property to buy using filters and can select the non-featured property for more details              

And           Click on the To Sale Button
Then          Verify the filters page appeared
And           User can verify the header message regarding property to sale 
When          User select the filters
And           Click on the Find Properties button
Then          List of matching properties are displayed
And           Verify list of featured properties
And           Verify list of non featured properties
And           Sort the list to the newest
When          User select on the first non-featured property
Then          Verify the selected property details page is appeared   