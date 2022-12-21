package excelreadinselenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWithRowInSelenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\Users\\shree\\Desktop\\test2.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("test2");
		int rowcount = sheet.getLastRowNum();
		short clmcount = sheet.getRow(0).getLastCellNum();
		System.out.println(rowcount+" "+clmcount);
		for(int i=0;i<=clmcount;i++)
		{
			XSSFCell value1 = sheet.getRow(0).getCell(i);
			System.out.print(" "+value1);
			XSSFCell value2 = sheet.getRow(1).getCell(i);
			System.out.print(" "+value2);
			System.out.println();
		}
		
		

	}

}
