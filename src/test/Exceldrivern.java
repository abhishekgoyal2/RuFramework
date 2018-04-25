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
//		 getCelldata(1,2);
		String value=setCelldata("automation",1,1);
		System.out.println(value);
		 
//              System.out.println(value1);
		
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
	public static void getCelldata(int rownum,int colnum) throws IOException
	{
		
		wb=new XSSFWorkbook(fis);
		 wbsheet=wb.getSheet("Xpath");
		 row=wbsheet.getRow(rownum);
		 cell=row.getCell(colnum);
		 for (Row row:wbsheet)
				{
					for(Cell cell:row)
					{
						switch(cell.getCellType())
						{
							case Cell.CELL_TYPE_STRING:
								System.out.println(cell.getStringCellValue());
								break;
							case Cell.CELL_TYPE_BOOLEAN:
									System.out.println(cell.getBooleanCellValue());
									break;
							case Cell.CELL_TYPE_BLANK:
								System.out.println("blank");
								break;
							case Cell.CELL_TYPE_ERROR:
								System.out.println("error");
								break;
							case Cell.CELL_TYPE_FORMULA:
								System.out.println(cell.getCellFormula());
								break;
							case Cell.CELL_TYPE_NUMERIC:
								System.out.println(cell.getNumericCellValue());
								break;
								
						}
					}
				}

//		 String value=cell.getStringCellValue();
		
		 
	}
	
	public static String setCelldata(String text,int rownum,int colnum) throws IOException
	{
		wb=new XSSFWorkbook(fis);
		 wbsheet=wb.getSheet("Xpath");
		 Row row=wbsheet.getRow(2);
		 cell=(XSSFCell) row.getCell(2);

		 cell.setCellValue(text);				
		 String celldata1= cell.getStringCellValue();

		 return celldata1;
				
			}
	
	private static String setCellvalue(int i, int j) {

		// TODO Auto-generated method stub

		return null;

		}
			
		

//		 String value=cell.getStringCellValue();
		
		 
	}


