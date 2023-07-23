@e2e
Feature: Test Login
User want to login to application and add note

Background:
  Given user navigates to homepage
  And click on login link

@VerifyUnSuccessfulLogin
Scenario: To verify Unsuccessful login using email
When user enter invalid login details
Then user not able to login

  @VerifySuccessfulLogin
  Scenario: To verify successful login using email
    Given user navigates to homepage
    And click on login link
    When user enter valid login details
    Then user able to login

  @VerifyCreateNoteAndLogOut
  Scenario: To verify user able to login and create note and logout
    Given user navigates to homepage
    And click on login link
    And user enter valid login details
    And user able to login
    When user create a note
    Then note should be created
    And user logout from the site


  @VerifyCreateNote @TestDataClean
  Scenario: To verify user able to login and create note and logout
    Given user navigates to homepage
    And click on login link
    When user enter valid login details
    And user able to login
    Then created note should be there

