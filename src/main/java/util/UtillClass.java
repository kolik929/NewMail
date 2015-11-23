package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;




public class UtillClass {
	
	final static Logger logger = Logger.getLogger(Object.class); 

	
	public UtillClass startLog(String message){
		logger.info(message);
		return this;

		
	}

	public UtillClass endLog(String message){
		logger.info(message);
		return this;

		
	}

	public void waitElement(WebDriver driver,WebElement newElement){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(newElement));
		
	}
	
}
