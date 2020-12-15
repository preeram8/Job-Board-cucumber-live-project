
@Activity4
Feature: Posting a job using Example table

  
 
  Scenario Outline: Post a job using details passed from the Example file
    Given User is on PostaJob page using table
    When Post Job info from table "<JobTitle>" and "<desc>" and "<AppURL>" and "<CompName>"
    Then Confirm job listing is shown on page table
    And Close the jobs table browser 

    Examples: 
      | JobTitle  | desc | AppURL  | CompName  | 
      | Tester1 |Applying for Job | https://alchemy.hguy.co/jobs/post-a-job/ | IBM | 
      | Tester2 |Applying for Job | https://alchemy.hguy.co/jobs/post-a-job/ | IBM | 
