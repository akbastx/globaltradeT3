@abc
Feature: verifying option test
  Background:
    Given customer is on the homepage
    Scenario: verify Apple Ipad option menu

      And click on sign in
      And enter a valid email
      And enter a valid password
      And user click login button
      And search apple in search box
      And click on apple image
      Then Then click on 256GB option and verify info
      Then click on 32GB option and verify info
      Then click on 64GB option and verify info
      Then click on 128GB option and verify info
