package arrays;
import java.util.Arrays;
public class Searchin2Darray {
	public static void main(String [] args) {
		
	
		int [][] arr = {
			{33,54,67,87,63},
			{59,76,72,24},
			{62,90,60,49},
	};
	int target = 88;
	int [] ans = search( arr,target);
	System.out.println(Arrays.toString(ans));
	}

	static int[] search(int [] []arr,int target) {
		for( int row =0;row <arr.length;row++) {
			for( int col=0;col<arr[row].length;col++) {
				if(arr[row][col] == target) {
					return new int [] {row,col};
				}								
		}}
		return new int [] {-1,-1};
	}

}



