
Feature: Add grades

  Scenario: Insert subject grade from teacher
    Given Teacher opens the home screen to insert the grade
    When Teacher enters his subject 
    And Enters student "Teodor"
    And Enters grade "6"
    And Click add button
    Then See message "Added successfully"

   Scenario: Insert subject grade from teacher without student's name
    Given Teacher opens the home screen to insert the grade
    When Teacher enters his subject 
    And Enters student ""
    And Enters grade "6"
    And Click add button
    Then See message "Empty name. Please insert student's name"

  Scenario: Insert subject grade bigger than 6
    Given Teacher opens the home screen to insert the grade
    When Teacher enters his subject 
    And Enters student "Teodor"
    And Enters grade "7"
    And Click add button
    Then See message "The grade is bigger than 6.Please enter a grade between 2 and 6"

   Scenario: Insert subject grade smaller than 2
    Given Teacher opens the home screen to insert the grade
    When Teacher enters his subject 
    And Enters student "Teodor"
    And Enters grade "1"
    And Click add button
    Then See message "The grade is smaller than 2.Please enter a grade between 2 and 6"

    Scenario: Insert subject grade which is empty
    Given Teacher opens the home screen to insert the grade
    When Teacher enters his subject 
    And Enters student "Teodor"
    And Enters grade ""
    And Click add button
    Then See message "The grade is empty.Please enter a grade between 2 and 6"