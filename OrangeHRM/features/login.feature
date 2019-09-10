Feature: Login functionality

Scenario: verify admin login with valid data

Given user open the browser

And user pass the url "https://opensource-demo.orangehrmlive.com"

When user pass the username "Admin" and password "admin123"

And user click on login button

Then system should display login page

And user close the browser