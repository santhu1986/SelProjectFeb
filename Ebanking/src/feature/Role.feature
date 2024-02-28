Feature: Role Creation

Scenario Outline: Role Creation Functionality with Multiple Sets of Data

Given Tester should on Ranford Home Page

When Tester Should enter Login Details

Then Tester Click on Role button

When Tester click on NewRole button and enters "<RoleName>" and "<RoleType>"

Then Tester Close the Application

Examples:

             | RoleName | RoleType |
             | TellerIciciFeb | E | 
             | CashierIciciFeb | E |
             | GenManangerIciciFeb | E |