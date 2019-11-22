package parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExceleasy2 {

	public static void main(String[] args) throws Throwable {
		
		
		File src = new File("C:\\Users\\jainne\\Documents\\Acord Test Execution\\Write.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int rowcount = sheet.getPhysicalNumberOfRows();
		
		System.out.println("Total rows are "+rowcount);
		
		int cellcount =sheet.getRow(0).getPhysicalNumberOfCells();
		
		
		
		System.out.println("Total columns are "+cellcount);
		
		
		
		for (int i=1;1<=rowcount;i++)
		{
			
			for (int j=0;j<cellcount;j++)
			{
			String data0= sheet.getRow(i).getCell(j).getStringCellValue();
			
			//String data1= sheet.getRow(i).getCell(j).getStringCellValue();
			
			System.out.print("Test data from excel is"+data0 );
		}
			
			System.out.println();
		}	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
