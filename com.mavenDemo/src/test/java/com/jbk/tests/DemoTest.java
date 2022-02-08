package com.jbk.tests;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;




	public class DemoTest 
	{
		WebDriver driver;
		
		@Test
		public void test01()
		{
			System.setProperty("webdriver.chrome.driver","c:/driver/chromedriver.exe");
					
			driver = new ChromeDriver();
			driver.get("file:///C://Users//HP//ojt//selenium%20ojt//Offline%20Website//Offline%20Website//index.html");
			driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//button")).click();
			Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");


		}
		
		@Test
		public void test0()
		{
			System.setProperty("webdriver.chrome.driver","c:/driver/chromedriver.exe");
					
			driver = new ChromeDriver();
			driver.get("file:///C://Users//HP//ojt//selenium%20ojt//Offline%20Website//Offline%20Website//index.html");
			driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//button")).click();
			Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");


		}
		
		


	}



