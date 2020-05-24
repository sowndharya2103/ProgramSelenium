package org.maven.datadriven.facebook;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class FaceBook extends BaseClass{

	public static void main(String[] args) throws IOException {
		
		launch();
		loadUrl("https://www.facebook.com/");
		pageTitle();
		pageUrl();
		WebElement txtEmail=driver.findElement(By.id("email"));
		fill(txtEmail, getdata(1, 0));
		
		WebElement txtPass=driver.findElement(By.id("pass"));
		
		fill(txtPass, getdata(1, 1));
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\Users\\Twinkle\\eclipse-workspace\\MavenPrograms\\ScreenShot\\fb.jpg");
		
		FileUtils.copyFile(src, des);
		
		WebElement btn=driver.findElement(By.xpath("//input[@value='Log In']"));
		
		btnClick(btn);
		switchtoNextWindow();
		pageUrl();
		
		System.out.println("done");
		
		
		
		
	}

}
