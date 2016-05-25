package com.gm.utils;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {
	public static void main(String[] args) throws IOException {
		writeXLSXFile();
	}

	public static void writeXLSXFile() throws IOException {

		String excelFileName = "C:\\Users\\nbasnet\\Desktop\\Test.xlsx";

		String sheetName = "Sheet1";

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet(sheetName);

		// iterating r number of rows
		for (int r = 0; r < 5; r++) {
			XSSFRow row = sheet.createRow(r);

			// iterating c number of columns
			for (int c = 0; c < 5; c++) {
				XSSFCell cell = row.createCell(c);

				cell.setCellValue("Cell " + r + " " + c);
			}
		}

		FileOutputStream fileOut = new FileOutputStream(excelFileName);

		// write this workbook to an Outputstream.
		wb.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}

}
