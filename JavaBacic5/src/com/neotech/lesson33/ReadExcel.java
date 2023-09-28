package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir") + "/test_data/Test.xlsx";

		FileInputStream fis = new FileInputStream(filePath);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("TestData");

		// get the number of rows
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows = " + rows);

		// get the number of columns
		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println("Number of columns in first row = " + cols);

		System.out.println("-----------------------");

		// release memory by closing the connections
		book.close();
		fis.close();

	}

}
