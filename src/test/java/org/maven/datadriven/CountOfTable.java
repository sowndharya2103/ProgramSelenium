package org.maven.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class CountOfTable {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Twinkle\\eclipse-workspace\\MavenPrograms\\Excel\\students.xls");
		
		FileInputStream fin=new FileInputStream(f);
		
		Workbook w=new HSSFWorkbook(fin);
		
		Sheet s=w.getSheet("input");
		int temp=0;
		
		System.out.println("total no.of rows=" + s.getPhysicalNumberOfRows());
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		
			Row r=s.getRow(i);
			
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c=r.getCell(j);
				System.out.println(c.getStringCellValue());
				temp++;
			
			}
	
			
		}
		System.out.println("total no.of cells" + " " + temp);
		
	}

}
