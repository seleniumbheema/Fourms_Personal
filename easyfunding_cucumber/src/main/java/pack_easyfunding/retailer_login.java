package pack_easyfunding;


import pack_easyfunding_utill.webconnector_Easyfund;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
Scenario: user want to search for retauilers
Given I go to "LogingURL" on "Mozilla"
And click on "Retailers"
And click on "amazon.co.uk"
And click on "shopnow"
 */
public class retailer_login 
{
	
	webconnector_Easyfund connect = new webconnector_Easyfund();
	
	@Given("^I go to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_go(String URL, String browsertype)
	{
		System.out.println("I go to "+URL+" on "+browsertype );
		connect.browsertype(browsertype);
		connect.navigate(URL);
	}
	@And("^click on \"([^\"]*)\"$")
	public void click_on(String objects)
	{
		System.out.println("Click on "+objects);
		connect.link(objects);
		
	}
	
	@Then("^do the \"([^\"]*)\"$")
	public void do_the(String objects)
	{
		System.out.println("do the "+objects);
		connect.clicking(objects);
	}
	
	/*
	Given swift to "tabbedwindow"
	And I enter "username" as "usernamevalue"
	And I enter "password" as "password value"
	And I click on "login"
	*/

/*	@Given("^swift to \"([^\"]*)\"$")
	public void swift_to(String tab)
	{
		System.out.println("Swift to "+tab);
		connect.swift(tab);
	}*/
	@And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void I_enter(String objct, String txt) throws InterruptedException
	{
		System.out.println("I enter "+ objct + " as "+txt);
		connect.I_enter(objct, txt);
	}
	@And("^I click on \"([^\"]*)\"$")
	public void I_click(String objct)
	{
		System.out.println("I click on "+ objct);
		connect.submit(objct);
	}
}
