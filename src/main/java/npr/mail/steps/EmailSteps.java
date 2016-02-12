package npr.mail.steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import npr.mail.page.EmailPage;

public class EmailSteps extends Steps {

	EmailPage emailPage;
	
	public EmailSteps(WebDriver driver) {
		super(driver);
		emailPage = new EmailPage(driver);
    }
	
	public void setTextTo(String val){
		log.logStartStep("В поле \"Кому\" ввести текст: \""+val+"\"");
		emailPage.setTextTo(val);
		log.logEndStep();
	}
	
	public void setTextSubject(String val){
		log.logStartStep("В поле \"Тема\" ввести текст: \""+val+"\"");
		emailPage.setTextSubject(val);
		log.logEndStep();
	}
	
	public void setTextBody(String val){
		log.logStartStep("В поле \"Тело письма\" ввести текст: \""+val+"\"");
		emailPage.setTextBody(val);
		log.logEndStep();
	}
	
	public String getTextBody(){
		log.logStartStep("Забираем значение из поля \"Тело письма\" ");
		String body = emailPage.getTextBody();
		log.logEndStep();
		return body;
	}
	
	public void assertBodyContainsText(String expected, String actual){
		log.logStartStep("Проверяем что \"Тело письма\" содержит текст");
		Assert.assertTrue(actual.contains(expected), "Ошибка при проверке поля \"Тело письма\". Ожидаемое значение: "+expected+". Текущее значение: "+actual);
		log.logEndStep();
	}
}
