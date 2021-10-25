Feature: Api testing for CRUID operators

  Background:
    Given User given api url "http://gorest.co.in/"

  Scenario Outline: POST-Create a new user
    Given set api endpoint "public/v1/users"
    And User creates new user with request body "<Name>", "<Gender>", "<Email>", "<Status>"
    Then validate the status code 201
    And validate userId is not null
    And validate user name is "<Name>"
    And validate user gender is "<Gender>"
    And validate user email is "<Email>"
    And validate user status is "<Status>"
    
    Examples:
      | Name       | Gender | Email            | Status |
      | John Doe 8 | male   | john23@gmail.com | active |

      #Organizing code- Windows: ctrl+Alt+L
      #                 Mac: option+command+L
      #Start parameters with lowercase letters
  
      








