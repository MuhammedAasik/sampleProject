package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebdriverMethods {
	@Test
	
	public void methods() {
		WebDriver driver=new ChromeDriver();
		              /*WEBDERIVER METHODS*/
		
		//1.GET METHOD
		driver.get("https://demowebshop.tricentis.com/");
		
		//2.GET MANAGE  MAXIMIZE
		driver.manage().window().maximize();
		//3. NAVIGATE
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.navigate().to("https://www.youtube.com/user/nopCommerce");

		//3.GET TITTLE
		String tittle=driver.getTitle();
		System.out.println(tittle);
		//4.GET CURRENT URL
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//5.GETWIMDOWHANDLE
		
		String id=driver.getWindowHandle();
		System.out.println(id);
		
//		//6.GET WINDOW HANDLES
//		Set<String> multipleids=driver.getWindowHandles();
//		 System.out.println(multipleids);
//		 
//		 //7.GET PAGE SOURCE
		 String htmlcodes=driver.getPageSource();
		 System.err.println(htmlcodes);
		 

}}
