//package com.practice.lcode;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//
//
//class File {
//	String fileName;
//	String person;
//	File (String fileName, String person) {
//		this.fileName = fileName;
//		this.person = person;
//	}
//	String getFileName() {
//		return fileName;
//	}
//	String getPerson() {
//		return person;
//	}
//	 
//}
//
//public class FileOwners {
//	
//	void groupByOwners(List<File> files) {
//		files.stream()
//			.collect(Collectors.groupingBy(File::getPerson));
//	}
//
//	public static void main(String[] args) {
//		List<File> files = new ArrayList<>();
//		JSONParser parser = new JSONParser();
//		
//		try {
//			Object object = parser.parse(new FileReader("/Users/pdong/eclipse-workspace/CCoding/src/com/practice/lcode/files"));
//			JSONObject jsonObject = (JSONObject) object;
//			
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		
//
//	}
//
//}
