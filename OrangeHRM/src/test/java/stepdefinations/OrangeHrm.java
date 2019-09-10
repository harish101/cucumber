package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrm {

	public WebDriver driver;

	@Given("user open the browser")
	public void user_open_the_browser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mindq\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@When("user pass the url {string}")
	public void user_pass_the_url(String string) throws Throwable {

		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(2000);

	}

	@Then("system should display orangeHrm logo")
	public void system_should_display_orangeHrm_logo() {

		boolean b = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
		Assert.assertEquals(true, b);

	}

	@Then("user close the browser")
	public void user_close_the_browser() {

		driver.close();

	}
	
	@When("user pass the username {string} and password {string}")
	public void user_pass_the_username_and_password(String username, String password) {
	   
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	
		driver.findElement(By.id("btnLogin")).click();
		
	}

	@Then("system should display login page")
	public void system_should_display_login_page() {
	
		boolean b = driver.findElement(By.id("MP_link")).isDisplayed();
		Assert.assertEquals(true, b);
	}

	@When("user palce a cursor on maintanance")
	public void user_palce_a_cursor_on_maintanance() {
	  
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_maintenance_purgeEmployee\"]/b"))).build().perform();
		a.click().build().perform();
	}

	@When("click on Access Record button")
	public void click_on_Access_Record_button() {
	 
		driver.findElement(By.xpath("//*[@id=\"menu_maintenance_accessEmployeeData\"]")).click();
		
	}

	@Then("system should navigate to verify password page")
	public void system_should_navigate_to_verify_password_page() {
	 
		boolean b1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1")).isDisplayed();
		Assert.assertEquals(true,b1);
		
		
	}


}
