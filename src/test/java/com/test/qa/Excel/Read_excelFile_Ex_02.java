package com.test.qa.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_excelFile_Ex_02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//Read_excelFile_Ex_02 obj = new Read_excelFile_Ex_02();
		Read_Dynamic_data_from_ExcelFile();
		
	}

	Read_excelFile_Ex_02() throws Exception{
		
		String File_Path = 
		"D:\\Janu_WorkSpace\\Jhansi_Inteview_Practice\\Janu_selenium_practice\\src\\test\\resources\\ExcelFile\\test_xl_file_2.xlsx";
		File file = new File (File_Path);
		
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		String CellValue = sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(CellValue);
		
		workbook.close();
		fis.close();
		
		////.getSheetName("newsheet1");
		
		
		
	}
	
	public static void Read_Dynamic_data_from_ExcelFile() throws Exception {
		
		String File_Path = 
				"D:\\Janu_WorkSpace\\Jhansi_Inteview_Practice\\Janu_selenium_practice\\src\\test\\resources\\ExcelFile\\test_xl_file_2.xlsx";
				File file = new File (File_Path);
				
				FileInputStream fis = new FileInputStream(file);
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				XSSFSheet sheet = workbook.getSheetAt(1);
				int rows = sheet.getPhysicalNumberOfRows();
			//	int rows1 = sheet.getLastRowNum();
				for(int i =0; i<rows;i++) {
					XSSFRow row = sheet.getRow(i);
					int cellcount = row.getPhysicalNumberOfCells();
				//	int cellcount2 = row.getLastCellNum();
					
				for(int j =0;j<cellcount;j++) {
					XSSFCell  cell = row.getCell(j);
					String cellvalue = getCellValue(cell);
					System.out.print("||"+cellvalue);
					
					
				}
					
				System.out.println("");
	
					
				}
	
	}
				
		public static String getCellValue (XSSFCell cell) {
			
			switch (cell.getCellType()){
			case NUMERIC:
				
				return String.valueOf(cell.getNumericCellValue());

				
			case BOOLEAN:
				
				return String.valueOf(cell.getBooleanCellValue());

			case STRING:
				
				return String.valueOf(cell.getStringCellValue());
				
			default:
				return String.valueOf(cell.getStringCellValue());

			}
			//break;

		//	return null;
			
		}
	}
	
