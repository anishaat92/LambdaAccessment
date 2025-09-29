package LambdaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SimpleFormDemoPage {
	 WebDriver driver;

	    private By messageInput = By.id("user-message");
	    private By showMessageBtn = By.id("showInput");
	    private By displayedMessage = By.id("message");

	    public SimpleFormDemoPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void enterMessage(String msg) {
	        driver.findElement(messageInput).sendKeys(msg);
	    }

	    public void clickShowMessage() {
	        driver.findElement(showMessageBtn).click();
	    }

	    public String getDisplayedMessage() {
	        return driver.findElement(displayedMessage).getText();
	    }
	}

