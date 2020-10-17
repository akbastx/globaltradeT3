@
Feature:Verifying menu test
  Background:
    Given user is on the homepage
  Scenario: Verify jewelry accessories menu

    And user click seller sign in
    And user enter email
    And user enter password
    And user click on log in button
    And user on the homepage
    When click on jewelry accessories
    Then verify is visible the all options under jewelery accessories