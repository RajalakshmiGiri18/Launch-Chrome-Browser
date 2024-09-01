package com.launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AllBrowsers {
	WebDriver driver;
	@Test(priority=1)
	public void ChromeBrowserLaunch() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.quit();		
	}
	@Test (priority=2)
	public void EdgeBrowserLaunch() throws Exception {
		System.setProperty("webdriver.edge.driver", "./EdgeBrowserJars/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.quit();		
	}
	
	@Test (priority=3)
	public void FirefoxBrowserLaunch() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./FirefoxDriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.quit();		
	}
	

}