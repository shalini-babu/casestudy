package Step_def;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy2 {
	
	WebDriver driver = null;
	
	@Given("The login page is opened")
	public void the_login_page_is_opened() {
		String path="C:\\Users\\Training_b6b.01.09\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://10.232.237.143:443/TestMeApp/"); 
	    
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("SignIn")).click();
	    System.out.println("The title of the page is"+driver.getTitle());
	}

	@When("User enters lalitha as username")
	public void user_enters_lalitha_as_username() {
		driver.findElement(By.id("userName")).sendKeys("lalitha");
	    
	}

	@When("User enters password{int} as password")
	public void user_enters_password_as_password(Integer int1) {
	    driver.findElement(By.name("password")).sendKeys("password123");
	}

	@Then("User will Finds a TestMeApp hoempage")
	public void user_will_Finds_a_TestMeApp_hoempage() {
	    driver.findElement(By.name("Login")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//a[@href='logout.htm']")).click();

	}

	@Given("User click on {string} and subcategory as {string}")
	public void user_click_on_and_subcategory_as(String string, String string2) throws InterruptedException {
		Actions act = new Actions(driver);
		  act.moveToElement(driver.findElement(By.xpath("//ul[@id='menu3']/li[2]/a/span"))).perform();
		  Thread.sleep(3000);
		  act.moveToElement(driver.findElement(By.xpath("//span[contains(.,'Electronics')]"))).click().build().perform();
		  Thread.sleep(3000);
	    
	}

	@When("User added the headphone to the cart")
	public void user_added_the_headphone_to_the_cart() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Head Phone')]"))).click().build().perform();
		  Thread.sleep(3000);
		  driver.findElement(By.linkText("Add to cart")).click();
	}

	@When("checkout for the payment")
	public void checkout_for_the_payment() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(@href, 'displayCart.htm')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.linkText("Checkout")).click();
		  Thread.sleep(3000);
	}

	@When("fill transcation detail")
	public void fill_transcation_detail() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[2]/div[2]/div/label/i")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.name("username")).sendKeys("supreetha");
		  Thread.sleep(3000);
		  driver.findElement(By.name("password")).sendKeys("sss1234");

		  Thread.sleep(3000);

		  driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		  driver.close();
	}

	@Then("the product is successful ordered")
	public void the_product_is_successful_ordered() {
		System.out.println("The product is successfully ordered");
	    
	}



}
