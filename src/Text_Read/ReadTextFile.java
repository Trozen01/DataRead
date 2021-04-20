package Text_Read;
import java.io.BufferedReader;
import java.io.FileReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReadTextFile {
FileReader fr = null;
BufferedReader br = null;
StringBuffer sb = new StringBuffer();

String readLine;
String filePath;
String line, sbb ; 

public StringBuffer readTextFile(String filePath) throws Exception{
	
	fr = new FileReader(filePath);
	br = new BufferedReader(fr);
	
	while ((readLine = br.readLine())!=null){
		
		line = readLine;
		
		sb.append(line+"\n");
	}
	return sb;
	
}

@Test
public void verifymid() throws Exception{
	
	StringBuffer sbb = readTextFile("D:\\jitu\\migration\\selenium\\DataRead\\src\\com\\data\\util\\ALLTXN.TXT");
	
	System.out.println(sbb);
	
	Assert.assertTrue(sbb.toString().contains("TEST KOTAK AGGRS JITU 13"));
	System.out.println("Validation complect for text file....");
	
}
}
