package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {
	//CarsGuideHomePageActions class methods can be used here and also 
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	
	CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();
	
	@Given("^I am on the Home Page \"([^\"]*)\" of carsguide website$")
	public void i_am_on_the_Home_Page_of_carsguide_website(String websiteURL) throws Throwable {
	   SeleniumDriver.openPage(websiteURL);
	}

	@When("^I move to the menu$")
	public void i_move_to_the_menu(List<String> list) throws Throwable {
	   String menu = list.get(1); //list.get(1)---> | 0 -- menu	| 1-- Buy+sell | 2-- reviews |	
	   System.out.println("menu selected is : " +menu);
	   carsGuideHomePageActions.moveToBuySellMenu();
	}

	@And("^I click on \"([^\"]*)\" link$")
	public void i_click_on_link(String SearchCars) throws Throwable {
		carsGuideHomePageActions.clickOnSearchCarsMenu();
	}

	@And("^I select carbrand as \"([^\"]*)\" from AnyMake dropdown$")
	public void i_select_carbrand_as_from_AnyMake_dropdown(String carBrand) throws Throwable {
	    carsSearchPageActions.selectCarMake(carBrand);
	}

	@And("^I select carmodel as \"([^\"]*)\" from SelectModel dropdown$")
	public void i_select_carmodel_as_from_SelectModel_dropdown(String carModel) throws Throwable {
	    carsSearchPageActions.selectCarModel(carModel);
	}

	@And("^I select location as \"([^\"]*)\" from SelectLocation dropdown$")
	public void i_select_location_as_from_SelectLocation_dropdown(String location) throws Throwable {
		carsSearchPageActions.selectLocation(location);
	}

	@And("^I select price as \"([^\"]*)\" from price dropdown$")
	public void i_select_price_as_from_price_dropdown(String carPrice) throws Throwable {
		carsSearchPageActions.selectCarPrice(carPrice);
	}

	@And("^I click on FIND_MY_NEXT_CAR button$")
	public void i_click_on_FIND_MY_NEXT_CAR_button() throws Throwable {
	   carsSearchPageActions.clickOnFindMyNextCarBtn();
	}

	@And("^I should see the list of Searched cars$")
	public void i_should_see_the_list_of_Searched_cars() throws Throwable {
	   System.out.println("cars list found");
	}

	@And("^the page titile should be \"([^\"]*)\"$")
	public void the_page_titile_should_be(String expectedTitle) throws Throwable {
	   String actualTitle = SeleniumDriver.getDriver().getTitle(); 
	   Assert.assertEquals(actualTitle, expectedTitle);
	}


	
}
