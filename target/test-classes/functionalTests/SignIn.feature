# User Signin to the System
# Tags: optional

Feature: User signup to the system
    Background: User goes to Home Page
        Given Launching website "site" on the browser

    Scenario: User signin with an invalid information
        Given User clicks "SIGNIN" button on Header menu
        When User enters credentials to SignIn and the system displays the invalid error message
            | Email             | Password | ErrorMessage                 |
            | chaungo@gmail.com | abc      | email or password is invalid |
