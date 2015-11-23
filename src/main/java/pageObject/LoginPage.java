package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import util.UtillClass;

public class LoginPage extends UtillClass {



	private WebDriver driver;
	
	@FindBy(how = How.NAME, using="Login")
	private WebElement loginInput;
	
	@FindBy(how = How.NAME, using="Password")
	private WebElement passwordInput;
	
	@FindBy(how = How.NAME, using="Domain")
	private WebElement selectDomain;

	@FindBy(how = How.ID, using = "mailbox__auth__button")
	private WebElement submitBtn;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
	public LoginPage setLogin(String login) {
		startLog("В поле User Name вводим "+login);

		loginInput.clear();
		loginInput.sendKeys(login);
		endLog("Логин введен");
		return this;
		
	}
	
	public LoginPage setPassword(String password) {
		startLog("В поле Password вводим "+password);

		passwordInput.clear();
		passwordInput.sendKeys(password);
		endLog("Password введен");
		return this;
	}
	
	public LoginPage setPassMeal0(String domain){
		startLog("Выбираем домен "+ domain);

		new Select(selectDomain).selectByVisibleText(domain);
		endLog("Выбрали домен");
		return this;
		
	}

	public MainPage clickSubmitBtn() {
		startLog("Нажимаем кнопку 'Войти'");

		submitBtn.click();
		endLog("Кнопка Войти нажата");
		return new MainPage(driver);
	}	
	

}
