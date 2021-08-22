package com.testcases;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.FbHomepage;
import com.objectrepository.FbLoginTest;

public class Loginapplication {

	@Test
	public void Login()
	
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MURUGANANDHAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		FbLoginTest fb=new FbLoginTest(driver);
	//	fb.English().click();
		fb.username().sendKeys("7904498003");
		fb.password().sendKeys("8883421012");
		fb.Login().click();
		FbHomepage hh=new FbHomepage(driver);
		hh.Search().sendKeys("nivash Muruganantham");
		hh.Search().sendKeys(Keys.ENTER);
		
		
	
	}
	
	
}
