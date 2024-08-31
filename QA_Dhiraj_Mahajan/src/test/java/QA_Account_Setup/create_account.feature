Feature: User Account Creation

Scenario: Create a new user account with valid input
  Given user is on the website landing page
  When user clicks on the Create an account button
    And user enters "dhiraj" in the First Name field
    And user enters "mahajan" in the Last Name field
    And user enters "dhiraj577@gamil.com" in the Email field
    And user enters "Dhiraj@577" in the Password field
    And user enters "Dhiraj@577" in the Confirm Password field
    And user clicks on the submit Create an account button
  Then user should see a confirmation message saying Your account has been created successfully. 
   And close the broweser. 