package br.com.automationWeb.pages;

import org.openqa.selenium.By;

public class PageHome {

	private By txtPesquisa = By.xpath("//input[@id='lst-ib']");
	
	private By buttonPesquisa = By.xpath("//div[@class='jsb']//input[@value='Pesquisa Google']");
	
	private By pageGoogle = By.xpath("//div[@id='viewport']");
	
	

	public By getPageGoogle() {
		return pageGoogle;
	}

	public By getButtonPesquisa() {
		return buttonPesquisa;
	}

	public By getTxtPesquisa() {
		return txtPesquisa;
	}




}
