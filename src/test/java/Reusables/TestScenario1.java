package Reusables;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import LambdaPages.PlaygroundPage;
import LambdaPages.SimpleFormDemoPage;
import TestAssesmentLambda.Assesment.LambdaBaseTest;

public class TestScenario1 extends LambdaBaseTest {
	@Test
	public void testSimpleFormDemo() {
		PlaygroundPage playground = new PlaygroundPage(driver);
		playground.open();
		playground.goToSimpleFormDemo();

		AssertJUnit.assertTrue(driver.getCurrentUrl().contains("simple-form-demo"));

		SimpleFormDemoPage simpleForm = new SimpleFormDemoPage(driver);
		String msg = "Welcome to LambdaTest";
		simpleForm.enterMessage(msg);
		simpleForm.clickShowMessage();

		AssertJUnit.assertEquals(simpleForm.getDisplayedMessage(), msg);
	}
}
