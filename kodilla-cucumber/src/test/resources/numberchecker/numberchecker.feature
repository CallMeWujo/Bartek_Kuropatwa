Feature: is number divisible by 3, is number divisible by 5, is number divisible by 3 and 5?

  Scenario Outline:
    Given number is <number>
    Then  I ask number is divisible by 3 or 5
    When  I should be told <answer>
    Examples:
      | number | answer |
      | 3      | "Fizz" |
      | 6      | "Fizz" |
      | 5      | "Buzz" |
      | 10     | "Buzz" |
      | 15     | "FizzBuzz" |
      | 30     | "FizzBuzz" |
      | 4      | "None"     |
      | 14     | "None"     |