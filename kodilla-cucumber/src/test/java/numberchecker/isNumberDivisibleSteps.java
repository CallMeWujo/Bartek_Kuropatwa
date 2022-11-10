package numberchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class isNumberDivisibleSteps implements En {
    private int number;
    private String answer;

    public isNumberDivisibleSteps() {
        Given("number is {int}", (Integer number) -> {
            this.number = number;
        });

        When("I ask number is divisible by three or five", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.numberChecker(this.number);
        });
        Then("I should be {string}", (String string) -> {
            Assert.assertEquals(string,this.answer);

        });

    }
}
