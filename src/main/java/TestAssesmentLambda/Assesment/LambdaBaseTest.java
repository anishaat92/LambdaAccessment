package TestAssesmentLambda.Assesment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
public class LambdaBaseTest {
	public WebDriver driver;
	public String browserName;
	String username = System.getenv("LT_USERNAME") == null ? "anishaat92" : System.getenv("LT_USERNAME");
	String authkey = System.getenv("LT_ACCESS_KEY") == null ? "LT_VnSRvmTIDyUovnqzOdlXjvoLcEuQK8dpsPG8DrEQdJcaP78"
			: System.getenv("LT_ACCESS_KEY");
	String hub = "@hub.lambdatest.com/wd/hub";

	@Parameters("browserName")
	@BeforeMethod
	public void setup(String browser) {
		browserName = browser;
		System.out.println("Setup has been called with browser name - " + browser);
	
		//driver = new ChromeDriver();
		 if (browser.equalsIgnoreCase("lambdachrome")) {
			 ChromeOptions browserOptions = new ChromeOptions();
			 browserOptions.setPlatformName("Windows 10");
			 browserOptions.setBrowserVersion("dev");
			 HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			 ltOptions.put("username", "anishaat92");
			 ltOptions.put("accessKey", "LT_VnSRvmTIDyUovnqzOdlXjvoLcEuQK8dpsPG8DrEQdJcaP78");
			 ltOptions.put("project", "LambdaAssessment");
			 ltOptions.put("selenium_version", "4.0.0");
			 ltOptions.put("w3c", true);
			 browserOptions.setCapability("LT:Options", ltOptions);
			
			try {
				driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), browserOptions);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (browser.equalsIgnoreCase("safari")) {
			SafariOptions browserOptions = new SafariOptions();
			browserOptions.setPlatformName("MacOS Tahoe");
			browserOptions.setBrowserVersion("26");
			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("username", "anishaat92");
			ltOptions.put("accessKey", "LT_VnSRvmTIDyUovnqzOdlXjvoLcEuQK8dpsPG8DrEQdJcaP78");
			ltOptions.put("project", "Untitled");
			ltOptions.put("w3c", true);
			browserOptions.setCapability("LT:Options", ltOptions);
			try {
				driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), browserOptions);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		driver.get("https://www.lambdatest.com/selenium-playground");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	public void setBrowser(String browser) {
		this.browserName = browser;
	}

}

