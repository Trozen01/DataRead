package Text_Read;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFileSecondway {

	public static void main(String[] args) throws FileNotFoundException {
		//Approach 1 using fileReader bufferReader  
		
				/*FileReader fd = new FileReader("C:\\Jitu\\Work\\SoftwareTesting\\Practical\\DataRead\\src\\com\\data\\util\\ALLTXN.txt");
				BufferedReader br = new BufferedReader(fd);
				String str;
				
				while((str=br.readLine())!=null){
					
					System.out.println(str);
				}
		        br.close(); */
		
		//Approach 2 Using scanner & file
		
				File file = new File("D:\\jitu\\migration\\selenium\\DataRead\\src\\com\\data\\util\\ALLTXN.TXT");
				
				Scanner scr = new Scanner(file);
				
				while(scr.hasNextLine()){
					
					System.out.println(scr.nextLine());
				}
				scr.close();
			}

	}
