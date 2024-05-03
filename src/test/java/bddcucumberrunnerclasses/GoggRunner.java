package bddcucumberrunnerclasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\DELL\\Desktop\\Java Programs\\bddcucumber\\src\\test\\resources\\Featurefile\\Google.feature",glue="stepDef")
public class GoggRunner {

}
