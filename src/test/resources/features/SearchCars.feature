@Search-Cars
Feature: Acceptence testing to validate Search Cars page is working fine.
	In order to validate that
	the Search Cars page is working fine
	we will do the Acceptence testing
	
@Search-Cars-Positive	
Scenario: Validate Search Cars page
Given I am on the Home Page "https://www.carsguide.com.au/" of carsguide website
When I move to the menu
	| menu				|
	| buy + sell		|
	| reviews			|
And I click on "Search Cars" link	
And I select carbrand as "BMW" from AnyMake dropdown
And I select carmodel as "1 Series" from SelectModel dropdown
And I select location as "NSW - All" from SelectLocation dropdown
And I select price as "$10,000" from price dropdown
And I click on FIND_MY_NEXT_CAR button
And I should see the list of Searched cars
And the page titile should be "Bmw 1 Series Under 10000 for Sale NSW | carsguide"

