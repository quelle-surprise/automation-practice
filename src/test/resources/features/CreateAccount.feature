Feature: Create an account page

  Scenario: Check static elements for Create Account in Authentication page
    Given I am on authentication page
    Then Create an account form in authentication page is visible


  Scenario: Create Employee
    Given user wants to create a employee with the following attributes
      | firstName | lastName | joinDate   |
      | Ross      | Geller   | 2003-11-14 |

    And with the following contacts of employee
      | type | phone      | email                   |
      | WORK | 3851112222 | ross.geller@friends.com |
      | HOME | 4121115555 | ross.geller@gmail.com   |

    When the user saves new employee
    Then the save is SUCCESSFUL