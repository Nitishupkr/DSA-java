package SearchinString;

public class FIndme {
public static void main(String [] args) {
int [] arr = {22,33,4,57,98};
System.out.println(min(arr));

}
static int  min(int [] arr) {
	int ans = arr[0];
	for(int i = 1;i<arr.length;i++) {
		if (arr[i]<ans) {
			ans = arr[i];
			
		}
	}
	return ans;	
}
}