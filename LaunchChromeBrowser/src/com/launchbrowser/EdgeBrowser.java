package com.launchbrowser;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\Administrator\\Documents\\Testing course\\SeleniumJava\\LaunchChromeBrowser\\EdgeBrowserJars\\msedgedriver.exe");
	       EdgeDriver driver=new EdgeDriver();
	       driver.get("https://auth.hollandandbarrett.com/u/login");
	       driver.manage().window().maximize();
	       Thread.sleep(2000);
	       driver.manage().window().minimize();
	       driver.quit();
	       

	}

}
