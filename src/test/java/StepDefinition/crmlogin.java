//package StepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class crmlogin {
//	
//	WebDriver driver;
//	
//	@Given("^user is already on Login Page$")
//	public void user_is_already_on_Login_Page() throws Throwable {
//		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
//		 driver=new ChromeDriver();  
//		 driver.manage().window().maximize();
//	    driver.get("https://www.stealmylogin.com/demo.html");
//	    Thread.sleep(5000);
//	    
//	}
//
//	@When("^user enters username and password$")
//	public void user_enters_username_and_password() throws Throwable {
//	driver.findElement(By.name("username")).sendKeys("dummy");
//	driver.findElement(By.name("password")).sendKeys("dummy");
//	   
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button()  {
//	 driver.findElement(By.xpath("/html/body/form/input[3]")).click();   
//	}
//
//	@SuppressWarnings("deprecation")
//	@Then("^user is on home page$")
//	public void user_is_on_home_page()  {
//	    String actualTitle=driver.getTitle();
//	    Assert.assertEquals(actualTitle,"Example Domain");
//	}
//
//	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and(String uname, String pwd){
//		driver.findElement(By.name("username")).sendKeys(uname);
//		driver.findElement(By.name("password")).sendKeys(pwd);
//	}
//}
