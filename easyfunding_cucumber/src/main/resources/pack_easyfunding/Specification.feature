Feature: Shopping through easyfundraisingwebsite

In order to search for amazonkindle
As a User
I want to search the amazon through easyfundingsite


Scenario: user want to search for retailers
Given I go to "LogingURL" on "Chrome"
And click on "Retailers"
And click on "amazon.co.uk"
Then do the "shopnow"

Scenario: In new tab, passing username and password parameters
##Given swift to "tabbedwindow"
And I enter "username" as "textvalue"
And I enter "password" as "easyfunding1"
And I click on "login"
