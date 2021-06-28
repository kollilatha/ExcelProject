package com.cg;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {

	public static Object[][] readExcelData(String path, String sheetname) throws IOException {

		XSSFWorkbook w = new XSSFWorkbook(path);

		Sheet s = w.getSheet(sheetname);
		int rowCount = s.getLastRowNum();
		int cellcount = s.getRow(1).getLastCellNum();
		Object[][] obj = new Object[rowCount][cellcount];
		for (int i = 1; i < rowCount + 1; i++) {

			for (int j = 0; j < cellcount; j++) {
				obj[i][j] = s.getRow(i + 1).getCell(j).toString();
			}
		}
		return obj;
	}
}
