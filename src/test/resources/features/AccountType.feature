Feature: Account Types

  Background:
    Given The user is on the login page

  Scenario: Teacher user

    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Teacher"

  Scenario: Student user

    When The user logs in using "student@study.net" and "Test1234"
    Then The welcome message contains "Student"


  Scenario: Developer user

    When The user logs in using "developer@developer.net" and "Test1234"
    Then The welcome message contains "Developer"

  @wip
  Scenario Outline: Different user type
    When The user logs in using "<userType>" and "<password>"
    Then The welcome message contains "<name>"
    Examples:
      | userType                | password   | name          |
      | eurotech@gmail.com      | Test12345! | Teacher       |
      | student@study.net       | Test1234   | Student       |
      | developer@developer.net | Test1234   | Developer     |
      | sparrowjack@gmail.com   | sparrow1   | Jack          |
      | Roma@gmail.com          | Test1234   | Roma          |
      | alex@gmail.com          | Test.123   | Alex          |
      | glgn_feyman@gmail.com   | glgn123    | Gulgun Feyman |
