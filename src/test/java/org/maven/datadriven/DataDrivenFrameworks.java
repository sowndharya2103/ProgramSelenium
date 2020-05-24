package org.maven.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;



public class DataDrivenFrameworks {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Twinkle\\eclipse-workspace\\MavenPrograms\\Excel\\students.xls");
		
		//FileInputStream fin=new FileInputStream(f);
		Scanner sc=new Scanner(System.in);
		
		Workbook w=new HSSFWorkbook();
		
		Sheet s=w.createSheet("input");
		
		
		for (int i=0;i<11;i++)
		{
			Row r=s.createRow(i);	
			
			for(int j=0;j<2;j++)
			{
				Cell c=r.createCell(j);
				if(j==0)
				{
					String name= "";
					System.out.println("print a name" + i + j);
					name =sc.next();
					c.setCellValue(name);
				}
				
				else {
					String course="";
					System.out.println("Print a course" + i +j);
					course=sc.next();
					c.setCellValue(course);
					
				}
				
			}
		}
		
		
	FileOutputStream fout=new FileOutputStream(f);
	
	w.write(fout);
	
		
	System.out.println("Done");
		
		
		
	}

}
