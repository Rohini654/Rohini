package testrun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions
(features="featureFiles",
glue= {"cucumber.training1"},
tags="@data-driven")

public class Runnerclass {

}
