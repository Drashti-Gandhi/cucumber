package StepDefinition;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class datatablemap {
	WebDriver driver;
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
	}
	
	@After
	public void close()
	{
		driver.quit();
		
	}
	
	@SuppressWarnings("deprecation")
	@Given("^user is on CRM login page$")
	public void user_is_on_CRM_login_page(){
	   
	   String pagetitle=driver.getTitle();
	   Assert.assertEquals(pagetitle, "#1 Free CRM customer relationship management software cloud");
	   driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/a")).click();;
	  	}

	@When("^user enters email and passoword$")
	public void user_enters_email_and_passoword(DataTable credentials) {
		
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			
					driver.findElement(By.name("email")).sendKeys(data.get("email"));
					driver.findElement(By.name("password")).sendKeys(data.get("password"));
			
					}
		
		
	   
	}
	@When("^user clicks on login button$")
	public void user_clicks_on_login_button(){
	    driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
	}


	

	@Given("^user clicks on deals menu$")
	public void user_clicks_on_deals_menu() {
		
		WebDriverWait wait=new WebDriverWait(driver,10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/home']")));
	 WebElement home=driver.findElement(By.xpath("//a[@href='/home']"));
	 Actions action=new Actions(driver);
	 action.moveToElement(home).build().perform();
	 action.moveToElement(driver.findElement(By.xpath("//a[@href='/deals']"))).click().build().perform();
	 
	   
	}

	@Given("^Clicks on Create new deal$")
	public void clicks_on_Create_new_deal()  {
		WebDriverWait wait=new WebDriverWait(driver,10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/deals/new']")));
		driver.findElement(By.xpath("//a[@href='/deals/new']")).click();
	   
	}

	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable deals)  {
	
		for (Map<String, String> deal : deals.asMaps(String.class, String.class))
		{
			driver.findElement(By.name("title")).sendKeys(deal.get("Title"));
			driver.findElement(By.name("amount")).sendKeys(deal.get("Amount"));
			driver.findElement(By.name("commission")).sendKeys(deal.get("Commision"));
			driver.findElement(By.name("probability")).sendKeys(deal.get("Probability"));
			
			driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")).click();
			 Actions action=new Actions(driver);
			
			 action.moveToElement(driver.findElement(By.xpath("//a[@href='/deals']"))).click().build().perform();
			 driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")).click();
		}
		
	   
	}

	

}
