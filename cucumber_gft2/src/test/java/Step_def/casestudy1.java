package Step_def;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy1 {
	WebDriver driver = null;
	@Given("the signup page want to open")
	public void the_signup_page_want_to_open() {
		String path="C:\\Users\\Training_b6b.01.09\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://10.232.237.143:443/TestMeApp/"); 
	    
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("SignUp")).click();
	    //System.out.println("The title of the page is"+driver.getTitle());
	}

	@When("Enter the required fields")
	public void enter_the_required_fields() throws InterruptedException {
		//driver.findElement(By.linkText("SignUp")).click();
		  driver.findElement(By.name("userName")).sendKeys("supi12345");
		  driver.findElement(By.id("err")).click();
	      String unava = driver.findElement(By.cssSelector("#err")).getText();
		  //System.out.println(unava);
		  if(unava.equals("Available"))
		  {	
		  driver.findElement(By.name("firstName")).sendKeys("supi");
		  Thread.sleep(3000);
		  driver.findElement(By.name("lastName")).sendKeys("babu");
		  Thread.sleep(5000);
		  driver.findElement(By.name("password")).sendKeys("sss1234");
		  Thread.sleep(3000);
		  driver.findElement(By.name("confirmPassword")).sendKeys("sss1234");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("(//input[@id='gender'])[2]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.name("emailAddress")).sendKeys("sss@gmail.com");
		  Thread.sleep(3000);
		  driver.findElement(By.name("mobileNumber")).sendKeys("9235757268");
		  Thread.sleep(3000);
		  driver.findElement(By.id("dob")).sendKeys("05/03/1998");
		  Thread.sleep(5000);
		  driver.findElement(By.name("address")).sendKeys("chennai,TamilNadu");
		  Thread.sleep(3000);
		  WebElement ques = driver.findElement(By.name("securityQuestion"));
		  Thread.sleep(3000);
		  Actions actions=new Actions(driver);
		  actions.sendKeys(ques,Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		  driver.findElement(By.name("answer")).sendKeys("pinky");
		  }
	}

	@When("submit the registration")
	public void submit_the_registration() throws InterruptedException {
		driver.findElement(By.name("Submit")).click();
		  Thread.sleep(3000);
	}

	@Then("user redirect to homepage")
	public void user_redirect_to_homepage() {
		  driver.findElement(By.linkText("Home")).click();

	}


}
