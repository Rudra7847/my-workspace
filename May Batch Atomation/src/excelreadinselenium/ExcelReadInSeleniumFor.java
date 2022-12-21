package excelreadinselenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadInSeleniumFor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\Users\\shree\\Desktop\\test2.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("test2");
		int rowcount = sheet.getLastRowNum();
		int clmcount=sheet.getRow(0).getLastCellNum();
		System.out.println(rowcount+" "+clmcount);
		for(int i=0;i<=rowcount;i++)
		{
			XSSFRow currentrow = sheet.getRow(i);
			for(int j=0;j<=clmcount;j++)
			{
				XSSFCell value = currentrow.getCell(j);
				System.out.print(" " +value);
			}
			System.out.println();
		}
		

	}

}
