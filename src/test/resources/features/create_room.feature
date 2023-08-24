@medunna_room
Feature: Medunna Room Creation

  Background: Sign In As Admin
    Given user navigates to "https://medunna.com"
    When click on user icon
    And click on sign in link
    And enter username
    And enter password
    And click on sign in submit button


  Scenario Outline: Create Room
    When click on itemsAndTitles link
    And click on room option
    And click on create a new room link
    And enter room number "<room number>"
    And select room type "<room type>"
    And click on status checkbox
    And enter price "<price>"
    And enter description "<description>"
    And click on save button
    Then assert alert message contains A new Room is created
    And close the application
    Examples:
      | room number | room type      | price | description                                                                |
      | 566778888   | DAYCARE        | 444   | This room was created for cucumber practice by Software QA Engineer Aynura |
      | 566123852   | SUITE          | 222   | This room was created for cucumber practice by Software QA Engineer Aynura |
      | 565556529   | PREMIUM_DELUXE | 100   | This room was created for cucumber practice by Software QA Engineer Aynura |
      | 690043348   | TWIN           | 555   | This room was created for cucumber practice by Software QA Engineer Aynura |

  @Message
  Scenario Outline: Send Message
    When click on itemsAndTitles link
    And click on messages option
    And click on create a new message link
    And enter name "<name>"
    And enter Email "<Email>"
    And enter subject "<subject>"
    And enter message "<message>"
    And click on save submit button
    Then verify alet message contains A new Message is created
    And close the application
    Examples:
      | name | Email        | subject | message                                       |
      | John | john@doe.com | Hello   | Hi dear friend. This is for cucumber practice |



