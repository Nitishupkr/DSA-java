import java.util.Scanner;
public class vote {
public static void  main(String [] args) {
	int age;
	Scanner in = new Scanner(System.in); 
	System.out.println(" enter the ege");
  age = in.nextInt();	
   if (age>18) {
	   System.out.println(" he can vote");
   }
   else {
	   System.out.println("can not vote");
   }
	
}
}
