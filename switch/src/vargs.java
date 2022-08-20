import java.util.Arrays;
import java.util.Scanner;
public class vargs {
public static void  main(String [] args) {
	fun();	
}

static void fun(int...v) {
	System.out.println(Arrays.toString(v));
}
}
