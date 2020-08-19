package com.bddeveris.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/features/",
 glue= {"/com/bddeveris/steps","/com/bddeveris/runner"},
 plugin = { "pretty",
		    "html:target/site/cucumber-pretty",
		    "json:target/site/cucumber.json"
 		  },
 //No caso de adicionar uma tag na feature para executar apenas essa feature ou scenario
 tags ={"@check2"})
 
public class Runner{

}