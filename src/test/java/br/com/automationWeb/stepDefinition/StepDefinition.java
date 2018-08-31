package br.com.automationWeb.stepDefinition;

import br.com.automationWeb.stepBusiness.StepBusiness;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinition {

	private StepBusiness stepB;
	
	
	@SuppressWarnings("static-access")
	@Given("^inicializo aplicacao web com a 'url' \"([^\"]*)\"$")
	public void inicializo_aplicacao_web_com_a_url(String arg1) throws Throwable {
	   stepB.getInstance().setUpUrl(arg1);
	}
	
	@SuppressWarnings("static-access")
	@When("^insiro no botao busca a 'informacao' \"([^\"]*)\"$")
	public void insiro_no_botao_busca_a_informacao(String arg1) throws Throwable {
	   stepB.getInstance().insertPesquisa(arg1);
	}


	@SuppressWarnings("static-access")
	@When("^clico em buscar$")
	public void clico_em_buscar() throws Throwable {
		stepB.getInstance().clickButtonPesquisa();
	}
	

}
