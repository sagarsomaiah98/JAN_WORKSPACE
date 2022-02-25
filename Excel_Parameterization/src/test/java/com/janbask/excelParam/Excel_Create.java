package com.janbask.excelParam;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Excel_Create {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		//using forloop create multiple sheet and multiple data
		
		Workbook wb = new HSSFWorkbook();
		
		try  (OutputStream fileOut = new FileOutputStream("S:\\JANBASK\\JAN_WORKSPACE\\Excel_Parameterization\\EXCEL_DATA\\Data.xls")) {
			Sheet sheet1 = wb.createSheet("new sheet");
	        Sheet sheet2 = wb.createSheet("second sheet");
	        Row row = sheet1.createRow(0);
	        Cell cell = row.createCell(0);
	       
	        cell.setCellValue(1);
	        //or
	        row.createCell(1).setCellValue(1.2);
	        row.createCell(2).setCellValue("test");
	             
	        row.createCell(3).setCellValue(true);
	        
	        
	        
	        Row row1 = sheet2.createRow(1);
	        Cell cell1 = row1.createCell(0);
	       
	        cell1.setCellValue(100);
	        //or
	        row1.createCell(1).setCellValue(2.1);
	        row1.createCell(2).setCellValue("janbask");
	             
	        row1.createCell(3).setCellValue(false);
			
			    wb.write(fileOut);
			
		}
	}

}
