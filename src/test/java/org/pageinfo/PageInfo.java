package org.pageinfo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PageInfo extends BaseClass {

	public PageInfo() {

		PageFactory.initElements(d, this);
	}

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement close;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement userName;

	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement pass;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']//child::span")
	private WebElement login;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement search;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement enter;
	
    @CacheLookup
	@FindBy(xpath = "(//div[@class='_4rR01T'])[1]")
	private WebElement product1;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement cart;
   
	@FindBy(xpath = "(//div[@class='_4rR01T'])[1]")
	private WebElement product2;
	
	@FindBy(xpath="//div[@class='_10vWcL td-FUv WDiNrH']")
	private WebElement scrollby;

	@FindBy(xpath = "//div[@class='_10vWcL td-FUv WDiNrH']//following-sibling::div")
	private WebElement remove;

	@FindBy(xpath = "//div[@class='_3dsJAO _24d-qY FhkMJZ']")
	private WebElement againRemove;

	@FindBy(xpath = "//a[@class='_2Kn22P gBNbID']")
	private WebElement productName;

	@FindBy(xpath = "//div[text()='My Account']")
	private WebElement myAccount;

	@FindBy(xpath = "//div[text()='Logout']")
	private WebElement logout;

	public WebElement getClose() {
		return close;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getEnter() {
		return enter;
	}

	public WebElement getProduct1() {
		return product1;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getProduct2() {
		return product2;
	}

	public WebElement getRemove() {
		return remove;
	}

	public WebElement getAgainRemove() {
		return againRemove;
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getScrollby() {
		return scrollby;
	}
	
	

}
