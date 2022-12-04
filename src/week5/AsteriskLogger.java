package week5;

public class AsteriskLogger implements Logger {
	public void log(String str) {

		for (int i =0; i<str.length()+6;i++) {
			
			System.out.print("*");
		}
		
		System.out.println("\n***"+ str + "***");
		
		for (int i =0; i<str.length()+6;i++) {
			
			System.out.print("*");
		}
		System.out.print("\n\n");
	}


	public void error(String str) {
		for (int i =0; i<str.length()+13;i++) {
			
			System.out.print("*");
		}
		
		System.out.println("\n***Error: "+ str + "***");
		
		for (int i =0; i<str.length()+13;i++) {
			
			System.out.print("*");
		}
		
		
	}

}
