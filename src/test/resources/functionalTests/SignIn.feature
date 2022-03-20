# User Signin to the System
# Tags: optional

Feature: User signup to the system
    Background: User goes to Home Page
        Given Launching website "site" on the browser

    Scenario: User creates a new account
        Given User clicks "SIGNUP" button on Header menu
        Then The system navigates to Signup page
        When User enters all required information
        And User clicks SignIn button on the Sign Up page
        Then The system navigates to Homepage for logging in the system successfully