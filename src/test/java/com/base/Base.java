package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	static WebDriver driver;
	public static int i = 1;
	public static int j = 0;

	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\eclipse-workspace\\ExcelProject\\Driver\\chromedriver1.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
		return driver;
	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void type(WebElement e, String s) {
		e.sendKeys(s);

	}

	public static void btnclick(WebElement e) {
		e.click();

	}

	public static void listDown(WebElement e, String value) {

		Select s = new Select(e);
		s.selectByVisibleText(value);

	}

	public static void quitBrowser() {

		driver.quit();
	}

	public static void setingOrderid(WebElement e, String value) {

	}

	public static String setData(String num) throws IOException {
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\ExcelProject\\ExcelFolder\\Book2.xlsx");
		FileInputStream fs = new FileInputStream(f);
		XSSFWorkbook w = new XSSFWorkbook(fs);

		Sheet s = w.getSheet("Test");
		Row r = s.getRow(1);
		Cell c = r.createCell(18);
		c.setCellValue(num);
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);

		return num;

	}

}
