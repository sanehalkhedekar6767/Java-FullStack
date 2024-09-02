//Swapping Numbers
import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.println("Before swapping \na: "+a+"\nb: " +b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping \na: "+a+"\nb: " +b);

		
	}

}
