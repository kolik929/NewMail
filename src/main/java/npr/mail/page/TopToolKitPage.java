package npr.mail.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TopToolKitPage extends BasePage {

	
	@FindBy(how = How.XPATH, using = ".//span[text()='Написать письмо']")
	private WebElement newEmailButton;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Отправить']")
	private WebElement sendButton;
	
	@FindBy(how = How.XPATH, using = ".//div[@title='Выделить']")
	private WebElement selectAllButtonDropDown;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Выделить все письма']")
	private WebElement selectAllButton;
	
	
	@FindBy(how = How.XPATH, using =  ".//span[text()='Удалить']")
	private WebElement deleteButton;
	
	public TopToolKitPage(WebDriver driver) {
	    super(driver);
	 }
	
	public void clickOnButtonNewEmail(){
		
		try{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(newEmailButton));
		newEmailButton.click();
	}

	public void clickOnButtonSendEmail() {
		wait.until(ExpectedConditions.elementToBeClickable(sendButton));
		sendButton.click();
	}
	
	public void clickOnButtonSelectAllDropDown() {
		try{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		wait.until(ExpectedConditions.elementToBeClickable(selectAllButtonDropDown));
		selectAllButtonDropDown.click();
		
	}

	
	public void clickOnButtonSelectAll() {
		try{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		wait.until(ExpectedConditions.elementToBeClickable(selectAllButton));
		selectAllButton.click();
		
	}
	
	public void clickOnButtonDelete() {
		try{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
		deleteButton.click();
	}

}
