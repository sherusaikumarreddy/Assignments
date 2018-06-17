package com.Assignment3.MsExcel_Report;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet spreadsheet = workbook.createSheet("EMP ID");

		XSSFRow row;
		
		Map<String,Object[]> empinfo = new TreeMap <String, Object[]>();
		
		empinfo.put("1",new Object[] { "ID" , "NAME", "DESIGNATION"});
		empinfo.put("2",new Object[] { "101" , "sss", "Tester"});
		empinfo.put("3",new Object[] { "102" , "aaa", "Developer"});

		empinfo.put("4",new Object[] { "103" , "iii", "Analyst"});

		empinfo.put("5",new Object[] { "104" , "kkk", "Manager"});
		empinfo.put("6",new Object[] { "105" , "uuu", "Developer"});

		
		Set<String> keyid = empinfo.keySet();
		int rowid = 0;
		for(String key : keyid) {
			row= spreadsheet.createRow(rowid++);
			Object[] objectArr = empinfo.get(key);
			int cellid = 0;
			
			for(Object obj : objectArr) {
				Cell cell = row.createCell(cellid++);
				cell.setCellValue((String)obj);
			}}
		
		FileOutputStream out= new FileOutputStream(new File("C:\\Users\\Sai KumarReddy sheru\\Desktop\\Write.xlsx"));
		workbook.write(out);
		out.close();
		System.out.println("sheet is written successfully");
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\Sai KumarReddy sheru\\Desktop\\Write.xlsx"));
	      
	      XSSFWorkbook workbook1 = new XSSFWorkbook(fis);
	      XSSFSheet spreadsheet1 = workbook.getSheetAt(0);
	      Iterator < Row >  rowIterator = spreadsheet.iterator();
	      
	      while (rowIterator.hasNext()) {
	         row = (XSSFRow) rowIterator.next();
	         Iterator < Cell >  cellIterator = row.cellIterator();
	         
	         while ( cellIterator.hasNext()) {
	            Cell cell = cellIterator.next();
	            
	            switch (cell.getCellType()) {
	               case Cell.CELL_TYPE_NUMERIC:
	                  System.out.print(cell.getNumericCellValue() + " \t\t ");
	                  break;
	               
	               case Cell.CELL_TYPE_STRING:
	                  System.out.print(
	                  cell.getStringCellValue() + " \t\t ");
	                  break;
	            }
	         }
	         System.out.println();
	      }
	      fis.close();
	}
}









