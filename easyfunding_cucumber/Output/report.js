$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("pack_easyfunding/Specification.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping through easyfundraisingwebsite",
  "description": "\r\nIn order to search for amazonkindle\r\nAs a User\r\nI want to search the amazon through easyfundingsite",
  "id": "shopping-through-easyfundraisingwebsite",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "user want to search for retailers",
  "description": "",
  "id": "shopping-through-easyfundraisingwebsite;user-want-to-search-for-retailers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I go to \"LogingURL\" on \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "click on \"Retailers\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on \"amazon.co.uk\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "do the \"shopnow\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "LogingURL",
      "offset": 9
    },
    {
      "val": "Chrome",
      "offset": 24
    }
  ],
  "location": "retailer_login.I_go(String,String)"
});
formatter.result({
  "duration": 30917237968,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Retailers",
      "offset": 10
    }
  ],
  "location": "retailer_login.click_on(String)"
});
formatter.result({
  "duration": 463868760,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "amazon.co.uk",
      "offset": 10
    }
  ],
  "location": "retailer_login.click_on(String)"
});
formatter.result({
  "duration": 9225986292,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shopnow",
      "offset": 8
    }
  ],
  "location": "retailer_login.do_the(String)"
});
formatter.result({
  "duration": 3185302207,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "In new tab, passing username and password parameters",
  "description": "",
  "id": "shopping-through-easyfundraisingwebsite;in-new-tab,-passing-username-and-password-parameters",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "##Given swift to \"tabbedwindow\""
    }
  ],
  "line": 16,
  "name": "I enter \"username\" as \"textvalue\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter \"password\" as \"easyfunding1\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on \"login\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 9
    },
    {
      "val": "textvalue",
      "offset": 23
    }
  ],
  "location": "retailer_login.I_enter(String,String)"
});
formatter.result({
  "duration": 5001936247,
  "error_message": "java.lang.NullPointerException\r\n\tat pack_easyfunding_utill.webconnector_Easyfund.I_enter(webconnector_Easyfund.java:110)\r\n\tat pack_easyfunding.retailer_login.I_enter(retailer_login.java:60)\r\n\tat ✽.And I enter \"username\" as \"textvalue\"(pack_easyfunding/Specification.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 9
    },
    {
      "val": "easyfunding1",
      "offset": 23
    }
  ],
  "location": "retailer_login.I_enter(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "login",
      "offset": 12
    }
  ],
  "location": "retailer_login.I_click(String)"
});
formatter.result({
  "status": "skipped"
});
});