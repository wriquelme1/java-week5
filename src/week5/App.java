package week5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner palabra = new Scanner (System.in);
		
		
		System.out.println("Please enter a word:");
		String str = palabra.nextLine();
		
		SpacedLogger spacedLogger = new SpacedLogger();
		spacedLogger.log(str);		
		spacedLogger.error(str);
		
		AsteriskLogger asteriskLogger = new AsteriskLogger();
		asteriskLogger.log(str);		
		asteriskLogger.error(str);
		
		
	}

}
