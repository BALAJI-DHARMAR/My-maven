package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven { 

//	private static void particulardata() throws IOException {
//
//		
//		File f = new File("C:\\Users\\Admin\\Desktop\\datadriven.xlsx");
//		
//		FileInputStream i = new FileInputStream(f);
//		Workbook w = new XSSFWorkbook(i);
//		Sheet sheetAt = w.getSheetAt(0);
//		Row row = sheetAt.getRow(4);
//		Cell cell = row.getCell(1);
//		CellType cellType = cell.getCellType();
//		
//		if (cellType.equals(CellType.STRING)) {
//			String stringCellValue = cell.getStringCellValue();
//			System.out.println(stringCellValue);
//		}
//		
//		
//		else if (cellType.equals(CellType.NUMERIC)) {
//			double numericCellValue = cell.getNumericCellValue();
//			int a = (int) numericCellValue;
//			System.out.println(a);
//			
//		}
//		System.out.println("-----------------------------------");
//	
//	}
	
	private static void alldata() throws IOException {
		
		File e = new File("C:\\Users\\Admin\\Desktop\\datadriven.xlsx");
		FileInputStream inp = new FileInputStream(e);
		Workbook wb = new XSSFWorkbook(inp);
		Sheet sheetAt = wb.getSheetAt(0); 
		
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		 
		for (int i = 0; i < physicalNumberOfRows; i++) {
		    
			Row row = sheetAt.getRow(i);
			
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < physicalNumberOfCells; j++) {
				
				 Cell cell = row.getCell(j);
				 CellType cellType = cell.getCellType();
				 
				 if (cellType.equals(CellType.STRING)) {
					 String stringCellValue = cell.getStringCellValue();
					 System.out.println(stringCellValue);
				}
				 else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int a = (int) numericCellValue;
					System.out.println(a);
				}
			} 
			
			
		}
		
	

	}
	public static void main(String[] args) throws IOException {
//		particulardata();
		alldata();
	}
}
