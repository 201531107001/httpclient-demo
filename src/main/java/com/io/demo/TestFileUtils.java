package com.io.demo;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class TestFileUtils {
	public static void main(String[] args){
		//System.out.println(getFileString());
		//testWrite();
		//testWriteLines();
		testReadLines();
	}
	
	/**
	 * 获取文件里的字符串返回
	 * @return
	 */
	public static String getFileString(){
		
		File file = new File("src/main/java/resources/demoString.txt");
		String str = null;
		
		try {
			Charset cs = Charset.forName("UTF-8");
			str = FileUtils.readFileToString(file,cs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return str;
	}
	
	/**
	 * 一次读取一行，放入list中
	 */
	public static void testReadLines() {
		File file = new File("src/main/java/resources/demoString.txt");
		List<String> lines = null;
				
		try {
			Charset cs = Charset.forName("UTF-8");
			lines = FileUtils.readLines(file,cs);
			System.out.println(lines);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 将字符串写入文件
	 */
	public static void testWrite() {
		File file = new File("src/main/java/resources/demoString.txt");
		Charset cs = Charset.forName("UTF-8");
		try {
			FileUtils.write(file, "\ni hate you",cs,true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 将list中的元素一个一行写入文件
	 */
	public static void testWriteLines() {
		File file = new File("src/main/java/resources/demoString.txt");
		List<String> lines = new ArrayList<>();
		lines.add("don't give up");
		lines.add("do your best");
				
		try {
			FileUtils.writeLines(file, lines,true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
