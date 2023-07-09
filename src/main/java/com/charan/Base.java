package com.charan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver = null;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void launchBrowser(String browserName){
		try {
			if (browserName.equalsIgnoreCase("Chrome")) {
				launchBrowser();
			}else if(browserName.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}else if(browserName.equalsIgnoreCase("FireFox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			maximize();
		} catch (Exception e) {
			
		}
	
			}
	    public static void maximize() {  
	    	driver.manage().window().maximize();
	    }
		public static void openURL(String url) {
			driver.get(url);
		}
		
		public static void fillTextBox(By byVariable,String textToBeFilled) {
			driver.findElement(byVariable).sendKeys(textToBeFilled);
		}
		
		public static void click(By byV) {
			try {
				driver.findElement(byV).click();
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

