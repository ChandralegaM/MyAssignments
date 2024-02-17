package marathon1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public  static String[][] excelDataSF(String fileName) throws IOException {
		XSSFWorkbook wB=new XSSFWorkbook("./Data Folder/"+fileName+".xlsx");
		XSSFSheet sheet = wB.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count:"+rowCount);
		
		short columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("column Count:"+columnCount);
		String[][] data= new String[rowCount][columnCount]  ;
		for (int i = 1; i < rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue = row.getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
				
			}
			
		}
		wB.close();
		return data;
	}
}
