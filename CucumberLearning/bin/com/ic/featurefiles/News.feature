Feature: Verify functionality of News

  @News
  Scenario: If user enters a search term in the search bar, the search should be run when the user hits Enter
    Given Login to the application with username as "ceidemo" and password as "saleem957"
    When User clicks on Search under News tab
    Then Click on Search button
    Then element having xpath "//div[@id='strawArchResultsDisplayed']" should have text as "1-20 of 126124 Results"
    # Then verify result should have text as "NEXT"