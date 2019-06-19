import java.util.Scanner;

public class Project6 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		// Create storage for binary number
		String binary;
		
		// Ask for binary number
		System.out.println("Enter a 4-bit binary number");
		Scanner keyboard= new Scanner(System.in);
		binary = keyboard.nextLine();
		
		// Break string to substring
		String b0, b1, b2, b3;
		b0 = binary.substring(0,1);
		b1 = binary.substring(1,2);
		b2 = binary.substring(2,3);
		b3 = binary.substring(3,4);
		
		// convert substring into integer value to use in the equation
		int B0 = Integer.valueOf(b0);
		int B1 = Integer.valueOf(b1);
		int B2 = Integer.valueOf(b2);
		int B3 = Integer.valueOf(b3);
		
		System.out.println(B0);	
		// add equation 
		int decimal = 8*B0 + 4*B1 + 2*B2 + B3;
		System.out.println("Then its decimal value is " + decimal);	
		
		
	}
}
