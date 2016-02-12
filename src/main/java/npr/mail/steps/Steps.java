package npr.mail.steps;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestListener;
import npr.mail.util.Logger;
import npr.mail.util.PropertiesLoader;

public class Steps  {

	protected Logger log = new Logger();

	protected static WebDriver driver;

	protected PropertiesLoader property = new PropertiesLoader();

	public Steps(WebDriver driver) {
		this.driver = driver;
	}

	String filePath = "./target";

	public static WebDriver getDriverInstans(){
		return driver;
	}


}
