package sorting;

import java.util.Arrays;

public class selectionsort {
public static void main(String [] args) {
	int [] arr = {4,5,1,2,3};
	selection(arr);
	System.out.println(Arrays.toString(arr));
	}
static void selection(int [] arr) {
	for(int i = 0;i<arr.length;i++) {
		// run the loop for the remainig arrays get the max and put it to the last index
		int last = arr.length-i-1;
		int maxIndex=getmaxIndex(arr,0,last);
		swap(arr,maxIndex,last);
		
	}
}
	static void swap(int [] arr,int first ,int second) {
		int temp = arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
		
	}
	 static int getmaxIndex(int [] arr,int start,int end) {
		 int max=start;
		 for(int i = start;i<=end;i++) {
			 if(arr[max]<arr[i]) {
			 max = i;
		 }
		 }
	 return max;
		 }
	 }


