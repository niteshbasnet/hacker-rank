package com.gm.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsManipulator {

	final static Logger logger = Logger.getLogger(XlsManipulator.class);
	private static final String SOURCE_XLSX = "C:\\Users\\nbasnet\\Desktop\\data.xlsx";
	private static final String DEST_XLSX = "C:\\Users\\nbasnet\\Desktop\\data-output.xlsx";
	private static final String KEYS_XLSX = "C:\\Users\\nbasnet\\Desktop\\keys.xlsx";

	public void updateSummary() throws Exception {
		logger.info("XlsManipulator::updateSummary");
		XSSFWorkbook srcWorkBook = new XSSFWorkbook();
		XSSFWorkbook keysWorkBook = new XSSFWorkbook();

		FileInputStream srcFileInputStream;
		FileInputStream keysFileInputStream;
		FileOutputStream destFileInputStream;
		try {
			srcFileInputStream = new FileInputStream(SOURCE_XLSX);
			keysFileInputStream = new FileInputStream(KEYS_XLSX);

			srcWorkBook = new XSSFWorkbook(srcFileInputStream);
			keysWorkBook = new XSSFWorkbook(keysFileInputStream);

			Sheet srcSheet = srcWorkBook.getSheetAt(0);

			Sheet keysSheet = keysWorkBook.getSheetAt(0);
			Iterator<Row> keysRowIterator = keysSheet.iterator();
			int keyCount = 0;
			keysRowIterator.next();
			while (keysRowIterator.hasNext()) {
				keyCount++;

				Row keysRow = keysRowIterator.next();
				if (!isRowEmpty(keysRow)) {
					Cell keyCell = keysRow.getCell(0);
					Cell summaryKeyCell = keysRow.getCell(1);
					Cell noteKeyCell = keysRow.getCell(2);
					Cell resolutionKeyCell = keysRow.getCell(3);

					String key[] = keyCell.getStringCellValue().split("\\^\\^");
					String summaryKey = summaryKeyCell.getStringCellValue();
					String noteKey = noteKeyCell.getStringCellValue();
					String resolutionKey = resolutionKeyCell.getStringCellValue();

					logger.info("-------------------------------------------------------------------------------------------------------------------------");
					logger.info("noteKey::[" + keyCount + "]" + Arrays.toString(key));
					logger.info("-------------------------------------------------------------------------------------------------------------------------");
					Iterator<Row> srcRowIterator = srcSheet.iterator();
					while (srcRowIterator.hasNext()) {
						Row srcRow = srcRowIterator.next();
						Cell summaryCell = srcRow.getCell(11);
						Cell noteCell = srcRow.getCell(12);
						Cell resolutionCell = srcRow.getCell(13);

						String note = noteCell.getStringCellValue();
						for (int i = 0; i < key.length; i++) {
							if (note.toLowerCase().contains(key[i].toLowerCase())) {
								summaryCell.setCellValue(summaryKey);
								noteCell.setCellValue(noteKey);
								resolutionCell.setCellValue(resolutionKey);
								logger.info("note::beingReplaced::" + key[i]);
							}
						}
					}
					logger.info("-------------------------------------------------------------------------------------------------------------------------");
				}

			}

			destFileInputStream = new FileOutputStream(new File(DEST_XLSX));
			srcWorkBook.write(destFileInputStream);
			destFileInputStream.close();
			srcFileInputStream.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		srcWorkBook.close();
		keysWorkBook.close();
	}

	public static boolean isRowEmpty(Row row) {
		for (int c = row.getFirstCellNum(); c < row.getLastCellNum(); c++) {
			Cell cell = row.getCell(c);
			if (cell != null && cell.getCellType() != Cell.CELL_TYPE_BLANK)
				return false;
		}
		return true;
	}
}
