package npr.mail.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage  {



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

	@FindBy(how = How.XPATH, using = "*[@id='b-toolbar__right']//a/span[contains(.,'Выделить')]")//
	private WebElement checkBoxAllMail2;

	@FindBy(how = How.XPATH, using = "(.//span[text()='Удалить'])[1]")
	private WebElement dellAll;

	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

}
