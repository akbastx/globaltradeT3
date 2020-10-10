Feature: When I click Sign Up button,I should be able to create a new user
  Scenario:

    Given User at SignUp page
    And user enters email address without @
    And click sign up button
    Then verify there is error message for email

    Given User at SignUp page
    And user enters name using letters and numbers
    And click sign up button
    Then verify there is no error message for name

    Given User at SignUp page
    And user enters nine digit phone number
    And click sign up button
    Then verify there is no error message for phone number

    Given User at SignUp page
    And enter email with @
    And user enters name using number and letter
    And enters five digit password
    Then verify there is an error message for password

