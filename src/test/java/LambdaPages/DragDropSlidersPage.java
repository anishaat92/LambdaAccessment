package LambdaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDropSlidersPage {
	 WebDriver driver;

	    private By slider = By.xpath("//input[@value='15']");
	    private By rangeValue = By.id("rangeSuccess");

	    public DragDropSlidersPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void moveSliderTo95() {
	        WebElement sliderElement = driver.findElement(slider);
	        Actions actions = new Actions(driver);
	        actions.dragAndDropBy(sliderElement, 215, 0).perform();
	    }

	    public String getRangeValue() {
	        return driver.findElement(rangeValue).getText();
	    }

}
