package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) {
		
		System.out.println("Demo for google page !!");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in");
		
		driver.manage().window().maximize();
		
		//System.out.println("Updated build to check after build jenkin runs batch or not !");
		

	}

}
