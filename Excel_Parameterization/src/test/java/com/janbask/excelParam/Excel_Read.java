package com.janbask.excelParam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Excel_Read {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		
           Xls_Reader xls = new Xls_Reader("S:\\\\JANBASK\\\\JAN_WORKSPACE\\\\Excel_Parameterization\\\\EXCEL_DATA\\\\TESTSUITE.xlsx");
         int row_count=  xls.getRowCount("GMAIL");
         
       //  System.out.println(row_count);
         
         for(int i=0;i<=row_count;i++) {
         
       String value=  xls.getCellData("GMAIL", "TCID", i);
       
       String value1=  xls.getCellData("GMAIL", "TESTCASE", i);
       
       String value2=  xls.getCellData("GMAIL", "STATUS", i);
       
       System.out.println(value+" - "+value1+" - "+value2);
         }  
           
         
         
         xls.addColumn("GMAIL", "SUMMARY");
	}

}
