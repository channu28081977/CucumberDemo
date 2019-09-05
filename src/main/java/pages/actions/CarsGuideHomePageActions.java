package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomepageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {
	CarsGuideHomepageLocators carsGuideHomepageLocators = null;

	public CarsGuideHomePageActions() {
		this.carsGuideHomepageLocators = new CarsGuideHomepageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomepageLocators);
	}

	public void moveToBuySellMenu() {
		Actions actions = new Actions(SeleniumDriver.getDriver());
		actions.moveToElement(carsGuideHomepageLocators.buyAndSellLink).perform();
	}

	// first call moveToBuySellMenu()
	public void clickOnSearchCarsMenu() {
		carsGuideHomepageLocators.SearchCarsLink.click();
	}

	// first call moveToBuySellMenu()
	public void clickOnUsedCarsMenu() {
		carsGuideHomepageLocators.UsedCarsLink.click();
	}

	public void moveToReviewMenu() {
		Actions actions = new Actions(SeleniumDriver.getDriver());
		actions.moveToElement(carsGuideHomepageLocators.reviewsLink).perform();
	}
}
