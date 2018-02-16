package net.ultra03.util;

import java.util.Scanner;

public class ScannerUtil {

	public void nameScanner() {

		System.out.print("Enter a string: ");
		Scanner reader = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		String stringInput = reader.nextLine();
		
		reader.close();
			
	}
	
	
}
