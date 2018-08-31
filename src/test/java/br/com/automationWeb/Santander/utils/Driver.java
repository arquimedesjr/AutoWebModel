package br.com.automationWeb.Santander.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.automationWeb.pages.PageHome;

public class Driver {
	private WebDriver driver;
	private WebDriverWait wait;
	private PageHome pageHome;
	
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public WebDriverWait getWait() {
		return wait;
	}
	public void setWait(WebDriverWait wait) {
		this.wait = wait;
	}
	public PageHome getPageHome() {
		return pageHome;
	}
	public void setPageHome(PageHome pageHome) {
		this.pageHome = pageHome;
	}

}
