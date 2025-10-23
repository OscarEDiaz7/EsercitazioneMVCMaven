package esercizio01;

import java.util.Scanner;

public class ScannerWrapper {

	private static ScannerWrapper istance;
	private final Scanner scanner;
	
	private ScannerWrapper() {
		this.scanner = new Scanner(System.in);
	}
	
	public static ScannerWrapper getIstance() {
		if (istance == null) {
			istance = new ScannerWrapper();
		}
		return istance;
	}
	
	public String getString(String prompt) {
		System.out.println(prompt + ": ");
		return scanner.nextLine();
		
	}
	
	public int getInt(String prompt) {
		 while (true) {
	            System.out.print(prompt + ": ");
	            try {
	                return Integer.parseInt(scanner.nextLine());
	            } catch (NumberFormatException e) {
	                System.out.println("⚠️ Inserisci un numero valido!");
	            }
	        }
	    }
	
	public void nextVuoto() {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
		
		public void close() {
			scanner.close();
		}
	
}
