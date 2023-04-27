Feature: The user should be able to edit profile

  Background:
    Given The user is on the login page

  @editProfile
  Scenario: edit profile
    And The user logs in using "student@study.net" and "Test1234"
    When The user navigates to "Edit Profile" menu
    And The user select "Intern" as a career
    And The user chose 1 years of work experience
    And The user add "compan" "Amazon"
    And The user add "website" "www.amazon.com"
    And The user add "location" "NY"
    And The user add "skills" "HTML,CSS,JS,PHP,JAVA,SELENIUM"
    And The user add "githubusername" "intern23"
    And The user add "bio" "New Company, new adventure"
   # And The user clicks submit button
  @wip
  Scenario Outline: edit profile with scenario outline
    And The user logs in using "<email>" and "<password>"
    When The user navigates to "<edit add module>" menu
    And The user select "<statusInfo>" as a career
    And The user chose 1 years of work experience
    And The user add "company" "<companyInfo>"
    And The user add "website" "<websiteInfo>"
    And The user add "location" "<city>"
    And The user add "skills" "<skillsInfo>"
    And The user add "githubusername" "<githubInfo>"
    And The user add "bio" "<bioInfo>"
    And The user clicks submit button
    Examples:
      | email             | password | edit add module | statusInfo          | companyInfo | websiteInfo    | city   | skillsInfo                    | githubInfo | bioInfo                    |
      | student@study.net | Test1234 | Edit Profile    | Intern              | Amazon      | www.amazon.com | NY     | HTML,CSS,JS,PHP,JAVA,SELENIUM | intern23   | New Company, new adventure |
      | student@study.net | Test1234 | Edit Profile    | Student or Learning | Google      | www.google.com | Boston | HTML,CSS,JS,PHP               | student22  | Old Company, old adventure |

