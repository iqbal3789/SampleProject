package com.testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class SampleDataDriven {

	@Test
	private void tc1() throws IOException {

		File location = new File("D:\\Selenium Practice\\SeleniumTestNG\\src\\test\\resources\\TestData.xlsx");
		FileInputStream input = new FileInputStream(location);

		Workbook w = new XSSFWorkbook(input);

		Sheet s = w.getSheet("Python");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String s1 = c.getStringCellValue();

		if (s1.equals("JavaSelenium")) {

			c.setCellValue("PythonSelenium");
		}

		FileOutputStream output = new FileOutputStream(location);

		w.write(output);
	}

}
