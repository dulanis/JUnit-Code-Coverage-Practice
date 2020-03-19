Feature: verify the functionality of the calculator

Scenario: test addition
Given the user has a calculator
And the user supplies two numbers 12.0 and 13.0
When the user uses the add functionality
Then the sum should be returned 25

Scenario: test subtraction
	Given the user has a calculator
		And the user supplies two numbers 12.0 and 3.0
	When the user uses the subtract functionality
	Then check the difference is 9.0
	
Scenario: test multiplication
	Given the user has a calculator
		And the user supplies two numbers 12.0 and 3.0
	When the user uses the multiply functionality
	Then check the product is 36.0
	
Scenario: test division without dividing by zero
	Given the user has a calculator
		And the user supplies two numbers 12.0 and 3.0
	When the user uses the divide functionality
	Then check the quotient is 4.0
	
Scenario: test divide by zero
	Given the user has a calculator
		And the user supplies two numbers 12.0 and 0.0
	When the user uses the divide functionality
	Then check the quotient is not a number
		