package br.com.automationWeb.Santander.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.automationWeb.pages.PageHome;

public class ConnectionDriver extends Driver {

	public void setUpDriver() {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver\\chromedriver.exe");
		setDriver(new ChromeDriver());
		getDriver().manage().window().maximize();

		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		setPageHome(PageFactory.initElements(getDriver(), PageHome.class));
		setWait(new WebDriverWait(getDriver(), 30));

	}

	public void setUpUrl(String string) {
		getDriver().get(string);
	}

	public void timeouts(By locator) {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void click(By by) {
		timeouts(by);
		getDriver().findElement(by).click();

	}
	public void sendKeys(By by, String string) {
		timeouts(by);
		getDriver().findElement(by).sendKeys(string);
	}

}
