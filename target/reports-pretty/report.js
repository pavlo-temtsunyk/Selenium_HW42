$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FormSubmit.feature");
formatter.feature({
  "line": 1,
  "name": "Eshop automation",
  "description": "",
  "id": "eshop-automation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Form filling and submit it",
  "description": "",
  "id": "eshop-automation;form-filling-and-submit-it",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigates to the app url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user goes to women department",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user selects an item",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user selects a black color",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user adds item to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user proceeds to the checkout",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user proceeds to the checkout again",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user inputs the email \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user inputs the password and signs in \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user updates invoice address \"\u003caddress\u003e\",\"\u003ccity\u003e\",\"\u003czip\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user confirms the address",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user clicks continue on shipping method",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user selects payment by check and submits order",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "form is submitted",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "eshop-automation;form-filling-and-submit-it;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "address",
        "city",
        "zip"
      ],
      "line": 22,
      "id": "eshop-automation;form-filling-and-submit-it;;1"
    },
    {
      "cells": [
        "mymail@yopmail.com",
        "MyPassword",
        "Peremohy ave",
        "Palatine",
        "60704"
      ],
      "line": 23,
      "id": "eshop-automation;form-filling-and-submit-it;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3240816369,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Form filling and submit it",
  "description": "",
  "id": "eshop-automation;form-filling-and-submit-it;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigates to the app url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user goes to women department",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user selects an item",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user selects a black color",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user adds item to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user proceeds to the checkout",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user proceeds to the checkout again",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user inputs the email \"mymail@yopmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user inputs the password and signs in \"MyPassword\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user updates invoice address \"Peremohy ave\",\"Palatine\",\"60704\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user confirms the address",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user clicks continue on shipping method",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user selects payment by check and submits order",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "form is submitted",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.someTestInfo()"
});
formatter.result({
  "duration": 1514871023,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userGoesToWomenDepartment()"
});
formatter.result({
  "duration": 1182062458,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userSelectsAnItem()"
});
formatter.result({
  "duration": 783196711,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userSelectsABlackColor()"
});
formatter.result({
  "duration": 235021461,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userAddsItemToTheCart()"
});
formatter.result({
  "duration": 98462013,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userProceedsToTheCheckout()"
});
formatter.result({
  "duration": 1250290303,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userProceedsToTheCheckoutAgain()"
});
formatter.result({
  "duration": 1051739127,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mymail@yopmail.com",
      "offset": 23
    }
  ],
  "location": "MyStepdefs.userInputsTheEmail(String)"
});
formatter.result({
  "duration": 168962828,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MyPassword",
      "offset": 39
    }
  ],
  "location": "MyStepdefs.userInputsThePassword(String)"
});
formatter.result({
  "duration": 1190549726,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Peremohy ave",
      "offset": 30
    },
    {
      "val": "Palatine",
      "offset": 45
    },
    {
      "val": "60704",
      "offset": 56
    }
  ],
  "location": "MyStepdefs.userUpdatesInvoiceAddress(String,String,String)"
});
formatter.result({
  "duration": 2043527737,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userConfirmsTheAddress()"
});
formatter.result({
  "duration": 653465380,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClicksContinueOnShippingMethod()"
});
formatter.result({
  "duration": 718385107,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userSelectsPaymentByCheckAndSubmitsOrder()"
});
formatter.result({
  "duration": 1981738676,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.formIsSubmitted()"
});
formatter.result({
  "duration": 41619859,
  "status": "passed"
});
});