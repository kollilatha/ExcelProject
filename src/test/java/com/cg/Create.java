package com.cg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\admin\\eclipse-workspace\\ExcelProject\\ExcelFolder\\Book2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Test");

		Row r = sheet.createRow(0);
		Cell c = r.createCell(0);

		c.setCellValue("kolli");

		FileOutputStream fo = new FileOutputStream(f);
		workbook.write(fo);
		System.out.println("done....");

	}
}
