//Importing the Scanner method to this class.
import java.util.Scanner;
//Creating the class.
public class Exercise1 {
	//Creating the main method for this class.
	public static void main(String[] args) {
		//initialize long type of objects.
		long binary1, binary2; 
		//initialize i as a integer, will be used to the index of sum array.
		int i = 0, 
		//initialize an object for remainder.
		remainder = 0; 
		//initialize an array and giving it length of 20.
		int[] sum = new int[20]; 
		
		//bring in Scanner method.
		Scanner in = new Scanner(System.in); 
		//asking user to put the first binary number.
		System.out.print("Input first binary number: ");
		//bring in the scanner method to scan the keyboard.
		binary1 = in.nextLong(); 
		//asking user to put the second binary number.
		System.out.print("Input second binary number: "); 
		//bring in the scanner method to scan the keyboard.
		binary2 = in.nextLong();
		
		//when the "binary1" doesn't equal to 0 OR "binary2" doesn't equal to 0. this while loop will keep on running.
		while (binary1 != 0 || binary2 != 0) { 
			/* Assign value to sum's each index. The value will be ("binary1" % 10 + "binary2" % 10 + remainder) % 2 and
			   get rid of decimal number. Meaning return the integer.
			*/
			sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2); 
			remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2); 
			binary1 = binary1 / 10; binary2 = binary2 / 10; 
			} 
			if (remainder != 0) { 
			sum[i++] = remainder; 
			} 
			--i; 
			System.out.print("Sum of two binary numbers: "); 
			while (i >= 0) { 
			System.out.print(sum[i--]); 
			} System.out.print("\n"); 

	
	}
}
