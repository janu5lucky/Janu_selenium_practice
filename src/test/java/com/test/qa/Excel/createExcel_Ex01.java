package com.test.qa.Excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class createExcel_Ex01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		xls_file_write();
		xlsx_file_write();
		
		}

	
	public static void xls_file_write() throws IOException   {
		HSSFWorkbook workbook = new  HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("newsheet1");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Hello");
		sheet.getRow(0).createCell(1).setCellValue("World");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Excel Data");
		sheet.getRow(1).createCell(1).setCellValue("Write Data");

		File file = new File("D:\\Janu_WorkSpace\\Jhansi_Inteview_Practice\\Janu_selenium_practice\\src\\test\\resources\\ExcelFile\\test_xl_file_2.xls");
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
	
	}
	
	public static void xlsx_file_write() throws IOException   {
		XSSFWorkbook workbook = new  XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("newsheet1");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Hello");
		sheet.getRow(0).createCell(1).setCellValue("World");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Excel Data");
		sheet.getRow(1).createCell(1).setCellValue("Write Data");

		File file = new File
		("D:\\Janu_WorkSpace\\Jhansi_Inteview_Practice\\Janu_selenium_practice\\src\\test\\resources\\ExcelFile\\test_xl_file_2.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
	
	}
	
}
