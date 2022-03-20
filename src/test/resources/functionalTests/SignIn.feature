# User Signin to the System
# Tags: optional

Feature: User signup to the system
    Background: User goes to Home Page
        Given Launching website "site" on the browser

    Scenario: User signin with an invalid information
        Given User clicks "SIGNIN" button on Header menu
        When User enters credentials to SignIn
            | chaungo@gmail.com | abc |
        And User clicks SignIn button on the SignIn page
        Then The system displays the invalid error message and can not access to home page