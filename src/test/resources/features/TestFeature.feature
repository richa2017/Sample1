Feature: Visit a page and click on a link

@test
  Scenario: Visit a page and check the page title
    Given I go to url https://www.bbc.co.uk/
    When i enter username kerry-anne.kane@opencastsoftware.com
    And password mypassword1
    Then i am logged in
    
    
    
    



