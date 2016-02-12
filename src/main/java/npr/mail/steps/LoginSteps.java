package npr.mail.steps;

import org.openqa.selenium.WebDriver;

import npr.mail.page.LoginPage;

public class LoginSteps extends Steps {

	LoginPage loginPage;
	
	public LoginSteps(WebDriver driver) {
		super(driver);
		loginPage = new LoginPage(driver);
    }
	
	public void setTextLogin(String val){
		log.logStartStep("В поле \"имя ящика\" ввести текст: \""+val+"\"");
		loginPage.setTextLogin(val);
		log.logEndStep();
	}
	
	public void setTextPassword(String val){
		log.logStartStep("В поле \"пароль\" ввести текст: \""+val+"\"");
		loginPage.setTextPassword(val);
		log.logEndStep();
	}
	
	public void clickOnButtonSubmit(){
		log.logStartStep("Нажать кнопку \"Войти\"");
		loginPage.clickOnButtonSubmit();
		log.logEndStep();
	}
}
