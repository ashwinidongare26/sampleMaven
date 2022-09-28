import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ReadExcel read=new ReadExcel();
		
		String filePath = "E:\\Ashwini\\SeleniumWork\\SampleMaven\\src\\ExportExcel.xls";

	    //Call read file method of the class to read data

		read.readExcelFunction(filePath,"ExportExcel.xls","ExcelGuru99Demo");

		
		
	}

	public void readExcelFunction(String filePath, String fileName, String sheetName) throws IOException
	{
		
		File file=new File(filePath);
		
		FileInputStream inputStream=new FileInputStream(file);
		
		Workbook guru99Workbook = null;
		
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
        guru99Workbook = new HSSFWorkbook(inputStream);

	    Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);
        int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

	    //Create a loop over all the rows of excel file to read it

	    for (int i = 0; i < rowCount+1; i++) {

	        Row row = guru99Sheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	        }

	        System.out.println();
	    


	}
}
}