import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepLogin {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("BDD test Given: user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("BDD test When: user enters username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("BDD test And: clicks on login button");
	}

	@Then("user navigates to the homepage")
	public void user_navigates_to_the_homepage() {
		System.out.println("BDD test Then: user navigates to the homepage");
	}
}
