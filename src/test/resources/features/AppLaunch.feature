@applaunch
Feature: To launch the IRAPPV3 Application

  Scenario: To successfully launch the app and enable or disable the notifications
    Then To launch the "zaingroup" app using device with udid "10.10.22.108:5555"
    Then To check whether the app update notification popup is displayed and enable it
    Then To check whether the AppUpdate Popup is displaying and click i will do it later button