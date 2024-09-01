package com.launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Documents\\Testing course\\SeleniumJava\\LaunchChromeBrowser\\ChromeDriverJars\\chromedriver.exe");
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://auth.hollandandbarrett.com/u/login");
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.manage().window().minimize();
       driver.quit();
       
	}

}
