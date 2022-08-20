import java.util.Scanner;
public class calculator {
public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
	// take the input till user doesnot press x and x key
	int ans = 0;
	// infinity while loop
	while(true) {
		//enter two num
		System.out.print("enter the operator");
		char op = in.next().trim().charAt(0);
		if (op=='+'||op=='-'|| op=='*'||op=='/'||op=='%') {
			// enter the two numb
			System.out.println("enters the two number");
			int num1= in.nextInt();
			int num2 = in.nextInt();
			if(op=='+') {
				ans = num1+num2;
			}
				if (op=='-') {
					ans = num1- num2;
				}
					if(op=='*') {
						ans = num1*num2;
					}
						if (op=='/') {
							if(num2!=0) {
								ans = num1/num2;
							}
								if(op=='%') {
									ans = num1%num2;
								}
						}else if( op=='x'||op== 'X') {
							break;
						}else {
							System.out.println("invalid operation!!");
						}
	             	}
							System.out.println(ans);
								
							
						
					
				
			}
		}
			
	}
	
	
	
	
	
	
	
	


