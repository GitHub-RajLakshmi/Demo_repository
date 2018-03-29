
    //    package zTest;

		import java.util.Iterator;
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		import org.openqa.selenium.support.ui.Select;

		public class Controller {
			
			public static void main(String[] args) throws InterruptedException {
				 
				 ChromeOptions options=new ChromeOptions();
				 options.setProxy(null);
				 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\rajrajm\\\\Desktop\\\\ChromeDriver\\\\chromedriver.exe");
				ChromeDriver driver= new ChromeDriver(options);
				
		driver.get("http://dv2-ls-cts-1:4200/");
		driver.manage().window().maximize() ;
		Thread.sleep(5000);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("jdoe@corp.com");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.id("text-left")).click();
		Thread.sleep(5000);

		driver.findElement(By.linkText("Discover")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Controller Release")).click();

		driver.findElement(By.xpath(".//div/div/div[1]/div[2]/div/button")).click();

		Thread.sleep(10000);

		List<WebElement> allNames = driver.findElements(By.xpath(".//datatable-body-row/div[2]/datatable-body-cell[1]/div"));
		WebElement wb = driver.findElement(By.xpath("//a[contains(@aria-label,'go to next page')]"));

		boolean found = false;
		while (wb.isEnabled()) {
		for (int j = 0; j < allNames.size(); j++) {
		    Thread.sleep(1000);
		if(allNames.get(j).getText().equalsIgnoreCase("fspodrtp03-n02"))  {
		    System.out.println("inside true part");
		           Thread.sleep(5000);
		           j=j+1;
		           driver.findElement(By.xpath("(.//*[@class='btn btn-sm btn-warning'])["+j+"]")).click();
		           Thread.sleep(5000);
		           found = true;
		           Thread.sleep(10000);
					driver.findElement(By.xpath("//*[@class='modal-footer']//*[text()='Delete']")).click();
					Thread.sleep(10000);
					break;
					
		    }


		}

		if (found == false) {
			wb.click();
		}

		}
			}
			
		
			





		// TODO Auto-generated method stub

	}


