package com.cg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\ExcelProject\\ExcelFolder\\Book1.xlsx");
		FileInputStream fs = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet("UP");
		Row row = sheet.getRow(1);
		org.apache.poi.ss.usermodel.Cell cell = row.getCell(1);
		String name = cell.getStringCellValue();
		if (name.equals("Lawson")) {
			cell.setCellValue("latha");

		}
		FileOutputStream fo = new FileOutputStream(f);
		workbook.write(fo);
		System.out.println("modified");
	}
}
