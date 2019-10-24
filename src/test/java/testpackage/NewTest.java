package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		
		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.operadriver().setup();
//		WebDriverManager.phantomjs().setup();
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();
		
		
				
//		WebDriverManager.iedriver().setup();
//		driver = new InternetExplorerDriver();
		
	}
	

	@Test
	public void BasicTestCase(){
		driver.get("https://www.google.com");
		String x = driver.getTitle();
		System.out.println(x);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}
