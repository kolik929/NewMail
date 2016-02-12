package npr.mail.test;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import npr.mail.util.PropertiesLoader;



@Listeners({ npr.mail.util.Listener.class })
public class MailTest extends BaseTest {

	@Test(priority = 0)
	public void loginTest() {


		loginSteps.setTextLogin(PropertiesLoader.getProperty("login"));
		loginSteps.setTextPassword(PropertiesLoader.getProperty("password"));
		loginSteps.clickOnButtonSubmit();
		topToolKitSteps.clickOnButtonNewEmail();
		emailSteps.setTextTo(PropertiesLoader.getProperty("sendName"));
		emailSteps.setTextSubject(PropertiesLoader.getProperty("theme"));
		emailSteps.setTextBody(PropertiesLoader.getProperty("text"));
		topToolKitSteps.clickOnButtonSendEmail();
		leftNavigationMenuSteps.clickOnLinkInBox();
		emailListSteps.clickOnButtonNewEmail();
		emailSteps.assertBodyContainsText(PropertiesLoader.getProperty("text"), emailSteps.getTextBody());
		leftNavigationMenuSteps.clickOnLinkInBox();
		topToolKitSteps.clickOnButtonSelectAllDropDown();
		topToolKitSteps.clickOnButtonSelectAll();
		topToolKitSteps.clickOnButtonDelete();
		
	}
}

