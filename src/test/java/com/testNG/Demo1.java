package com.testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1 {

	public static void main(String[] args) throws IOException {

		// Read the Excel Sheet
		File location = new File("D:\\Selenium Practice\\SeleniumTestNG\\src\\test\\resources\\TestData.xlsx");

		FileInputStream input = new FileInputStream(location);

		Workbook w = new XSSFWorkbook(input);

		Sheet s = w.getSheet("Selenium");

		Row r = s.getRow(0);

		Cell c = r.getCell(0);

		System.out.println(c);

	}
}
