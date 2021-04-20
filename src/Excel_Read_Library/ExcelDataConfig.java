package Excel_Read_Library;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
public FileInputStream fis ;
public XSSFWorkbook workbok;
public XSSFSheet sheet1;

	public ExcelDataConfig (String xlpath)  {
		
		try {
			File exlpath = new File(xlpath);
			
			fis = new FileInputStream(exlpath);
			workbok = new XSSFWorkbook(fis);    //load full workbook.
			
			
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public String getData(int sheetNumber, int row, int column) {
		
		sheet1 =workbok.getSheetAt(0);
		
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}
}
