package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.UtillClass;

public class MainPage extends UtillClass {



	private WebDriver driver;

	@FindBy(how = How.XPATH, using = ".//*[@id='b-toolbar__left']//span")
	private WebElement writeNewMail;

	@FindBy(how = How.XPATH, using = ".//*[@id='compose__header__content']/div[2]/div[2]/div[1]/textarea[2]")
	private WebElement inputSendName;


	@FindBy(how = How.XPATH, using = ".//*[@class='compose__header__field']")
	private WebElement inputThemе;

	@FindBy(how = How.XPATH, using = ".//body")
	private WebElement inputText;

	@FindBy(how = How.XPATH, using = ".//*[@id='b-toolbar__right']//span[contains(.,'Отправить')]")
	private WebElement btnSendMail;

	@FindBy(how = How.XPATH, using = ".//*[@id='b-nav_folders']//span[contains(.,'Входящие')]")
	private WebElement btnInBox;

	@FindBy(how = How.XPATH, using = "(.//*[@id='b-letters']//div[@class='b-datalist__item__addr'])[1]")
	private WebElement openNewLetter;

	@FindBy(how = How.XPATH, using = ".//*[contains(@id,'style')][contains(@id,'BODY')]")
	private WebElement checkText;

	@FindBy(how = How.CSS, using = ".b-datalist__item__addr:contains('Test Test')")
	private WebElement inBoxTheme;

	@FindBy(how = How.CSS, using = "div.b-dropdown.b-dropdown_selectAll > div.b-dropdown__ctrl")
	private WebElement checkBoxAllMail;

	@FindBy(how = How.XPATH, using = "//*[@id='b-toolbar__right']//a/span[contains(.,'Выделить')]")
	private WebElement checkBoxAllMail2;

	@FindBy(how = How.XPATH, using = "(.//span[text()='Удалить'])[1]")
	private WebElement dellAll;

	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public MainPage writeNewMail() {
		startLog("Нажимаем кнопку Новое письмо ");

		waitElement(driver, writeNewMail);
		writeNewMail.click();
		endLog("Нажали на кнопку Новое письмо");
		return this;
	}

	public MainPage inputSendName(String sendName) {
		startLog("Вводим получателя ");

		waitElement(driver, inputSendName);
		inputSendName.clear();
		inputSendName.sendKeys(sendName);
		endLog("Ввели получателя");

		return this;

	}

	public MainPage inputTheme(String theme) {
		startLog("Вводим тему ");

		inputThemе.clear();
		inputThemе.sendKeys(theme);
		endLog("Вели тему");
		return this;

	}

	public MainPage inputText(String text) {
		startLog("Вводим Текст письма");

		startLog("Переключаемся между фреймами");
		driver.switchTo().frame((WebElement) driver.findElement(By.xpath(".//iframe[contains(@id,'compose')]")));
		endLog("Переключились между фреймам");

		inputText.clear();
		inputText.sendKeys(text);
		endLog("Ввели Текст письма");
		driver.switchTo().defaultContent();
		return this;

	}

	public MainPage sendMail() {
		startLog("Кликаем отправить ");

		btnSendMail.click();
		endLog("Отправили письмо");
		return this;
	}

	public MainPage clicInBox() {
		startLog("Переходим во вкладку Входящие ");

		waitElement(driver, btnInBox);
		btnInBox.click();
		endLog("Перешли во вкладку Входящие");
		return this;
	}

	public MainPage openNewLetter() {
		startLog("Открываем последнее входящее письмо ");
	
		waitElement(driver, openNewLetter);
		openNewLetter.click();
		return this;
	}

	public MainPage checkText(String text) {
		startLog("Проверяем текст только что присланного письма ");

		waitElement(driver, checkText);
		if (checkText.getText().contains(text)) {
			System.out.println("Письмо пришло");
		} else {
			System.out.println("Письмо не пришло!");
		}
		endLog("Проверили что письмо пришло");
		return this;
	}

	public MainPage checkBoxAll() {

		waitElement(driver, checkBoxAllMail);

		startLog("Открываем всплывающее меню, что бы отметить чекбоксами все письма ");
		checkBoxAllMail.click();
		endLog("Меню открыто");
		
		waitElement(driver, checkBoxAllMail2);

		startLog("Отмечаем все письма");
		try {
			checkBoxAllMail2.click();
		} catch (org.openqa.selenium.StaleElementReferenceException e) {

		}

		endLog("Отметили все письма ");

		return this;
	}

	public MainPage dellAll() {
		startLog("Удаляем выбранные письма ");

		waitElement(driver, dellAll);
		dellAll.click();
		endLog("Письма удалены");
		return this;
	}

}
