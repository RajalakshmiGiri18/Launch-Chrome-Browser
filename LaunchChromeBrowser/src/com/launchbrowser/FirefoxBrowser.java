package com.launchbrowser;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Administrator\\Documents\\Testing course\\SeleniumJava\\LaunchChromeBrowser\\EdgeBrowserJars\\msedgedriver.exe");
	       FirefoxDriver driver=new FirefoxDriver();
	       driver.get("https://auth.hollandandbarrett.com/u/login");
	       driver.manage().window().maximize();
	       Thread.sleep(2000);
	       driver.manage().window().minimize();
	       driver.quit();

	}

}
