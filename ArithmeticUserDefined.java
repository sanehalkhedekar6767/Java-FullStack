import java.util.Scanner;
public class ArithmeticUserDefined {

	public static void main(String[] args) {
		  Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter numbers");

		    int a = myObj.nextInt();  // Read user input
		    System.out.println("a= " + a);
		    int b = myObj.nextInt();  // Read user input
		    System.out.println("b= " + b);
		    
		    System.out.println("Addition : " +(a+b));
		    System.out.println("Subtration : " +(a-b));
		    System.out.println("Multiplication : " +(a*b));
		    System.out.println("Division : " +(a/b));
		    System.out.println("Modulus : " +(a%b));
	}

} 
