package arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Arraylstexamplr {
public static void main(String [] args) {
	Scanner in = new Scanner(System.in);
	
	ArrayList<Integer> list = new ArrayList<>(5);
//list.add(88);
//list.add(66);
//list.add(6554);
//list.add(987);
//list.add(898);
//System.out.println(list);
//System.out.println(list.contains(6798));
//list.set(0,88);
//list.remove(2);
//input
for(int i = 0;i<5;i++) {
list.add(in.nextInt());
}
for(int i= 0;i <5;i++) { // list syntax will not work here
System.out.println(list.get(i));
}
System.out.println(list);
}}
