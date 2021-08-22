package com.objectrepository;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;




public class FbLoginTest {

	
	 WebDriver driver;
	 public FbLoginTest( WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver=driver;
	}
	
	 By username=By.id("email");
	 By password=By.id("pass");
	 By login=By.name("login");	
	// By English=By.className("_sv4");
	 
	 public WebElement username()
	 {
		return driver.findElement(username);
	 }
	 public WebElement password()
	 {
		return driver.findElement(password);
	 }
	 public WebElement Login()
	 {
		return driver.findElement(login);
	 }
	/* public WebElement English()
	 {
		return driver.findElement(English);
	 } */
	
	
	
	
	
	
	
	
	
	
	
	
}
