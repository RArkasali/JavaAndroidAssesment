Feature: Verify the weather Sydney today

  @regression
  Scenario Outline: A happy holidaymaker
    Given I like to holiday in <city>
    And I look up the weather forecast today <city>
    When I receive the weather forecast
    And the temperature is warmer than <degree> degrees

    Examples:
    |city|degree|
    |Sydney|10|