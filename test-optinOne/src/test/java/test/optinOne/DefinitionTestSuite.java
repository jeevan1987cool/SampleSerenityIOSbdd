package test.optinOne;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features="src/test/resources/features/consult_dictionary/LookupADefinition.feature")
@CucumberOptions(features="src/test/resources/features")
public class DefinitionTestSuite {}
