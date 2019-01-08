$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("News.feature");
formatter.feature({
  "line": 1,
  "name": "Verify functionality of News",
  "description": "",
  "id": "verify-functionality-of-news",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6491569377,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "If user enters a search term in the search bar, the search should be run when the user hits Enter",
  "description": "",
  "id": "verify-functionality-of-news;if-user-enters-a-search-term-in-the-search-bar,-the-search-should-be-run-when-the-user-hits-enter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@News"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Login to the application with username as \"ceidemo\" and password as \"saleem957\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Search under News tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "element having xpath \"//div[@id\u003d\u0027strawArchResultsDisplayed\u0027]\" should have text as \"1-20 of 126124 Results\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ceidemo",
      "offset": 43
    },
    {
      "val": "saleem957",
      "offset": 69
    }
  ],
  "location": "DashboardStep.login_to_the_application_with_username_as_something_and_password_as_something(String,String)"
});
formatter.result({
  "duration": 15070577774,
  "status": "passed"
});
formatter.match({
  "location": "NewsStep.user_clicks_on_search_under_news_tab()"
});
formatter.result({
  "duration": 6929148857,
  "status": "passed"
});
formatter.match({
  "location": "NewsStep.click_on_search_button()"
});
formatter.result({
  "duration": 100784990,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 4256776442,
  "status": "passed"
});
});