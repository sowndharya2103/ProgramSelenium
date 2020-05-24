package org.maven.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelUpdate {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Twinkle\\eclipse-workspace\\MavenPrograms\\Excel\\students.xls");
		
		Scanner sc=new Scanner(System.in);

		FileInputStream fin=new FileInputStream(f);
			
		Workbook w=new HSSFWorkbook(fin);
		
		Sheet s=w.getSheet("input");
		
		int rowCount=s.getPhysicalNumberOfRows();
		Row r=s.createRow(rowCount);
		System.out.println(rowCount);
		
	for(int i=0;i<2;i++)
	{
			Cell c=r.createCell(i);
			String text="";
			System.out.println("enter the text for " +i + "cell");
			text=sc.next();
			c.setCellValue(text);
			FileOutputStream fout=new FileOutputStream(f);
			w.write(fout);

	}


		
		System.out.println("done");
}
}
