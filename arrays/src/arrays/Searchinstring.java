package arrays;

public class Searchinstring {
public static void main(String []args ) {
	int [] arr= {22,33,43,567,987};
	int target =44;
	System.out.println(linearSearch(arr,target,1,4));
}
static int linearSearch(int [] arr,int target,int start,int end) {
	
	if(arr.length== 0) {
		return-1;
		
	}
	
	
	//run for loop
	for(int index = start; index <=end;index++) {
		int element= arr[index];
		if(target==element) {
			return index;
		}
	}
	return -1;	
	}
	
}

