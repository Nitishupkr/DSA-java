import java.util.Scanner;
public class switc {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String fruit = in.next();
	switch(fruit) {
	case"apple":
	System.out.println(" it is sweet fruit");
	break;
	case"mango":
		System.out.println("it is king of fruit");
		break;
	case"grapes":
		System.out.println("it is liqiud fruit");
		break;
		default:
			System.out.println("please enter the valid fruit");
	
	}
}
}