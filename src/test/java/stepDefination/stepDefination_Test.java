package stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefination_Test {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() {
    	System.out.println("Use is on Landing Page");
        
    }


    @When("^User login into Net Banking application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_net_banking_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }


    @Then("^Home page is displayed$")
    public void home_page_is_displayed() {
    	System.out.println("Home page is displayed");
        
    }

    @And("^All Credit card information are displayed \"([^\"]*)\"$")
    public void all_Credit_card_information_are_displayed(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg1);
    }

}