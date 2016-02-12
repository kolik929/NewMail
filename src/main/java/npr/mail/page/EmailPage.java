package npr.mail.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EmailPage extends BasePage {

	
	@FindBy(how = How.XPATH, using = ".//textarea[@data-original-name='To']")
	private WebElement toField;
	
	@FindBy(how = How.XPATH, using = ".//input[@name='Subject']")
	private WebElement subjectInput;
	
	@FindBy(how = How.XPATH, using = ".//iframe[contains(@id,'compose')]")
	private WebElement frame;
	
	@FindBy(how = How.XPATH, using = ".//body")
	private WebElement inputText;
	
	@FindBy(how = How.XPATH, using = ".//*[contains(@id,'style')][contains(@id,'BODY')]")
	private WebElement bodyField;
	
	public EmailPage(WebDriver driver) {
	    super(driver);
	 }
	
	public void setTextTo(String val){
		wait.until(ExpectedConditions.elementToBeClickable(toField));
		toField.clear();
		toField.sendKeys(val);
	}
	
	public void setTextSubject(String val){
		wait.until(ExpectedConditions.elementToBeClickable(subjectInput));
		subjectInput.clear();
		subjectInput.sendKeys(val);
	}

	public void setTextBody(String val){
		wait.until(ExpectedConditions.elementToBeClickable(frame));
		String id = frame.getAttribute("id");
		driver.switchTo().frame(id);
		inputText.clear();
		inputText.sendKeys(val);
		driver.switchTo().defaultContent();
	}
	
	public String getTextBody(){
		wait.until(ExpectedConditions.elementToBeClickable(bodyField));
		return bodyField.getText();
	}
}
