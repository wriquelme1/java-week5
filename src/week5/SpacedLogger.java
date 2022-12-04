package week5;


public class SpacedLogger implements Logger{
	
	public  void log(String str) {
		
		
		char[] arr = new char[str.length()];
		
		for ( int i = 0; i < str.length(); i++ ) {
		    arr[i] = str.charAt(i);
		    System.out.print(arr[i]+" ");
		}
		
		System.out.print("\n\n");
		}

	public  void error(String str) {
		
		char[] arr = new char[str.length()];
		
		System.out.print("ERROR: ");
		
		for ( int i = 0; i < str.length(); i++ ) {
		    arr[i] = str.charAt(i);
		    System.out.print(arr[i]+" ");
		}
		
		System.out.print("\n\n");
		}

}
