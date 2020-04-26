Feature: Access aCalendar app
  Verify create new meeting is success in aCalendar APP

  @regression
  Scenario Outline: Access aCalendar App
    Given I have launched the Calendar App
    When It is not a weekend <date>
    And It is not a public holiday <date>
    Then I want to book a meeting with the title <title> date <date>
    And Set Meeting duration as <duration> in the evening
    And I invite <people>
    And I save the meeting
    Then I Check if the meeting is created as expected Note title <title> time <time> duration <duration> people <people>

    Examples:
      |title|date|time|duration|people|
      |Introduction|2020/4/29|10|30|TEST|
