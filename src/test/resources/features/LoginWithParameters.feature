Feature: Log in with different user
  #Agile: As a user I should be able to log in with different user

  Scenario: Log in as a teacher with parameters
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to login
    And The welcome message contains "Teacher"

  Scenario: Log is as a Jack Bauer with parameters
    Given The user is on the login page
    When The user logs in using "jackbauer@gmail.com" and "Admin123"
    Then The user should be able to login
    And The welcome message contains "Jack Bauer"

  Scenario: Log is as a Student with parameters
    Given The user is on the login page
    When The user logs in using "student@study.net" and "Test1234"
    Then The user should be able to login
    And The welcome message contains "Student"

