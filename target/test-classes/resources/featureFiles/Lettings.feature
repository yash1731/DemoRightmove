@Lettings @all

Feature:  Letting Test Scenarios
Description:  As a Tennant
              I want to access RightMove website to see the list of letting properties
              so that I can do inquiry to visit property
              
              
Background:   Verify that the user can access the Right Move website

Given         RightMove home page is opened in a browser
Then          Verify the title of the website
And           Verify the primary navigations and search bar are displayed
When          User enter the post code in the search bar
              |    postcode        |
              |    E14             |


Scenario:     Verify user can search property for rent using filters and can select the non-featured property for more details              

And           Click on the To Rent Button
Then          Verify the rent related filters page appeared 
And           User can verify the header message regarding property to rent 
When          User select the filters
And           Click on the Find Properties button
Then          List of matching properties are displayed
And           Verify list of featured properties
And           Verify list of non featured properties
And           Sort the list to the lowset price
When          User select on the first non-featured property to rent
Then          Verify the selected property details page is appeared             