package arrays;

public class evennumb {
public static void main(String [] args) {
	int [] num = {22,44,55,64};
System.out.println(findNumbers(num));
	//System.out.println(digits(876544));
}
static int findNumbers(int [] nums) {
	int count = 0;
	for( int num:nums) {
		if(even(num)) {
			count++;
		}
	}
	return count;
	
}
// function to check whether it contains even digit or not
static boolean even(int num) {
	int numberOfDigits=digits(num);
	//if(numberOfDigits %2==0) {
		//return true;
	return numberOfDigits%2==0;
	}

static int digits (int num) {
	int count =0;
	while(num>0) {
		count++;
		num = num/10;
	}
	return count;

}
}
