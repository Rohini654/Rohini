package cucumber.training1;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef {
		public static WebDriver driver;
		PageObjects po;
		
		@Given("^when i am on home page$")
		public void homepage() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\PDC3A-Training.PDC3A\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     driver = new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  po=new PageObjects(driver);
			
		}
		@When("^i enter uname and pwd$")
		public void unamepwd() {
			po.signin.click();
			po.username.sendKeys("lalitha");
			po.password.sendKeys("Password123");
		    po.Login.click();
		}
		@Then("^i am able to login$")
		public void login() {
			System.out.println("User login Successfully");
			
		}
		@When("^Larry searches below products in the search box:$")
		public void search(DataTable dt) {
			List<String>product =dt.asList(String.class);
		for(String s:product) {
	      driver.findElement(By.name("products")).sendKeys(s);
		  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		  driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/a[2]")).click();
		 driver.findElement(By.xpath("//a[@href='fetchcat.htm']")).click();
		
		}
		 driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/a[3]")).click();
		}
		@When("^i enter \"([^\"]*)\" and \"([^\"]*)\"$")
		public void unamepwd(String uname,String pwd) {
			po.signin.click();
			po.username.sendKeys(uname);
			po.password.sendKeys(pwd);
		    po.Login.click();
			
		}
		
		
		@Then("^product should be added in the cart if available$")
		public void addtocart() {
		
	}
}


