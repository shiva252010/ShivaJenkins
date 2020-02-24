package com.test.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test12 {
	@Test
	public void testJenkins()
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}
