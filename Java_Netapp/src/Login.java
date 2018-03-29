import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login {
	public static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException {
		
		
	ChromeOptions options=new ChromeOptions();
    options.setProxy(null);
    System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\rajrajm\\Desktop\\ChromeDriver\\chromedriver.exe");

			  WebDriver  driver = new ChromeDriver(options);
			    
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("http://dv2-ls-cts-1:4200/");
				// Login to the applcation 
				driver.findElement(By.id("username")).sendKeys("jdoe@corp.com");
				driver.findElement(By.id("pwd1")).sendKeys("123");
				driver.findElement(By.id("text-left")).click();
				// Wait till the home button is visisble.
				WebElement wb = driver.findElement(By.partialLinkText("Home"));
				wait=new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.elementToBeClickable(wb));
				driver.findElement(By.id("adminDropdown")).click();
				driver.findElement(By.partialLinkText("Admin User Management")).click();
				//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
				
				//driver.findElement(By.xpath("//button[contains(text(),'Add User')]")).click();
				 driver.findElement(By.xpath("//button[text()='Add User']")).click();
				 Thread.sleep(2000);
	             driver.findElement(By.name("userName")).clear();
				 driver.findElement(By.name("userName")).sendKeys("LaksJack");
				 Thread.sleep(5000);
				 driver.findElement(By.name("firstName")).clear();
				 driver.findElement(By.name("firstName")).sendKeys("Laks");
				 Thread.sleep(5000);
				 driver.findElement(By.name("lastName")).clear();
				 driver.findElement(By.name("lastName")).sendKeys("Jack");
				 Thread.sleep(5000);
				 driver.findElement(By.name("password")).clear();
				 driver.findElement(By.name("password")).sendKeys("12345");
				 driver.findElement(By.name("passwordConfirm")).clear();
				 driver.findElement(By.name("passwordConfirm")).sendKeys("12345");
				 Thread.sleep(5000);
				 driver.findElement(By.name("email")).clear();
				 driver.findElement(By.name("email")).sendKeys("laksjack@turt.com");
				 // select roles from the drop down 
				Select dropdown =  new Select(driver.findElement(By.name("userRole")));
				dropdown.selectByVisibleText("ROLE_USER");
				 dropdown = new Select(driver.findElement(By.name("user.enabled")));
				dropdown.selectByVisibleText("Yes");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[text()='Create User']")).click();
				 

				
		
		// TODO Auto-generated method s
	}

}
