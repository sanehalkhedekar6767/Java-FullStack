//List of numbers
import java.util.Scanner;

public class ListOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		System.out.println("Number is: "+num);
		for(int i=0; i<5; i++) {
			num++;
			System.out.println(num);
		}
		
		
		
	}

}
