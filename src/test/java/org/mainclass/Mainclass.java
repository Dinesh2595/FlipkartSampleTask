package org.mainclass;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.datasample.DataInfo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pageinfo.PageInfo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Mainclass extends BaseClass {

	@BeforeClass
	public void beforeTest() {

		launchBrowser("chrome");

		maximize();

		implicitywait(20);

	}

	@Test(dataProvider = "flipkart", dataProviderClass = DataInfo.class)
	public void test(String user, String pass, String p1, String p2) throws InterruptedException {

		navigateUrl("https://www.flipkart.com/");

		PageInfo p = new PageInfo();
		
		
		WebDriverWait w= new WebDriverWait(d, 20);

		click(p.getClose());

		click(p.getLoginButton());

		fillTextBox(p.getUserName(), user);

		fillTextBox(p.getPass(), pass);

		click(p.getLogin());
		
		Thread.sleep(2000);

		fillTextBox(p.getSearch(), p1);
		
		
		p.getSearch().sendKeys(Keys.ENTER);

	

		click(p.getProduct1());

		windowsHandling(1);

		click(p.getCart());
		
		Thread.sleep(3000);

		d.close();
		
		windowsHandling(0);
		
		d.navigate().back();
		
		fillTextBox(p.getSearch(), p2);
		
		p.getSearch().sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		click(p.getProduct2());

		windowsHandling(1);

		click(p.getCart());
		
		scroll("scrolldown",p.getScrollby());
		
		
		Thread.sleep(2000);
				
		
		click(p.getRemove());

		click(p.getAgainRemove());
		
		Thread.sleep(1000);

		if (text(p.getProductName()).contains("APPLE iPhone")) {

			System.out.println("Item is in the Cart");

		} else {
			System.out.println("Item is not  present");
		}

		d.close();

		windowsHandling(0);
		
		d.navigate().back();
		
		Thread.sleep(2000);

		action("moveto", p.getMyAccount());

		click(p.getLogout());
		
		Thread.sleep(3000);

	}

	@AfterClass
	private void afterTest() throws IOException {

		screenShot("Flipkart");

		// quit();

	}

}
