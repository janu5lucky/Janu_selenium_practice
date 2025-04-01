package com.test.qa.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Excel_data_provider_supplier_Ex_07 {

@DataProvider(name = "Logindata")
//	public static void main(String[] args) throws Exception {
	public static  String[][] dp5() throws Exception {
		String File_Path = "D:\\Janu_WorkSpace\\Jhansi_Inteview_Practice\\Janu_selenium_practice\\src\\test\\resources\\ExcelFile\\Test_DP_1.xlsx";
		File file = new File(File_Path);

		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int NoOfrows = sheet.getLastRowNum();
		int NoOfCells = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[NoOfrows][NoOfCells];

		for (int i = 0; i < NoOfrows; i++) {

			for (int j = 0; j < NoOfCells; j++) {

				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
				//System.out.println(Arrays.toString(data));

			}
			
		}
		workbook.close();
		fis.close();
		
		//for (String[] row : data) {
        //    System.out.println(Arrays.toString(row));
		
//	}
        return data;

}
}
