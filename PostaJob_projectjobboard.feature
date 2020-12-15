
@Activity3
Feature: Posting a job using parameterization

  @tag1
  Scenario: Post a job using details passed from the Feature file
    Given User is on PostaJob page
    When Post Job info "Tester" and "Applying for Job" and "https://alchemy.hguy.co/jobs/post-a-job/" and "IBM"
    Then Confirm job listing is shown on page
    And Close the jobs browser 