package Reusables;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import LambdaPages.DragDropSlidersPage;
import LambdaPages.PlaygroundPage;
import TestAssesmentLambda.Assesment.LambdaBaseTest;

public class TestScenario2 extends LambdaBaseTest {
	@Test
	public void testDragDropSliders() {
		PlaygroundPage playground = new PlaygroundPage(driver);
		playground.open();
		playground.goToDragDropSliders();

		DragDropSlidersPage sliders = new DragDropSlidersPage(driver);
		sliders.moveSliderTo95();

		AssertJUnit.assertEquals(sliders.getRangeValue(), "95");
	}
}
