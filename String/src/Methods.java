import java.util.Arrays;
public class Methods {
public static void main (String []args) {
	String  name = "Nitish Tiwari";
	System.out.println(Arrays.toString(name.toCharArray()));
	System.out.println(name.toUpperCase());
	System.out.println(name.trim());
	System.out.println(name.hashCode());
	System.out.println(name.indexOf("a"));
	System.out.println( Arrays.toString(name.split( "")));
}
}
