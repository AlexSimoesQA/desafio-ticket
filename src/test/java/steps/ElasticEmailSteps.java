package steps;

import static config.DriverFactory.getDriver;
import static config.DriverFactory.tearDown;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ElasticEmailPage;
import utils.GenerateUsername;

public class ElasticEmailSteps {
	
	ElasticEmailPage page = new ElasticEmailPage(getDriver());
	
	@Given("que eu acesse o site {string}")
	public void queEuAcesseOSite(String string) {
		getDriver().get(string);
	}

	@Given("clique em Try for Free")
	public void clique_em_try_for_free() {
	    page.clickTryForFree();
	}

	@Given("clique em Try for Free na opção Email API")
	public void clique_em_try_for_free_na_op_o_email_api() {
		
		assertEquals("Choose Product", page.txtTitleChooseProduct());
		
	    page.clickTryForFreeEmailApi();
	    
	}

	@When("preencher os campos com {string} {string} {string} {string}")
	public void preencher_os_campos(String firstName, String lastName, String email, String password) throws InterruptedException {
		
		assertEquals("Registe-Se", page.txtTitleRegistese());
		
		String username = GenerateUsername.generateUsername();
		
		page
		.sendFirstname(firstName)
		.sendLastname(lastName)
		.sendUsername(username + email)
		.sendPassword(password);
		
	}
	
	@When("aceitar os termos")
	public void aceitar_os_termos() {
	    page.clickTerms();
	}

	@When("clicar em Registe-se")
	public void clicar_em_registe_se() throws InterruptedException {
	    page.clickRegistese();
	}

	@Then("deve aparecer a mensagem Olá {string}")
	public void deve_aparecer_a_mensagem(String firstName) {
	    assertEquals("Olá "+firstName+"", page.txtOlaNome());
	}
	
	@After
	public void closeBrowser(Scenario scenario) {
		tearDown(scenario);
	}
}
