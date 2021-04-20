package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		File exlpath = new File("D:\\jitu\\migration\\selenium\\DataRead\\src\\com\\data\\util\\TestData.xlsx");

		FileInputStream fis = new FileInputStream(exlpath);

		XSSFWorkbook workbok = new XSSFWorkbook(fis);    //load full workbook.
		
		//HSSFWorkbook worok = new HSSFWorkbook(fis); it will use when your excel format is .xls    
		
	    XSSFSheet sheet1=	workbok.getSheetAt(0);    // read first sheet from workbook.
	    
	    String data0 = sheet1.getRow(2).getCell(1).getStringCellValue();
	    
	    System.out.println("Data from excel is: " +data0);
	    
	    workbok.close();
	 
	}

}
