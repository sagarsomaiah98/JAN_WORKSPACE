import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Workbook_Create {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		
		Workbook wb = new HSSFWorkbook();
		
		try  (OutputStream fileOut = new FileOutputStream("C:\\Users\\somai\\Desktop\\TestData\\Test.xls")) {
			
			Sheet sheet1 = wb.createSheet("Test sheet 1");
			Sheet sheet2 = wb.createSheet("Test sheet2 ");
			Row row = sheet1.createRow(0);
			Cell cell = row.createCell(0);
			cell.setCellValue(1);
		    wb.write(fileOut);
		}
		System.out.println("done");
	}

}
