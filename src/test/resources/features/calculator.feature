@cucumber

Feature: Validate the correct operation of the calculator

  Scenario Outline: Validate the correct operation of the operation sum

    Given that David use the calculator app
    When he sum <numberOne> and <numberTwo>
    Then the answer is <result>
    Examples:
      | numberOne | numberTwo | result  |
      | "2"       | "4"       | "6"     |
      | "10"      | "10"      | "20"    |
      | "1500"    | "1000"    | "2,500" |
