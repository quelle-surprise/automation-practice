Feature: Login Page

  Scenario: Check static Login elements
    Given I am on Sign in page
    Then Sign in form is visible

#  Scenario: Login with valid credentials
#    Given I am on Sign in page
#    When I login with valid credentials
#    Then I will be logged in to app
#    And I will be redirected to My Account tab

  Scenario: Login with invalid credentials
    Given I am on Sign in page
    When I Login with invalid credentials
    Then Error tooltip will appear on login page and I will not be logged in

  Scenario: Login with invalid email only
    Given I am on Sign in page
    When I Login with invalid email
    Then Invalid email address tooltip will appear
#
#  Scenario: Check static elements on recovery forgotten password
#    Given I am on authentication page
#    When I click "<forgotYourPasswordButton>"
#    Then I will be redirected to recover password page
#
#  Scenario: Recover forgotten password with valid email
#    Given I am on authentication page
#    When I click "<forgotYourPasswordButton>"
#    And I provide valid email
#    And I click <"retrievePassword>" button
#    Then Success message will appear
#
#  Scenario: Recover forgotten password with valid email
#    Given I am on authentication page
#    When I click "<forgotYourPasswordButton>"
#    And I provide invalid email
#    And I click <"retrievePassword>" button
#    Then Error message will appear
