package com.webtest.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Xueli {

	

	@Test
	public void xueli() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");

		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.roqisoft.com/zhsx/");
		wd.findElement(By.linkText("µÇÂ¼")).click();
		Thread.sleep(3000);
		wd.findElement(By.name("username")).sendKeys("2724702423@qq.com");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		Actions action = new Actions(wd);
		action.moveToElement(wd.findElement(By.className("notification-box"))).perform();

		Thread.sleep(3000);
		wd.findElement(By.xpath("//a[contains(@href, '/u/teams/applications/')]")).click();

		boolean flag=wd.findElement(By.className("notification-box")).isDisplayed();
		System.out.println(flag);
		System.out.println(wd.findElement(By.className("notification-box")).getTagName());
	}
	

}
