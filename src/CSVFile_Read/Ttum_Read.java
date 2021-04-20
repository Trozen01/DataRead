package CSVFile_Read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ttum_Read {

	public static void main(String[] args) throws IOException {
        String csvFile = "D:\\jitu\\migration\\selenium\\DataRead\\src\\com\\data\\util\\titum.csv";
		BufferedReader br = null;   //Java BufferedReader class is used to read the text from a character-based input stream. It can be used to read data line by line by readLine() method.
		String line = "";
		String cvsSplitBy = ",";

		try {
         br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] TTUM = line.split(cvsSplitBy);

				System.out.println("[MID= " + TTUM[1] + " , Amount="+ TTUM[6] + "]");

			}
		} catch (FileNotFoundException e) {

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
