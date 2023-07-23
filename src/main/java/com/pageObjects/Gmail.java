package com.pageObjects;

import org.openqa.selenium.By;

import com.charan.Base;

public class Gmail extends Base {
	
	private By user = By.xpath("//input[@type='email']");
	private By pswd = By.xpath("//input[@type='password']");
	private By next = By.xpath("//span[text()='Next']");
	
	public void gmaillogin() {
		try {
			fillTextBox(user, "msuryap48@gmail.com");
			click(next);
			fillTextBox(pswd, "Cour@ge8*9");
			click(next);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
