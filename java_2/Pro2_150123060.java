//The purpose of this program is to write a series that starts with 0, 1 and 2 other numbers that come after will be the 
//sin cosine and the tangent values of the previous three numbers such as the 4th element will be sin(0) + cos(1)+tan(2)
//Arda Can Ergin StudentID: 150123060

import java.util.Scanner;

public class Pro2_150123060 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the series: ");
		int length = input.nextInt();
		double sum1=0.0;
		double sum2=1.0;	//declaring 4 variable, we will use one as temporary variable to change value
		double sum3=2.0;
		double sum4;
		System.out.print("" + 0.0 + " " + 1.0 + " " + 2.0 + " "); //first three elements of the series
		for (int i = 4; i <= length; i++) {
			sum4 = Math.sin(sum1)+Math.cos(sum2)+Math.tan(sum3);  //computing the next element 
			System.out.printf("%.2f ",sum4);
			sum1=sum2;
			sum2=sum3; // every element transfers their values to the next variable so that series can go on
			sum3=sum4;
		}
	}
}
