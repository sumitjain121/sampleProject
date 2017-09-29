package com.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Chrome {

	public static void main (String[] args) {
	
		WebDriver driver = new ChromeDriver();
		String Actualurl = ("http://google.com");
		driver.get(Actualurl);
		
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		
		String Title = ("Google");
		if (Title != ActualTitle) {
		System.out.println("---Test Passed---");
		}
		else
			System.out.println("---Test Failed---");
		driver.close();
	}
	
}
