Feature: Verify functionality of supplier

  @Supplier
  Scenario: Verify supplier search
    Given Login to the application with username as "ceidemo" and password as "saleem957"
    When User goes to page /ic/suppliers/suppliers-search
    Then Select region as 'Asia' and grade as 'Packaging Paper'
    Then Search results should get displayed and result should contain "Asia - Specialty and Industrial"
