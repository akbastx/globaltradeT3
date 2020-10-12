@scenario_outline
Feature: US9_Akbas_scenario_outline
  Scenario Outline: US9_Akbas_SignUp
    Given user is on the sign up page
    And user enters the email "<email>"
    And user enters the name "<name>"
    And user enters the phone "<phone>"
    And user enters the password "<password>"
    And user enters the re-password "<password>"
    And user submits the form
    Then verify the success message is visible
    Examples: test data for the data table test
      | email                  | name   | phone     | password |
            #positive
      | Juan101234578@gmail.com | Juan0123456 | 9579788186 | 123456Juan  |
      #Short password
      | abc6454343284@gmail.com   | sam123 | 122456789 | 123      |
      #email without @
      | abc6435432864gmail.com    | sam123 | 122456789 | 12345    |
      #short name
      | abc934548763@gmail.com    | Sam123 | 122456789 | 12345    |
      #short phone number
      | abc6543432584@gmail.com   | sam123 | 11        | 12345    |
      #short password
      | abc78645463284@gmail.com | sam123 | 122456789 | 1        |
      #spassword without letter
      | abc643754365284@gmail.com | sam123 | 122456789 | 12345    |
      #spassword without number
      | abc643543765284@gmail.com | sam123 | 122456789 | abcdfrsj |



