package net.ultra03.Repo.Repository;

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
