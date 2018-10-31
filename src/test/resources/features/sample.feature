Feature: Default Steps Test

  Scenario: Valid touch and enter text steps
    Given I touch the text "Views"
    When I touch the text "Auto Complete"
       And I touch the text "4. Contacts"
       And I enter "This is a test" into field with id "edit"
    Then I wait to see the text "This is a test"
       And I take screenshot