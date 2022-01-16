@JBK  
Feature: JBK offline application

#it will run before every scenario
Background:
Given user should be on login page

@login
Scenario Outline: Login test

When user enters "<uname>" and "<pass>"
Then user will be on home page

Examples:
|uname            |pass  |
|kiran@gmail.com  |123456|
|mangesh@gmail.com|asdfgh|
|neelam@gmail.com |qwerty|
|ashwini@gmail.com|zxcvbn|



@logo  
Scenario: verify JBK logo

Then  user will see JBK logo

@register
Scenario: verify register link

Then user will click register link

