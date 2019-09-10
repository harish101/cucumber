Feature: orangeHRM Logo


Scenario: verify orangeHRM logo

Given user open the browser

When user pass the url "https://opensource-demo.orangehrmlive.com/"

Then system should display orangeHrm logo

Then user close the browser

@Login
Scenario: verify admin login with valid data

Given user open the browser

And user pass the url "https://opensource-demo.orangehrmlive.com"

When user pass the username "Admin" and password "admin123"

And user click on login button

Then system should display login page

And user close the browser

@maintanance
Scenario: check maintanance functionality

Given user open the browser

And user pass the url "https://opensource-demo.orangehrmlive.com"

When user pass the username "Admin" and password "admin123"

And user click on login button

Then system should display login page

When user palce a cursor on maintanance

And click on Access Record button

Then system should navigate to verify password page

And user close the browser