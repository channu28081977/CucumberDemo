package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomepageLocators {

@FindBy(how=How.XPATH, using="//a[contains(text(),'buy + sell')]")
public WebElement buyAndSellLink; 

@FindBy(how=How.XPATH, using="//a[@class='uhf-top'][contains(text(),'reviews')]")
public WebElement reviewsLink; 

@FindBy(how=How.XPATH, using="//a[@class='uhf-top'][contains(text(),'news')]")
public WebElement newsLink ; 
	
@FindBy(how=How.XPATH, using="//a[contains(text(),'Search Cars')]")
public WebElement SearchCarsLink; 
	
@FindBy(how=How.XPATH, using="//li[@class='uhf-menu-item uhf-dropdown-menu-toggle uhf-menu-buysell']//div[@class='uhf-child-expand']//div[@class='uhf-child-content']//div[@class='uhf-child-menu']//ul//li//a[contains(text(),'Used')]")
public WebElement UsedCarsLink; 
	

}
