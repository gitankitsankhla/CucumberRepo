Feature: Verify functionality of Price page

  @Price
  Scenario: Verify price search for user loads with 2 yrs of history
    Given Login to the application with username as "tst_ppapw" and password as "B1om@ss"
    When user goes to /ic/prices
    Then search for some prices
    Then select prices to be shown in the graph
    Then user can see 2 years of history
