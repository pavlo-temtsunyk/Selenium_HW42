Feature: Eshop automation

  Scenario Outline: Form filling and submit it
    Given user navigates to the app url
    When user goes to women department
    And user selects an item
    And user selects a black color
    And user adds item to the cart
    

    Then form is submitted


    Examples:
      | firstname | lastName  | dob  |  gender   | address  |   email   | pass  |  company | comment      |




