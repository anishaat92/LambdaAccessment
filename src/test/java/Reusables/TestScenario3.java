package Reusables;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import LambdaPages.InputFormPage;
import LambdaPages.PlaygroundPage;
import TestAssesmentLambda.Assesment.LambdaBaseTest;

public class TestScenario3 extends LambdaBaseTest {
	@Test
	public void testInputFormSubmit() throws InterruptedException {
		PlaygroundPage playground = new PlaygroundPage(driver);
		playground.open();
		Thread.sleep(5000);
		playground.goToInputFormSubmit();
		Thread.sleep(5000);
		InputFormPage form = new InputFormPage(driver);

		// Step 2: Submit without filling
		Thread.sleep(5000);

		form.clickSubmit();
		String validationMsg = form.getValidationMessage();
		System.out.println(validationMsg);
		AssertJUnit.assertTrue(validationMsg.contains("fill"));
		System.out.println(validationMsg);
		// Step 3: Fill form
		form.fillForm("Anisha", "anisha@example.com", "Pass123", "Lambdatest", "www.Lambda.com", "Brooklyn", "No 45",
				"Blake st", "Newyork", "56788");
		form.selectCountry("United States");
		form.clickSubmit();

		// Step 4: Validate success
		AssertJUnit.assertEquals(form.getSuccessMessage(),
				"Thanks for contacting us, we will get back to you shortly.");
	}

}
