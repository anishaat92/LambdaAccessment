package LambdaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import TestAssesmentLambda.Assesment.LambdaBaseTest;

public class PlaygroundPage extends LambdaBaseTest{
 WebDriver driver;
 

    private By simpleFormDemo = By.linkText("Simple Form Demo");
    private By dragDropSliders = By.linkText("Drag & Drop Sliders");
    private By inputFormSubmit = By.linkText("Input Form Submit");

    public PlaygroundPage(WebDriver driver) {
        this.driver = driver;
    }
    public void open() {
        driver.get("https://www.lambdatest.com/selenium-playground");
    }

    public void goToSimpleFormDemo() {
        driver.findElement(simpleFormDemo).click();
    }

    public void goToDragDropSliders() {
        driver.findElement(dragDropSliders).click();
    }

    public void goToInputFormSubmit() {
        driver.findElement(inputFormSubmit).click();
    }
}

