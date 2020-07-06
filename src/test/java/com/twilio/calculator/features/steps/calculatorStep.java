package com.twilio.calculator.features.steps;

import com.twilio.calculator.ui.HomePage;
import com.twilio.calculator.utils.SelectNumber;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.CoreMatchers;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class calculatorStep {

    @Before
    public void init() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that {word} use the calculator app")
    public void useCalculator(String nameActor) {
        OnStage
                .theActorCalled(nameActor)
                .describedAs("The user star app calculator");
        OnStage
                .withCurrentActor(
                        WaitUntil.the(HomePage.EQUAL_BUTTON, isVisible())
                                .forNoMoreThan(5).seconds()
                );
    }

    @When("he sum {string} and {string}")
    public void sumNumbers(String numberOne, String numberTwo) {
        SelectNumber.one(numberOne);
        OnStage.withCurrentActor(
                Click.on(HomePage.SUM_BUTTON)
        );
        SelectNumber.two(numberTwo);
        OnStage.withCurrentActor(
                Click.on(HomePage.EQUAL_BUTTON)
        );

    }

    @Then("the answer is {string}")
    public void validateResult(String result) {
        OnStage.theActorInTheSpotlight()
                .should(
                        eventually(
                                seeThat(TheTarget.textOf(HomePage.RESULT), CoreMatchers.containsStringIgnoringCase(result)))
                                .waitingForNoLongerThan(10).seconds()
                );
    }
}
