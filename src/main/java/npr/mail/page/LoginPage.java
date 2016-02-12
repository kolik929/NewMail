package npr.mail.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

	
	@FindBy(how = How.NAME, using="Login")
	private WebElement loginInput;
	
	@FindBy(how = How.NAME, using="Password")
	private WebElement passwordInput;
	
	@FindBy(how = How.NAME, using="Domain")
	private WebElement selectDomain;

	@FindBy(how = How.ID, using = "mailbox__auth__button")
	private WebElement submitBtn;
	
	public LoginPage(WebDriver driver) {
	    super(driver);
	 }
	
	
	public void setTextLogin(String val){
		wait.until(ExpectedConditions.elementToBeClickable(loginInput));
		loginInput.clear();
		loginInput.sendKeys(val);
	}
	
	public void setTextPassword(String val){
		wait.until(ExpectedConditions.elementToBeClickable(passwordInput));
		passwordInput.clear();
		passwordInput.sendKeys(val);
	}
	
	public void clickOnButtonSubmit(){
		wait.until(ExpectedConditions.elementToBeClickable(passwordInput));
		submitBtn.click();
	}


}
