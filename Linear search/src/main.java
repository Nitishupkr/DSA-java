
public class main {
public static void main(String [] args) {
	int [] nums = {23,4,54,67,78,98};
 int target =66;
	int ans = linearSearch(nums,target);
      System.out.println(ans);
}
    
//return the index if item found
// if not found the return-1
static  int linearSearch(int []arr, int target) {
	if( arr.length==0) {
	
		return-1;
		
}
	// run a for loop
	for(int index=0;index<arr.length;index++) { 
		// check for evry element which target =lengthh
		
		int element = arr[index];
		if(element == target) {
			return index;
		}
	} // if none of the above condition execute the print this condition
	return-1;
}
}
