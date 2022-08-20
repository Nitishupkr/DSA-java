import java.util.Arrays;
import java.util.Scanner;
public class changevalue {
	public static void main(String []args) {
		// create an array
	int []arr = {1,2,3,45,6};
	change(arr);
	System.out.println(Arrays.toString(arr));
	
	}
	static void change(int[]num) {
		num[0]= 99;
	}

}
