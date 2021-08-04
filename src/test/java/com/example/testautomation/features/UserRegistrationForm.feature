@RegistrationPage
Feature: User Registration Form

  Scenario: Fill out user registration Successfully
    Given I enter "Ipsum" into "First Name"
    When I enter "Lorem" into "Last Name"
    And I toggle checkbox "I would like to receive newsletters"
    And I should see element "I accept the Terms of Service" enabled
    And I toggle checkbox number 3
    And I touch the "Submit"
    Then I should see text "Saved successfully!"
    And I take a screenshot

  Scenario: Fill out user registration without first name
    Given I enter "Lorem" into "Last Name"
    When I toggle checkbox "I would like to receive newsletters"
    And I toggle checkbox "I accept the Terms of Service"
    And I touch the "Submit"
    Then I should see text "The First Name, Last Name and Terms fields are required."
    And I take a screenshot

  Scenario: Fill out user registration without last name
    Given I enter "Ipsum" into "First Name"
    When I toggle checkbox "I would like to receive newsletters"
    And I toggle checkbox "I accept the Terms of Service"
    And I touch the "Submit"
    Then I should see text "The First Name, Last Name and Terms fields are required."
    And I take a screenshot

  Scenario: Fill out user registration without terms
    Given I enter "Ipsum" into "First Name"
    When I enter "Lorem" into "Last Name"
    And I toggle checkbox "I would like to receive newsletters"
    And I touch the "Submit"
    Then I should see text "The First Name, Last Name and Terms fields are required."
    And I take a screenshot