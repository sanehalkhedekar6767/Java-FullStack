import java.util.Scanner;
public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		
		int num = sc.nextInt();
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact *= i;
		}
		System.out.print("Factorial of "+num+" is: "+ fact);

	}

}
