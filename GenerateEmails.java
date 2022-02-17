package assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*** COSC 1020 –Fall2021
 * Assignment#1
 * uses the template and customer files to make an personal email response to a customer
 * @author Claire Kraft
 * */

public class GenerateEmails {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File ("customers.txt");
		Scanner s = new Scanner(f);
		int x = 0;
		
		while(s.hasNextLine()) {
			//System.out.println(s.nextLine());
			
			
			while(s.hasNext()) {
				String id = s.next();
				String name = s.next();
				String points = s.next();
				String purchase = s.next();
				purchase = purchase.replaceAll("2020", "2021");
				
				/*
				System.out.println(id);
				System.out.println(name);
				System.out.println(points);
				System.out.println(purchase);*/
				
				File f1 = new File ("template.txt");
				Scanner s1 = new Scanner(f1);
				
				String line1 = s1.nextLine();
				String line2 = s1.nextLine();
				String line3 = s1.nextLine();
				String line4 = s1.nextLine();
				String line5 = s1.nextLine();
				String line6 = s1.nextLine();
				String line7 = s1.nextLine();
				
				line1 = line1.replaceAll("<<CustID>>", id);
				line2 = line2.replaceAll("<<Name>>", name);
				line4 = line4.replaceAll("<<Points>>", points);
				line4 = line4.replaceAll("<<ExpiryDate>>", purchase);
				
				//System.out.print(line4);
				
				x = x + 1;
				String g = String.format("%02d", x);
				//FileWriter fw = new FileWriter("Email.txt");
				PrintWriter pw = new PrintWriter("Email"+ g +".txt");
		
				 
				 pw.println(line1);
				 pw.println(line2);
				 pw.println(line3);
				 pw.println(line4);
				 pw.println(line5);
				 pw.println(line6);
				 pw.println(line7);
				 
				 
				 pw.close();
				
			}
		}
		
	
	}
	

}
