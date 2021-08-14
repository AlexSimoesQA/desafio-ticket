package tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
	publish = true,
	plugin = {"pretty"},
	monochrome = true,
	glue = "steps",
	features = "src/test/resources/features",
	snippets = SnippetType.CAMELCASE
)
public class ElasticEmailTest {

}
