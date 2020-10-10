Feature: When I click Sign Up button,I should be able to create a new user


  Background: User is on the google page
    Given User at SignUp page

  Scenario: user enters email address without @
    Given click sign up button
    Then verify there is error message for email


    Scenario: User enters name using letters and numbers
    Given user enters name using letters and numbers
    And click sign up button
    Then verify there is no error message for name


    Scenario: user enters nine digit phone number
    Given user enters nine digit phone number
      And click sign up button
    Then verify there is no error message for phone number


    Scenario: five digit password
    Given user enters short password
    Then verify there is an error message for password


