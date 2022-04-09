package org.testing.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./FeatureFiles",glue="org.testing.stepdefinitions")

public class runner
{

}
