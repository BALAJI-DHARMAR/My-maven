package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_writeexcel {
public static void main(String[] args) throws IOException {
	
	File fi= new File("C:\\Users\\Admin\\Desktop\\datadriven.xlsx");
	FileInputStream a = new FileInputStream(fi);
	Workbook wb = new XSSFWorkbook();
//	Sheet createSheet = wb.createSheet();
//    Row createRow = createSheet.createRow(0);
//	Cell createCell = createRow.createCell(0);
	
	wb.createSheet("Datas").createRow(0).createCell(0).setCellValue("Town Name");
	wb.getSheet("Datas").getRow(0).createCell(1).setCellValue("landmark");
	wb.getSheet("Datas").createRow(1).createCell(0).setCellValue("Bodinayakanur");
	wb.getSheet("Datas").getRow(1).createCell(1).setCellValue("south street");
	
	
	FileOutputStream fos = new FileOutputStream(fi);
	wb.write(fos);
	wb.close();
	System.out.println(" Sucessfully writed the xl file ");

}
}
