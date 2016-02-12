package npr.mail.steps;

import org.openqa.selenium.WebDriver;

import npr.mail.page.LeftNavigationMenuPage;

public class LeftNavigationMenuSteps extends Steps {

	LeftNavigationMenuPage leftNavigationMenuPage;
	
	public LeftNavigationMenuSteps(WebDriver driver) {
		super(driver);
		leftNavigationMenuPage = new LeftNavigationMenuPage(driver);
    }
	
	public void clickOnLinkInBox(){
		try {
			Thread.sleep(5000);
		}catch (InterruptedException ex){
			System.out.println("Перехвачена ощибка сна");
		}
		log.logStartStep("Нажать ссылку \"Входящие\" ");
		leftNavigationMenuPage.clickOnLinkInBox();
		log.logEndStep();
	}

}
