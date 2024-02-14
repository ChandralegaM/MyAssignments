package week6.day2codingreview;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSchool {
	
	public static String[][] exceldata(String filename) throws IOException {
		XSSFWorkbook wBook = new XSSFWorkbook("./Schooldata/"+filename+".xlsx");
		XSSFSheet sheet = wBook.getSheetAt(0);
		//System.out.println("sheet:"+sheet);
		int rowCount = sheet.getLastRowNum();
		//System.out.println("rowCount:"+rowCount);
		int columnCount = sheet.getRow(0).getLastCellNum();
		//System.out.println("columnCount:"+columnCount);
		 
		 String[][]data =new String[rowCount][columnCount];
		for (int i = 1; i < rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
			String stringCellValue = row.getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
			}
			
		}
		
		wBook.close();
		return data;
		
		
	}
	
	

}
