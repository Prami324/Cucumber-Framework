package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("User is on netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
		System.out.println("landing");
	    
	}
//	@When("User loginto application with {string} and password {string}")
//	public void user_loginto_application(String username, String password) {
//		System.out.println("Username"+ username+","+ "Password"+ password);
//	    
//			}
	
	@When("^User loginto application with (.+) and password (.+)$")
	public void user_loginto_application(String username, String password) {
		System.out.println("Username"+ username+","+ "Password"+ password);
	    
			}
	    
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    
		System.out.println("homepage");
		System.out.println("homepage");
		System.out.println("homepage");
		System.out.println("homepage");
	    
	}
	@Then("cards are displayed")
	public void cards_are_displayed() {
		System.out.println("cards");
	    
	}

	@Given("User is on practice landing page")
	public void user_is_on_practice_landing_page() {
	    
		System.out.println("practice landing page");
	}
	
	@When("User signup into application")
	public void user_signup_into_application_with(List<String> data) {
	    
	   System.out.println(data.get(0));
	   System.out.println(data.get(1));
	   System.out.println(data.get(2));
	   System.out.println(data.get(3));
	   System.out.println(data.get(4));
	}
	
	@Given("setup the entries in the database")
	public void setup_the_entries_in_the_database() {
	    
		System.out.println("setup_the_entries");
		System.out.println("************");
	}
	@When("launch the browser from config variables")
	public void launch_the_browser_from_config_variables() {
	    
		System.out.println("launch browser");
		System.out.println("************");
	}
	@When("hit the home page url of banking site")
	public void hit_the_home_page_url_of_banking_site() {
	    
		System.out.println("hit homepage url");
		System.out.println("************");
	}


	
	}