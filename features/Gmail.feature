@tag
Feature: Geliking Gmail

  @tag1
  Scenario: Loging into Gmail
   Given user launched the browser "edge"
    Given User is on Gmail page
    When Log into Gmail
    And Access the first mail
 

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
