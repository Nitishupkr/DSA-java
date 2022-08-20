import java.util.Scanner;
	import java.util.Scanner;

	public class Sum {
	    public static void main(String[] args) {
	    	int ans = sum2();
	        System.out.println(ans);
	        // return type
	        
	    }

	static int sum2() {
		Scanner in = new Scanner(System.in);
		System.out.println("pleae enter the first num");
		int num1= in.nextInt();
		System.out.println("please enter second number");
		int  num2= in.nextInt();
		int sum= num1+num2;
		return sum;
		
		}
	static void sum() {
		Scanner in = new Scanner(System.in);
		int num1= in.nextInt();
		System.out.println("please enter the first numb");
		int num2 = in.nextInt();
		int sum = num1 +num2;
		
		System.out.println("please the second num");
		
		/*
	        return_type name (arguments) {
	            // body
	            return statement;
	        }
	     */
	}
	}
	