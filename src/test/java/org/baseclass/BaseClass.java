package org.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver d;

	public static WebDriver launchBrowser(String browserName) {

		switch (browserName) {

		case "chrome":
			WebDriverManager.chromedriver().setup();

			d = new ChromeDriver();

			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();

			d = new FirefoxDriver();

			break;

		default:

			System.out.println("Invalid Browser Name");
			break;
		}
		return d;

	}

	public static void navigateUrl(String url) {

		d.navigate().to(url);

	}

	public static void maximize() {

		d.manage().window().maximize();

	}

	public static void launchUrl(String url) {

		d.get(url);

	}

	public static void implicitywait(int i) {
		d.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);

	}

	public static void fillTextBox(WebElement e, String value) {

		e.sendKeys(value);

	}

	public static void click(WebElement e) {

		e.click();
	}

	public static void select(WebElement e, String selectorName, String value) {

		Select s = new Select(e);

		switch (selectorName) {

		case "value":
			s.selectByValue(value);
			break;

		case "visibletext":
			s.selectByValue(value);
			break;

		default:
			System.out.println("Invalid Selctor Name");
			break;
		}

	}

	public static void scroll(String value, WebElement e) {

		JavascriptExecutor js = (JavascriptExecutor) d;

		if (value.equals("scrolldown")) {

			js.executeScript("arguments[0].scrollIntoView(true)", e);
		} else {

			js.executeScript("arguments[0].scrollIntoView(false)", e);

		}

	}

	public static void quit() {

		d.quit();

	}

	public static String text(WebElement e) {

		return e.getText();

	}

	public static String attribute(WebElement e) {

		return e.getAttribute("value");

	}

	public static void windowsHandling(int i) {

		Set<String> allw = d.getWindowHandles();

		List<String> li = new ArrayList<String>();

		li.addAll(allw);
		d.switchTo().window(li.get(i));

	}

	public static void action(String name, WebElement e) {

		Actions a = new Actions(d);

		switch (name) {

		case "moveto":

			a.moveToElement(e).perform();

			break;

		case "click":

			a.click().perform();

			break;

		default:
			System.out.println("Invalid Actions");
			break;
		}

	}

	public static void screenShot(String filename) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) d;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File des = new File("D:\\eclipse-workspace\\FlipkartSample\\ScreenShot\\" + filename + ".png");

		FileUtils.copyFile(src, des);

	}

}
