package npr.mail.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LeftNavigationMenuPage extends BasePage {

	
	@FindBy(how = How.XPATH, using = ".//a[span[contains(.,'Входящие')]]")
	private WebElement inBoxLink;
	
	public LeftNavigationMenuPage(WebDriver driver) {
	    super(driver);
	 }
	
	public void clickOnLinkInBox(){
		wait.until(ExpectedConditions.elementToBeClickable(inBoxLink));
		inBoxLink.click();
	}

}
