Feature: Search for cars audi	

In order to searching
As a car seeker
I want to search my audi car

Scenario: serach for audi cars in surrey area
Given I go to "LogingURL" on "Mozilla"
And pass parameter in "looking" as "cucumbername"
And pass parameter in "location" as "description"
And pass parameter in "miles" as "50 miles"
Then click on "search"