package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static void main(String[] args) throws IOException {
		getCellData();
	}

	public static void getRowCount() throws IOException {

		 projectPath=System.getProperty("user.dir");
		
		 workbook =new XSSFWorkbook(projectPath+"/Excel/datafile.xlsx");
		//XSSFWorkbook workbook=new XSSFWorkbook("E:\\Ashwini\\SeleniumWork\\SampleMaven\\Excel\\datafile.xlsx");
		 sheet=workbook.getSheet("Sheet1");
		int rowCount= sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);

	}
	
	public  static void getCellData() throws IOException
	{
		 projectPath=System.getProperty("user.dir");
			
		 workbook =new XSSFWorkbook(projectPath+"/Excel/datafile.xlsx");
		//XSSFWorkbook workbook=new XSSFWorkbook("E:\\Ashwini\\SeleniumWork\\SampleMaven\\Excel\\datafile.xlsx");
		 sheet=workbook.getSheet("Sheet1");
		int rowCount= sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		
		String cellData=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellData);

	}

}
