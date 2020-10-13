@wip
Feature:

  Background:
  Given Go to webside home page
  When Click Men Clothing & Accessories
  When Click T-Shirts

  Scenario: TC01 See Female , Male , Childeren, Unisex options
  Given Check are all filter options displayed

  Scenario: TC02 all options should be clickable
  Given Check  all filter options are clickable

  Scenario: TC03 The products should display according to selected gender
  Given Click  Male option
  Then Click Filter Aclicable People
  Then See the filtered page