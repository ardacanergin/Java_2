// Purpose of this program is to calculate how many bits are needed to represent an integer in the binary representation.
// Nested while loops have been used for solving problem. First while loop lets user to enter a new integer after end of 
// every calculation. Second while loop used for computing. Diving an integer by 2, until it becomes less than 1
// and keeping the record of each iteration by an additional variable does to job. i variable is incremented in every iteration
// and displayed at the end to show the number of bits needed.
// Arda Can Ergin StudentID:150123060
import java.util.Scanner;

public class Pro1_150123060 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean contprogram = true; //boolean countprogram decleared. I could have just use while(true) but I thought 
		double n = 0;				//it will be easier to debug and test the code.
		int i = 0;
		while (contprogram) {
			i =0; // set to zero at the start of every iteration so that it wouldn't mixed up with the previous integer's bit represent value
			System.out.print("\nEnter an integer value: ");
			int integer = input.nextInt();
			if (integer < 0) { //error code for integers less than zero
				System.out.println("\nError: Illegal input pls enter a positive integer.");
				continue;
			}
			if (integer == 0) { //ending the program. Break can be used to get out of the loop and the program after the loop.
				System.out.println("\nProgram ends. Start again to continue to compute.");
				System.exit(0);
			}
			n = integer;
			while (!(n<1)) { // unless integer less than one continue to iterate the loop body
				n = n / 2; // compute
				i++;       // keeping the record of how many times the integer divided by two. It will be the value of number of bits needed to represent the integer at the end 
			}
			System.out.println("\nThe number of bits needed to represent the integer is: " + i);

		}
	}
}
