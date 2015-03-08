package pack.carsearch;

import pack.carsearch.utill.webconnector_gum;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class searching 
{

	webconnector_gum connector = new webconnector_gum();
	
	@Given("^I go to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_go_to(String url, String browsertype)
	{
		System.out.println("I go to "+url+" on "+ browsertype);
		connector.openbrowser(browsertype);
		connector.navigate(url);
		
	}
	
	@And("^pass parameter in \"([^\"]*)\" as \"([^\"]*)\"$")
	public void pass_param(String objctname, String text)
	{
		System.out.println("pass paramter "+objctname+" as " + text);
	}
	@Then("^click on \"([^\"]*)\"$")
	public void click(String object)
	{
		System.out.println("click on "+ object);
	}
}
