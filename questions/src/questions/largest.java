package questions;
import java.util.Scanner;
public class largest {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		// question is find the largest of three num
		int max = a;
		if(b>max) {
			max = b;
		}
		if (c>max) {
			max= c;
		}
		System.out.println(max);
	}

}
