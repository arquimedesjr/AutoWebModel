package br.com.automationWeb.stepBusiness;


import br.com.automationWeb.Santander.utils.ConnectionDriver;
import br.com.automationWeb.Santander.utils.ScreenShot;

public class StepBusiness {

	private static StepBusiness stepB;
	private static ConnectionDriver connection;
	private static ScreenShot screenShot;

	public static StepBusiness getInstance() {
		if (stepB == null) {
			stepB = new StepBusiness();
			connection = new ConnectionDriver();
			screenShot = new ScreenShot();
		}
		return stepB;
	}

	public void setUp() {
		connection.setUpDriver();

	}
	public void close() {
		connection.getDriver().close();
	}

	public void setUpUrl(String string) throws InterruptedException {
		connection.getDriver().get(string);
		connection.timeouts(connection.getPageHome().getTxtPesquisa());
		screenShot.takeScreenShotTest(connection.getDriver());
	}
	
	public void insertPesquisa(String string) {
		connection.sendKeys(connection.getPageHome().getTxtPesquisa(), string);
		connection.click(connection.getPageHome().getPageGoogle());
		screenShot.takeScreenShotTest(connection.getDriver());
	}
	
	public void clickButtonPesquisa() {
		connection.click(connection.getPageHome().getButtonPesquisa());
		screenShot.takeScreenShotTest(connection.getDriver());
		
	}

}
