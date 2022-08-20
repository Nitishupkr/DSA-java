import java.util.Scanner;
public class Nestedswtich {
	 /**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
				 int empID= in.nextInt();
				 String department = in.next();
				 switch(empID) {
				 case 1:
					 System.out.println("Nitish tiwari");
					 break;
				 case 2:
					 System.out.println("nilam tiwari");
					 break;
					 default:
						 System.out.println("enter correct empID");
				 }
				 }
	 }