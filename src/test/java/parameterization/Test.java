package parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import com.sample.firstmavenproject.ExcelUtils;

public class Test 

{
	int rowcount;
	@org.testng.annotations.Test(dataProvider= "Neeraj")
	public void Exceldata() throws Exception
	{
		File src = new File("C:\\\\Users\\\\jainne\\\\Documents\\\\Acord Test Execution\\\\Write.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet =wb.getSheet("Sheet1");
		
	rowcount= sheet.getPhysicalNumberOfRows();
		
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
	
         //  WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds)
//		for (int i=0;i<=rowcount;i++) {
//		
//		String data0=sheet.getRow(i).getCell(0).getStringCellValue();
//		
//           String data1 = sheet.getRow(i).getCell(0).getStringCellValue();
//           
		}
	
	//how to get total number of frames
	
	
		
	
	
	@DataProvider(name = "Neeraj")
	public Object[][] getdata()
	
	{
		Object[][] data = new Object[rowcount][2] ;
		for (int i=0;i<=rowcount;i++) {
		
		//	data[i][0]= .getCellData(i, 0);
			
		}
		
		return null;
		
		
	}
	
	

	
	
}
