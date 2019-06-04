package Step_def;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy3 {
	WebDriver driver = null;
	@Given("user is open the application")
	public void user_is_open_the_application() {
		String path="C:\\Users\\Training_b6b.01.09\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://10.232.237.143:443/TestMeApp/"); 
	    
	    driver.manage().window().maximize();
	    
	}

	@When("user click on to signin link")
	public void user_click_on_to_signin_link() {
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) throws InterruptedException {
		driver.findElement(By.id("userName")).sendKeys(username);
		Thread.sleep(3000);
	    driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.name("Login")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
		driver.close();
	}

	@Then("message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		System.out.println("Login Successfully");
	}



}
