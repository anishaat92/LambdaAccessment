package LambdaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InputFormPage {
	WebDriver driver;

    private By name = By.id("name");
    private By email = By.id("inputEmail4");
    public By password = By.id("inputPassword4");
    private By company = By.id("company");
    private By website = By.id("websitename");
    private By county = By.name("country");
    private By city = By.id("inputCity");
    private By Address1 = By.id("inputAddress1");
    private By Address2 = By.id("inputAddress2");
    private By state = By.id("inputState");
    private By zipcode = By.id("inputZip");
      
    private By submitBtn = By.xpath("//button[text()='Submit']");
    private By successMsg = By.xpath("//p[text()='Thanks for contacting us, we will get back to you shortly.']");

    public InputFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getValidationMessage() {
        return driver.findElement(name).getAttribute("validationMessage");
    }

    public void fillForm(String uname, String mail, String pass, String comp, String web, String cities, String address1,
    		String  address2, String  stat, String  zip) {
        driver.findElement(name).sendKeys(uname);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(company).sendKeys(comp);
        driver.findElement(website).sendKeys(web);
       // driver.findElement(county).sendKeys(country);
        driver.findElement(city).sendKeys(cities);
        driver.findElement(Address1).sendKeys(address1);
        driver.findElement(Address2).sendKeys(address2);
        driver.findElement(state).sendKeys(stat);
        driver.findElement(zipcode).sendKeys(zip);
    }

    public void selectCountry(String countryName) {
        Select select = new Select(driver.findElement(county));
        select.selectByVisibleText(countryName);
    }
    public void clickSubmit() {
        WebElement submitElement = driver.findElement(submitBtn);
System.out.println("Element Found");
        // Scroll into view
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", submitElement);

        // Click
        submitElement.click();
    }

    

    public String getSuccessMessage() {
        return driver.findElement(successMsg).getText();
    }
}

