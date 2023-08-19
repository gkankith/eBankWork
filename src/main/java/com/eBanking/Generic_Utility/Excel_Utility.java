package com.eBanking.Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	public  String readExcelData(String sheet,int row,int cell) throws Throwable {
		FileInputStream fis=new FileInputStream("src/test/resources/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		System.out.println(data);
		return data;

	}


	public String readExcelDataByDataFormattor(String sheet,int row,int cell) throws Throwable {
		FileInputStream fis=new FileInputStream("src/test/resources/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
		DataFormatter format=new DataFormatter();
		String data = format.formatCellValue(c);
		System.out.println(data);
		return data;
	}
	
	public int getRowCount(String sheet) throws Throwable {
		FileInputStream fis=new FileInputStream("src/test/resources/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rnum = wb.getSheet(sheet).getLastRowNum();
		return rnum;
		
	}
	
	public int getCellCount(String sheet,int row) throws Throwable
	{
		FileInputStream fis = new FileInputStream("src/test/resources/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Row r = wb.getSheet(sheet).getRow(row);
		 int c = r.getLastCellNum();
		 return c;
	}
}


