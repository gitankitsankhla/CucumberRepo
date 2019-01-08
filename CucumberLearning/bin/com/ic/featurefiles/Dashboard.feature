Feature: Dashboard Validation

  @Dashboard
  Scenario: After setting the preferences as dashboard, user should be navigated to the dashboard page, upon login.
    Given Login to the application with username as "ceidemo" and password as "saleem957"
    When user goes to page /ic/account/default-homepage
    Then page should be open and contain 'Default Homepage' as title
    Then select 'Dashboard' radio button and click on Submit
    Then logout from application
    Then Login to the application with username as "ceidemo" and password as "saleem957"
    Then Dashboard page should be open and selected tab should be "Dashboards"

  @Dashboard
  Scenario: Create Dashboard With Pulu Europe
    Given Login to the application with username as "ceidemo" and password as "saleem957"
    When Click on Dashboard tab
    Then Click on plus icon for new dashboard creation
    Then Select pulp and europe and click on Finish button
    Then Verify created dashboard having name as "Pulp Europe"
