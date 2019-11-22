package parameterization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	
	public static void main(String[] args) throws Throwable {
		
		
		XSSFWorkbook WB = new XSSFWorkbook();
		
		XSSFSheet sheet0 = WB.createSheet("sheet1");
		
	Row row0= sheet0.createRow(1);
	
	Row row1= sheet0.createRow(2);
	
	Cell cellA = row0.createCell(0);
	
	Cell cellB = row0.createCell(1);
	
Cell cellC = row1.createCell(0);
	
	Cell cellD = row1.createCell(1);
	
	
	
	cellA.setCellValue("First cell");
	
	cellB.setCellValue("Second cell");
	
cellC.setCellValue("Third cell");
	
	cellD.setCellValue("Fourth cell");
	
	
	File f = new File("C:\\Users\\jainne\\Documents\\Acord Test Execution\\Write.xlsx");
	
	FileOutputStream fo = new FileOutputStream(f); //output stream is used to write the data in the excel file and input stream is used to read the data from excel
	
	WB.write(fo);
	
	fo.close();
	
	System.out.println("File Created!!");
	}

}
