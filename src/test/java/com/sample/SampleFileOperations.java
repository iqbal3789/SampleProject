package com.sample;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class SampleFileOperations {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\\\FileOperation\\\\Selenium\\\\demo.txt");
		FileUtils.write(f, "Besant Online");
		System.out.println("its done");

		File f1 = new File("D:\\\\FileOperation\\\\Selenium\\\\demo.txt");
		List<String> r = FileUtils.readLines(f1);
		for (String s : r) {
			System.out.println(s);
		}
	}

}
