
public class Pattern {
	public static void main(String [] args) {
	pattern31(6);
	
	
	} 
//	static void pattern1(int n ) {
//		for(int row =1;row<=n;row++) {
//			// for every row run the col
//			for(int col =1;col<=row;col++) {
//			
//				System.out.print("* ");
//			}
//			// after printing one row, we need to add new line
//			System.out.println();
//				
//			
//		}
//		
//	}
//
//

	//}
	static void pattern2(int n ) {
		for( int row =1;row<=n;row++) {
			
			// for every row run the col
			for(int col =1;col<=n-row+1;col++) {
				
			
				System.out.print("* ");
			}
			// after printing one row, we need to add new line
			System.out.println();
			
		}
		
	}

static void pattern3(int n ) {
	for( int row =1;row<=n*2;row++) {
		
		// for every row run the col
		for(int col =1;col<=n*2-row+1;col++) {
			
		
			System.out.print("* ");
		}
		// after printing one row, we need to add new line
		System.out.println();
		
	
	}}
	


static void pattern5(int n) {
    for (int row = 0; row < 2 * n; row++) {
        int totalColsInRow = row > n ? 2 * n - row: row;
        for (int col = 0; col < totalColsInRow; col++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

static void pattern35(int n) {
	for(int row =0;row<2*n;row++) {
		int colinrow=row>n?2*n-row:row;
		int totalspace= n -colinrow;
		for(int s =0;s<totalspace;s++) {
			System.out.print(" ");
			
		}
		for(int col =0;col<colinrow;col++) {
			System.out.print("* ");
		}
		System.out.println();
	
	
	
	
	

	}
}


static void pattern30(int n) {
    for (int row = 1; row <= 2*n; row++) {
int c = row > n ? 2 * n - row: row;
        for (int space = 0; space < 2*n-c; space++) {
            System.out.print("  ");
        }

        for (int col = c; col >= 1; col--) {
            System.out.print(col + " ");
        }
        for (int col = 2; col <= c; col++) {
            System.out.print(col + " ");
        }

        System.out.println();
    }
}

 static void pattern31(int n) {
int original = n;
 n =2*n;
for( int row = 0;row<=n;row++) {
	for(int col =0;col<=n;col++) {
		int index = original-Math.min(Math.min(row, col),Math.min(n-row,n-col));
	
	System.out.print(index +" ");
}
	System.out.println();
}
 }
}
 
