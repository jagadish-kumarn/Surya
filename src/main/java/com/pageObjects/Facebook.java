package com.pageObjects;

import org.openqa.selenium.By;

import com.charan.Base;

public class Facebook extends Base {
	 public static By fbuserName=By.xpath("//input[@name='email']");
     public static By fbPassword=By.xpath("//input[@id='pass']");
     public static By login=By.xpath("//button[@name='login']");
     private static By errorText=By.xpath("//div/a[text()='Find your account and log in.']");
     
      public void login(String username , String password) {
//    	  openURL("https://www.facebook.com");
          fillTextBox(fbuserName,username);
          fillTextBox(fbPassword,password);
          click(login);
          
      }
      public void errorLoginValidation(String expected ) {
    	  String actualErrorText = driver.findElement(errorText).getText();
    	  if (expected.equals(actualErrorText)) {
			System.out.println("SUCCESS");
		}else
			System.out.println("FAIL");
      }
      
}
