import java.util.Scanner;

public class UnderstandingIFProgram {
	private char input;
	private boolean male;
	
	public UnderstandingIFProgram() {
		// TODO Auto-generated constructor stub
	}
	
	public void question() {
		Scanner k = new Scanner(System.in);
		
		System.out.print("Are you (M)ale or (F)emale? ...");
		char input = k.nextLine().charAt(0);
		
		male = (input == 'M') || (input == 'm');
			            
			if (!male)
			   System.out.println("OK, now I know that you are a female.");
			else
			   System.out.println("OK, now I know that you are a male.");
	}
}
