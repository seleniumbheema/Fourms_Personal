Feature: Search car in Gumtree

In order to search for audi card
As a Customer
I want to search the car in area


Scenario: user want to search for new cars 
Given I go to "LogingURL" on "Mozilla"
And pass parameter in "looking" as "audi"
And pass parameter in "location" as "surrey"
And pass parameter in "miles" as "50 miles"
Then click on "search"

