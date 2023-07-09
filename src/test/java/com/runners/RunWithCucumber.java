package com.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"./features"},
                   glue = {"com.stepDefinitions"},
                   tags = "@tag")
public class RunWithCucumber {

}
