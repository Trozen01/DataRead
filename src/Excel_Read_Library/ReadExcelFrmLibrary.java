package Excel_Read_Library;

public class ReadExcelFrmLibrary {

	public static void main(String[] args) {
		
      ExcelDataConfig exlbr = new ExcelDataConfig("D:\\jitu\\migration\\selenium\\DataRead\\src\\com\\data\\util\\TestData.xlsx");		

      System.out.println(exlbr.getData(0, 1, 1));
	}

}
