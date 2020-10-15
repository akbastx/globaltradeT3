
Feature: US15
  Background: user is on the Global Trader page
    Given user is on the Global Trader page
    When  user hover over Cellphone & Communication under Categories
    And   user see all option on dropdown menu
    When  user clicks on Wallet Cases
    And   verify Products on the page

  Scenario: TC01_design_filter_option_should_be_accessible_under_cellphone&communications
    Then   verify Design Filter on the page

  Scenario: TC02_design_filter_option_should_be_selectable_under_cellphone&communications
    When select each option from design filter
    Then verify options are selected

  Scenario: TC03_design_filter_option_should_be_display_according_to_selected_option
    When user select Business option from Design filter
    When user clicks design search button
    Then verify products under Business option