package npr.mail.steps;

import org.openqa.selenium.WebDriver;

import npr.mail.page.EmailListPage;

public class EmailListSteps extends Steps {

	EmailListPage emailListPage;
	
	public EmailListSteps(WebDriver driver) {
		super(driver);
		emailListPage = new EmailListPage(driver);
    }
	
	public void clickOnButtonNewEmail(){
		try {
			Thread.sleep(5000);
		}catch (InterruptedException ex){
			System.out.println("Перехвачена ощибка сна");
		}
		log.logStartStep("Нажать ссылку \"Тема\" в последнем присланном письме и провалиться в тело письма");
		emailListPage.clickOnLinkLastEmailSubject();
		log.logEndStep();
	}

}
