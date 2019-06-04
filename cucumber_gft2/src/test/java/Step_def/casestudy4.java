package Step_def;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy4 {
	
	WebDriver driver = null;
	
	@Given("User has registered into testmeApp")
	public void user_has_registered_into_testmeApp() {
		String path="C:\\Users\\Training_b6b.01.09\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://10.232.237.143:443/TestMeApp/"); 
	    
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("SignIn")).click();
	    driver.findElement(By.id("userName")).sendKeys("lalitha");
	    driver.findElement(By.name("password")).sendKeys("password123");
	    driver.findElement(By.name("Login")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user search the product like headphone")
	public void user_search_the_product_like_headphone() {
	    driver.findElement(By.xpath("//input[@name='products']")).sendKeys("Headphone");
	    driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	}

	@When("try to proceed payment without adding product to cart")
	public void try_to_proceed_payment_without_adding_product_to_cart() {
		  System.out.println("For payment you need to add product to cart");
		  driver.findElement(By.linkText("Home")).click();

	}

	@Then("Testmeapp doesn't display cart icon")
	public void testmeapp_doesn_t_display_cart_icon() {
		System.out.println("Testmeapp doesn't display cart icon");
	}


}
