package org.maven.datadriven.facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	
	public static WebDriver launch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Twinkle\\eclipse-workspace\\MavenPrograms\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;

	}
	
	public static void pageTitle()
	{
		
		System.out.println(driver.getTitle());
	}
	
	public static void pageUrl() {
		
		System.out.println(driver.getCurrentUrl());
		
		
	}
	
	public static void loadUrl(String str) {
		driver.get(str);

	}
	
	public static void fill(WebElement e,String text ) {
		
		e.sendKeys(text);
		

	}
	
	public static void btnClick(WebElement e) {
		
		e.click();
	}
	
	public static void switchtoNextWindow() {
		
		String parId=driver.getWindowHandle();
		
		Set<String> allId=driver.getWindowHandles();
		
		for(String x :allId)
		{
			if(!(parId.equals(x)))
					{
						driver.switchTo().window(x);
					}
				
		}
		
	}
	
	public static String getdata(int rownumber,int cellnumber) throws IOException {
		
		File f=new File("C:\\Users\\Twinkle\\eclipse-workspace\\MavenPrograms\\Excel\\students.xls");
		
		FileInputStream fin=new FileInputStream(f);
		
		Workbook w=new HSSFWorkbook(fin);
		
		Sheet s=w.getSheet("input");
		
	    Row r=s.getRow(rownumber);
	    
	    Cell c=r.getCell(cellnumber);
	    
	    String value=c.getStringCellValue();
	
		return value;
	

	}
	
	
	

}
