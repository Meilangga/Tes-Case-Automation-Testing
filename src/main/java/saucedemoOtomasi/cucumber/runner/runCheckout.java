package saucedemoOtomasi.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/saucedemoOtomasi/cucumber/features",
        glue = "saucedemoOtomasi.cucumber.stepDef",
        plugin = {"html:target/HTML_report.html"}

)
public class runCheckout {
}
