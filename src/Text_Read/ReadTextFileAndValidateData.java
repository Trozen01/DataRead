package Text_Read;


import java.io.FileReader;
import java.io.IOException;

import java.util.Hashtable;
import java.util.Scanner;

public class ReadTextFileAndValidateData {

	public static void main(String[] args) throws IOException {

		// logic for file reading
		FileReader fd = new FileReader("D:\\jitu\\migration\\selenium\\DataRead\\src\\com\\data\\util\\ALLTXN.TXT");

		Scanner scanner = new Scanner(fd);
        Hashtable data = new Hashtable();

		// reading file line by line using Scanner in Java
		System.out.println("Reading file line by line in Java using Scanner");

		Boolean passedLine = false;
		Boolean status = false;

		int lineNumber = 0;
		while (scanner.hasNextLine()) {
			
			//System.out.println(scanner.nextLine());
			String name1=scanner.nextLine();
			System.out.println(name1);
			
			String currentLine;
			String msf;
			String msfgst;
			String rrn;
			String mid;
			String tid;
			String tpc;
			String tpcgst;
			String cardtype;
			String scheme;
			String txnamt;
			String netamt;
			String cgst;
			String sgst;
			String igst;
			String salerefund;
			

			if (lineNumber > 5 && lineNumber < 70) {
			
				/*// Do task
				try {
					name1 = scanner.nextLine();
					
					
				} catch (Exception e) {

				}
*/
				try {

					if (!name1.isEmpty() && !name1.contains("TOTAL")&& !name1.contains("---------")) {

						rrn = name1.substring(447, 459).trim();
						msf = name1.substring(200, 214).trim();
						msfgst = name1.substring(216, 226).trim();
						mid = name1.substring(6, 21).trim();
						tid = name1.substring(22, 30).trim();
						txnamt = name1.substring(181, 198).trim();
						tpc = name1.substring(228, 239).trim();
						tpcgst = name1.substring(241, 252).trim();
						cardtype = name1.substring(544, 554).trim();
						scheme = name1.substring(563, 573).trim();
						salerefund = name1.substring(446, 466).trim();
						netamt = name1.substring(322, 339).trim();
						cgst = name1.substring(280, 291).trim();
						sgst = name1.substring(293, 304).trim();
						igst = name1.substring(267, 278).trim();

						if (!rrn.isEmpty()) {
							data.put("rrn", rrn);
							data.put("msf", msf);
							data.put("msfgst", msfgst);
							data.put("mid", mid);
							data.put("tid", tid);
							data.put("txnamt", txnamt);
							data.put("tpc", tpc);
							data.put("tpcgst", tpcgst);
							data.put("cardtype", cardtype);
							data.put("scheme", scheme);
							data.put("salerefund", salerefund);
							data.put("netamt", netamt);
							data.put("cgst", cgst);
							data.put("sgst", sgst);
							data.put("igst", igst);
							// Reporter.reportStep("RRN from All Transaction Report is"+rrn);

							System.out.println("rrn is " + rrn);
							System.out.println("msf is " + msf);
							System.out.println("msfgst is " + msfgst);
							System.out.println("tpc is " + tpc);
							System.out.println("tpcgst is " + tpcgst);
							System.out.println("cardtype is " + cardtype);
							System.out.println("scheme is " + scheme);
							System.out.println("txnamt is " + txnamt);
							System.out.println("netamt is " + netamt);
							System.out.println("cgst is " + cgst);
							System.out.println("sgst is " + sgst);
							System.out.println("igst is " + igst);

						}

					}

				} catch (Exception e) {

				}

			}

			lineNumber++;

		}

		scanner.close();

	}
}
