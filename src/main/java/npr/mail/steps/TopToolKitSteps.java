package npr.mail.steps;

import org.openqa.selenium.WebDriver;

import npr.mail.page.TopToolKitPage;

public class TopToolKitSteps extends Steps {

	TopToolKitPage topToolKitPage;
	
	public TopToolKitSteps(WebDriver driver) {
		super(driver);
		topToolKitPage = new TopToolKitPage(driver);
    }
	
	public void clickOnButtonNewEmail() {
		try {
			Thread.sleep(5000);
		}catch (InterruptedException ex){
			System.out.println("Перехвачена ощибка сна");
		}
		
		log.logStartStep("Нажать кнопку \"Написать письмо\" ");
		topToolKitPage.clickOnButtonNewEmail();
		log.logEndStep();
	}

	public void clickOnButtonSendEmail() {
		try {
			Thread.sleep(5000);
		}catch (InterruptedException ex){
			System.out.println("Перехвачена ощибка сна");
		}
		log.logStartStep("Нажать кнопку \"Отправить\" ");
		topToolKitPage.clickOnButtonSendEmail();
		log.logEndStep();
	}
	
	public void clickOnButtonSelectAllDropDown() {
		try {
			Thread.sleep(5000);
		}catch (InterruptedException ex){
			System.out.println("Перехвачена ощибка сна");
		}
		log.logStartStep("Раскрыть выпадающий список, что бы \"Выделить все письма\" ");
		topToolKitPage.clickOnButtonSelectAllDropDown();
		log.logEndStep();
	}
	public void clickOnButtonSelectAll() {
		try {
			Thread.sleep(5000);
		}catch (InterruptedException ex){
			System.out.println("Перехвачена ощибка сна");
		}
		log.logStartStep("Нажать кнопку \"Выделить все письма\" ");
		topToolKitPage.clickOnButtonSelectAll();
		log.logEndStep();
	}
	
	
	

	public void clickOnButtonDelete() {
		try {
			Thread.sleep(5000);
		}catch (InterruptedException ex){
			System.out.println("Перехвачена ощибка сна");
		}
		log.logStartStep("Нажать кнопку \"Удалить\" ");
		topToolKitPage.clickOnButtonDelete();
		log.logEndStep();
	}
}

