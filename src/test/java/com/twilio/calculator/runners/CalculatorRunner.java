package com.twilio.calculator.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin ={"pretty", "rerun:target/rerun.txt"},
        features = {"classpath:features"},
        glue = {"com.twilio.calculator.features.steps"})
public class CalculatorRunner {
}
