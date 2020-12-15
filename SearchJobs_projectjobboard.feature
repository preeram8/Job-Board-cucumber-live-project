@Activity2
Feature: Searching for Jobs using xpath

  @tag1
  Scenario: Searching for jobs and applying to them using XPath
    Given User is on Jobs page
    When Search jobs
    Then Print title and apply for job
    And close the job site

 