package primitives;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float num1 = input.nextInt();
		float num2 = input.nextInt();
		
		float sum = num1 + num2;
		System.out.println("Sum="+sum);
	}
}
