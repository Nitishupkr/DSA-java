
public class shadowing {
public static void main(String []args) {
	int a = 10;
	int b = 20;
	String name= "nitish";
	{
		a= 100;
		int c= 30;
		name = "rahul";
		System.out.println(name);
	}
	int c = 1000;
	System.out.println(c);
		System.out.println(name);
				
	}
	
}

