package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
//
public class Exceldrivern {
	public static XSSFWorkbook wb;
	public static XSSFSheet wbsheet;
	public static XSSFRow row;
	public static XSSFCell cell;

	public static FileInputStream fis;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
              
		fis =new FileInputStream("D:\\automationXpath\\Excel_CQRoll_xpath.xlsx");
		String value1 =getCelldata(2,2);
              System.out.println(value1);
		
//		 row =wbsheet.getRow(3);
//		XSSFCell cell= row.getCell(1);
//		String value =cell.getStringCellValue();
//		Boolean bolvalue=cell.getBooleanCellValue() ;
//		System.out.println(bolvalue);
		
//		for (Row row:wbsheet)
//		{
//			for(Cell cell:row)
//			{
//				switch(cell.getCellType())
//				{
//					case Cell.CELL_TYPE_STRING:
//						System.out.println(cell.getStringCellValue());
//						break;
//					case Cell.CELL_TYPE_BOOLEAN:
//							System.out.println(cell.getBooleanCellValue());
//							break;
//					case Cell.CELL_TYPE_BLANK:
//						System.out.println("blank");
//						break;
//					case Cell.CELL_TYPE_ERROR:
//						System.out.println("error");
//						break;
//					case Cell.CELL_TYPE_FORMULA:
//						System.out.println(cell.getCellFormula());
//						break;
//					case Cell.CELL_TYPE_NUMERIC:
//						System.out.println(cell.getNumericCellValue());
//						break;
//						
//				}
//			}
//		}

	
//		System.out.println(value);
	}
	public static String getCelldata(int rownum,int colnum) throws IOException
	{
		
		wb=new XSSFWorkbook(fis);
		 wbsheet=wb.getSheet("Xpath");
		 row=wbsheet.getRow(rownum);
		 cell=row.getCell(colnum);
		 String value=cell.getStringCellValue();
		return value;
		 
	}

}
