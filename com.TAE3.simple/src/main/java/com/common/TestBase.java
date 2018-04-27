/**
 * 
 */
package com.common;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * @author sshada
 *
 */
public class TestBase {

	public WebDriver driver;
	
	String driverPath = "//com.TAE3.simple//resources//";
	String URL1 = "http://jupiter.cloud.planittesting.com/#/";
	String URL2 = "http://jupiter2.cloud.planittesting.com/#/";

	/*
	 * METHODS
	 */
	
	// Initialize Firefox instance	
	public void firefoxSetup() {
		System.out.println("Launching Firefox browser"); 
		System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
		driver = new FirefoxDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//	driver.navigate().to(URL1);
		driver.get(URL1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.manage().window().maximize();
	}


	// Initialize Chrome instance	
	public void chromeSetup() {
		System.out.println("Launching Google Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.manage().window().maximize();			
	}


	@BeforeSuite
	public void setUp() {
		System.out.println("************************************");
		firefoxSetup();
		//chromeSetup();
	}



	@AfterSuite
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
