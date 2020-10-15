
Feature: MaliGlbLoginAgentPositive

  Background: login functionality with possible scenarios
    Given user is on the Global Trader page
    When user click Seller Join Now
    When user select agent seller to register
  Scenario: TC02_TC01_user_should__not_able_to_register_as_an_agent_with_invalid_credentials
    When user fill out all fields except one mandatory field
    When user clicks Register button
    Then verify message You can not leave required field blank! Please try again.