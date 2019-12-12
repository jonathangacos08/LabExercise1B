import java.util.Scanner;
public class LabExer1b{
	public static void main (String[]args){
		Scanner sx = new Scanner (System.in);
		System.out.print("Enter a interger ");
		int num = sx.nextInt();
			
		show10(num);
		show100(num);
		show1000(num);
	}
	public static void show10 (int x){
		System.out.println(x + 10);	
	}
	public static void show100 (int x){
		System.out.println(x + 100);
	}
	public static void show1000 (int x){
		System.out.println(x + 1000);
	}
}