package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RearExcelSetOfData {
	
	public static void main(String[] args) throws Exception {
		
		File exlpath = new File("D:\\jitu\\migration\\selenium\\DataRead\\src\\com\\data\\util\\TestData.xlsx");

		FileInputStream fis = new FileInputStream(exlpath);

		XSSFWorkbook workbok = new XSSFWorkbook(fis);    //load full workbook.
		
		//HSSFWorkbook worok = new HSSFWorkbook(fis); it will use when your excel format is .xls    
		
	    XSSFSheet sheet1=	workbok.getSheetAt(0);    // read first sheet from workbook.
	    
	    int Rowcount = sheet1.getLastRowNum();
	    int a = 2;
	    
	    
	    System.out.println("Total row no is: " +Rowcount);
	   
	    
/*	    for (int i = 1; i <= Rowcount; i++)
	    {
	    
	    for(int j= 0; j<a;j++){
	    	
	    	if( j ==0)
	    	{
	    		String  username =sheet1.getRow(i).getCell(j).getStringCellValue();
	    		System.out.println("Username is:-"+username);
	    	}
	    	else
	    	{
	    		String  password =sheet1.getRow(i).getCell(j).getStringCellValue();
	    		System.out.println("Password is:-"+password);
	    	}
	    s
	    	
	  		}
	    System.out.println("------------------------------------------------------------------");
	    } */  
	    
	    for (int i = 1; i <= Rowcount; i++)
	    {
	    	for(int j= 0; j<a;j++){
	    		
	    		String  username =sheet1.getRow(i).getCell(j).getStringCellValue();
	    		System.out.println("value is:-"+username);
	    	}
	    	
	    }
	    
	    
	    workbok.close();

	}

}
