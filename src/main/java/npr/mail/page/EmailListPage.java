package npr.mail.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EmailListPage extends BasePage {

	
	@FindBy(how = How.XPATH, using = "(.//*[@id='b-letters']//div[@class='b-datalist__item__addr'])[1]")
	private WebElement lastSubjectLink;
	
	public EmailListPage(WebDriver driver) {
	    super(driver);
	 }
	
	public void clickOnLinkLastEmailSubject(){
		wait.until(ExpectedConditions.elementToBeClickable(lastSubjectLink));
		lastSubjectLink.click();
	}

}
