@run
Feature:

  Background:
  Given Go to webside home page
  When Click Men Clothing & Accessories
  Then Click T-Shirts

  Scenario: TC01 Check are all filter options displayed
  Given Check all filter options should be displayed

  Scenario: TC02 Check  all filter options are clickable
  Given Check  all filter options are clickable

  Scenario: Check  Male filter should be shown
  Given Check  Male options
  Then See the filtered page