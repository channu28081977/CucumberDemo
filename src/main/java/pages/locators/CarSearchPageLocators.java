package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarSearchPageLocators {
@FindBy(how=How.XPATH, using="//select[@id='makes']")
public WebElement carMakeDropDown;

@FindBy(how=How.XPATH, using="//select[@id='models']")
public WebElement selectModelDropDown;

@FindBy(how=How.XPATH, using="//select[@id='locations']")
public WebElement selectLocationDropDown;

@FindBy(how=How.XPATH, using="//select[@id='priceTo']")
public WebElement selectpriceDropDown;

@FindBy(how=How.XPATH, using="//input[@id='search-submit']")
public WebElement findMyNextCarBtn;

}
