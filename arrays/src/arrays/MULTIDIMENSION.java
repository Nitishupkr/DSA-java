package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MULTIDIMENSION {

	public static void main(String [] srgs) {
		Scanner in = new Scanner(System.in);
		  int[][] arr = new int[3][3];
	        System.out.println(arr.length); // no of rows
	        // input
	
	       
	
	for(int row =0;row<arr.length;row++) {
	//for each coloumn in every row
	for( int col =0;col<arr[row].length;col++) {
		arr[row][col]=in.nextInt();
		
	}
	
}
	for(int row = 0;row<arr.length;row++) {
		//for each coloumn in evry row
		for(int col = 0;col<arr[row].length;col++) {
			System.out.println(arr[row][col] +" ");
		}
		System.out.println();
	}
	for(int row= 0;row<arr.length;row++) {
		System.out.println(Arrays.toString(arr[row]));
	}
}
}