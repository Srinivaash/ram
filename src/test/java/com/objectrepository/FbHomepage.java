package com.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FbHomepage {

	WebDriver driver;
	 public FbHomepage( WebDriver driver) {
			// TODO Auto-generated constructor stub
			 this.driver=driver;
		}
	
	By search=By.name("global_typeahead");
	public WebElement Search()
	 {
		return driver.findElement(search);
	 }
	
	
	
	
}
