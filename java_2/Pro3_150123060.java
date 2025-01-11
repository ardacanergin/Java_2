// Purpose of this program is to print patterns using mix of numbers and characters. Size of the pattern is decided by the user.
import java.util.Scanner;

public class Pro3_150123060 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Num-Char printer program");
		for (int j=0;j<2;j++) { //introduction to the program
			for (int i =0;i<=40;i++ ) {
			System.out.print("-");	
			}
			System.out.println();
		}
		while (true) { //pattern can be recreated again and again without leaving the program.
			System.out.print("Enter a size for pattern: ");
			int size = input.nextInt(); //asking for size as an input
			if (size<=0) {
				System.out.println("Please enter a valid size.");
				System.out.println();
				continue;
			}
			//nested loops for printing the pattern
			for (int i =1; i<size;i++) {
				for(int k=i;k<=size;k++) { //spaces in decreasing left triangle
					System.out.print("  ");
				}
				for (int k=1;k<=i;k++) {
					System.out.print(k+" "); //numbers in right triangle 
				}
				for (int k=i;k>1;k--) {	
					System.out.print((char)('A'-2+k)+ " ");//increasing left triangle: characters printed based on ascii table				
				}
					System.out.println();
			}
			int n= size;
			for(int i =1;i<=size;i++) {
				for(int k=1;k<=i;k++) { //increasing left triangle for spaces
					System.out.print("  ");
				}
				for(int k=1;k<=n;k++) {
					System.out.print(k+" "); //numbers in right triangle
				}
				for(int k=n-1;k>=1;k--) {    //characters in decreasing left triangle
					System.out.print((char)('A'-1+k)+ " ");
				}
				System.out.println();
				n--;
			}
			System.out.print("Would you like to continue to print? Yes(Y) No(N)" );
			String desicion = input.next(); //Decision left to user
			desicion=desicion.toLowerCase();	//to make decision case insensitive
			char decision1 = desicion.charAt(0);
			if (decision1 == 'y') { // if user want to continue iterates the loop body again
				continue;
			} else if (decision1 =='n'){
				System.out.println("Program ends. Good bye.");
				System.exit(0); //exits program if user wants to leave
			}
		}
	}
}