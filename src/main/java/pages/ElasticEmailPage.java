package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElasticEmailPage {

	WebDriverWait wait;
	
	public ElasticEmailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}
	
	@FindBy(id = "101_homepage_1st_section")
	private WebElement buttonTryForFree;
	
	@FindBy(xpath = "//h1[text()='Choose Product']")
	private WebElement txtChooseProduct;
	
	@FindBy(id = "702_select_api")
	private WebElement buttonTryForFreeEmailApi;
	
	@FindBy(id = "efirstname")
	private WebElement fieldFirstname;
	
	@FindBy(id = "elastname")
	private WebElement fieldLastname;

	@FindBy(id = "eusername")
	private WebElement fieldUsername;
	
	@FindBy(id = "epassword")
	private WebElement fieldPassword;
	
	@FindBy(id = "eterms")
	private WebElement checkboxTerms;
	
	@FindBy(xpath = "//h2[text()='Registe-se']")
	private WebElement txtRegistese;
	
	@FindBy(id = "eregisterend")
	private WebElement buttonRegistese;
	
	@FindBy(xpath = "//div[@class='MuiBox-root eem11']")
	private WebElement txtOla;
	
	public ElasticEmailPage clickTryForFree() {
		buttonTryForFree.click();
		return this;
	}
	
	public String txtTitleChooseProduct() {
		wait.until(ExpectedConditions.visibilityOf(txtChooseProduct));
		return txtChooseProduct.getText();
	}
	
	public ElasticEmailPage clickTryForFreeEmailApi() {
		buttonTryForFreeEmailApi.click();
		return this;
	}
	
	public String txtTitleRegistese() {
		wait.until(ExpectedConditions.visibilityOf(txtRegistese));
		return txtRegistese.getText();
	}
	
	public ElasticEmailPage sendFirstname(String text) {
		fieldFirstname.sendKeys(text);
		return this;
	}
	
	public ElasticEmailPage sendLastname(String text) {
		fieldLastname.sendKeys(text);
		return this;
	}
	
	public ElasticEmailPage sendUsername(String text) {
		fieldUsername.sendKeys(text);
		return this;
	}

	
	public ElasticEmailPage sendPassword(String text) {
		fieldPassword.sendKeys(text);
		return this;
	}

	public ElasticEmailPage clickTerms() {
		checkboxTerms.click();
		return this;
	}
	
	public ElasticEmailPage clickRegistese() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(buttonRegistese));
		buttonRegistese.click();
		return this;
	}
	
	public String txtOlaNome() {
		wait.until(ExpectedConditions.visibilityOf(txtOla));
		return txtOla.getText();
	}
	
}
