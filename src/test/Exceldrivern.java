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
//
public class Exceldrivern {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
              File file=new File("D:\\automationXpath\\Excel_CQRoll_xpath.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet wbsheet=wb.getSheet("Xpath");
//		 row =wbsheet.getRow(3);
//		XSSFCell cell= row.getCell(1);
//		String value =cell.getStringCellValue();
//		Boolean bolvalue=cell.getBooleanCellValue() ;
//		System.out.println(bolvalue);
		
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

//		System.out.println(value);
	}

}
