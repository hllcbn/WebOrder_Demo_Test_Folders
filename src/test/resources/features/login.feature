@regression
Feature: Login Functionality of WebOrder Page

#  Background: Navigation to the website
#   # Given User navigates to the 'https://demo.weborder.net'
#  @smoke
#  Scenario: Validation of WebOrder Login Page(Happy Path)
#   # Given User navigates to the 'https://demo.weborder.net'
#    When User provides username "guest1@microworks.com" and password 'Guest1!'
#    Then User validates the title 'ORDER DETAILS - Weborder' from homepage
#
#  Scenario: Validation of WebOrder Login Page(Correct Username Wrong password)
#   # Given User navigates to the 'https://demo.weborder.net'
#    When User provides username "guest1@microworks.com" and password 'dfgdghf'
#    Then User validates the message 'Sign in Failed' from login page
#
#  Scenario: Validation of WebOrder Login Page(Wrong Username Correct password)
#  #  Given User navigates to the 'https://demo.weborder.net'
#    When User provides username "dfgdfh@gmail.com" and password 'Guest1!'
#    Then User validates the message 'Sign in Failed' from login page
# @smoke
#  Scenario: Validation of WebOrder Login Page(Empty Username Empty password)
#  #  Given User navigates to the 'https://demo.weborder.net'
#    When User provides username '' and password ''
#    Then User validates the message 'Sign in Failed' from login page



  Scenario Outline: Validation of WebOrder Login Page(Empty Username Empty password)
    When User provides username '<username>' and password '<password>'
    Then User validates the message '<message>' from login page
    Examples:
      | username                 | password      | message        |
      | guest1@microworks.com    | fgfggfd       | Sign in Failed |
      | sdgdfg@gmail.com         | Guest1!       | Sign in Failed |
      |                          |               | Sign in Failed |
      | &^*^*^&*^&#$#$@yahoo.com | ^&$^#($*#^$&# | Sign in Failed |
      | dfhjsdhgfjksdg@gmail.com | hdfjhgjhkdfgj | Sign in Failed |
      | dfhjsdhgfjksdg@gmailcom  | hdfjhgjhkdfgj | Sign in Failed |
      | 1423545435@gmail.com     | 345345345     | Sign in Failed |
      | GUEST1@MICROWORKS.COM    | guest1!       | Sign in Failed |
