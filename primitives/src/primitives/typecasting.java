package primitives;
import java.util.Scanner;

public class typecasting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//float num = input.nextFloat();
	//	int num = input.nextInt();
		//System.out.println(num);
	//	TypeCasting
			int num = (int)(55.55f);
			System.out.println(num);
			// automatic type promotion in expression
		//	int a = 254;
			//byte b = (byte)(a);254%253=1
			
	//		byte a = 40;
		//	byte b = 50;
			//byte c = 100;
		//	int d = a*b/c;	
			//System.out.println(d);
		//	byte = 40;
			//int number = 'A';
		//	System.out.println(5*5.5);
			byte b = 54;
			char c = 'a';
			short s = 5585;
			int i = 5555;
			float f = 5.55f;
			double d = 0.252;
			double result = (f*b)+(i/c)+(d-s);
			// float + int - double = double
			System.out.println((f*b)+" "+(i/c)+" "+(d-s));
			System.out.println(result);
					
			
			}

}
