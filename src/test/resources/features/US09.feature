@hoo
Feature:

  Scenario: TC01  if there is no product I should see "Record Not Found.."
  Given Go to webside home page
  When Click Men Clothing & Accessories
  Then Click Shirt option
  Then Click Casual Shirts
  Then See if there is no item