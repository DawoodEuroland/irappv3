@dashboard
Feature: To validate the modules in the Dashboard Screen
  @ticker
  Scenario: To validate the values in the ticker part
    Then To launch the share graph web link of that company and gets the ticker data and store it
    Then To check whether the last price along with currency of the company matches with the web tool
    Then To check whether the high price matches with the web tool
    Then To Check whether the low price matches with the web tool
    Then To check whether the change and change percent value matches with the web tool
    Then To check whether the volume matches with the web tool

