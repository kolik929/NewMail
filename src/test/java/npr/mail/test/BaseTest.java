package npr.mail.test;

import npr.mail.steps.EmailListSteps;
import npr.mail.steps.EmailSteps;
import npr.mail.steps.LeftNavigationMenuSteps;
import npr.mail.steps.LoginSteps;
import npr.mail.steps.TopToolKitSteps;
import npr.mail.util.PropertiesLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {

	 protected WebDriver driver;
	 protected LoginSteps loginSteps;
	 protected TopToolKitSteps topToolKitSteps;
	 protected EmailSteps emailSteps;
	 protected LeftNavigationMenuSteps leftNavigationMenuSteps;
	 protected EmailListSteps emailListSteps;
	 
	@BeforeTest
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		this.driver = new ChromeDriver();	
		driver.manage().window().maximize();
		loginSteps = new LoginSteps(driver);
		topToolKitSteps  = new TopToolKitSteps(driver);
		emailSteps = new EmailSteps(driver);
		leftNavigationMenuSteps = new LeftNavigationMenuSteps(driver);
		emailListSteps = new EmailListSteps(driver);
		driver.get(PropertiesLoader.getProperty("mainUrl"));
	}
	
	@AfterTest(alwaysRun = true)
	public void closeBrowser() {
		try{
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		driver.quit();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
