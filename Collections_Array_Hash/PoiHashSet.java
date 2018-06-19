package visam.com.Assignment.PoiArrayList;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoiHashSet {

	
	static XSSFRow row;

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\Sai KumarReddy sheru\\Desktop\\new1.xlsx"));

		 HashSet<String> set=new HashSet<String>();  

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet spreadsheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = spreadsheet.iterator();

		while (rowIterator.hasNext()) {
			row = (XSSFRow) rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();

				set.add(cell.getStringCellValue());

			}
		}
		fis.close();
		
		for(String s:set)
System.out.println(s);		
		
		
		/*Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
	}	*/
	}

	
	
	
	
	
	
	
}
