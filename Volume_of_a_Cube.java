// Joe Claborn
package Java.ClassWorkProblems;

import java.util.Scanner;

public class Volume_of_a_Cube {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("What is the length of the cube?");

		int length = input.nextInt();
		
		System.out.println("The area is: " + length*length*length + "\n");
		System.out.printf("The area is %d \n", (int)Math.pow(length,3));
		input.close();
	}
}