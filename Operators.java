import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Marks are: ");

		int Marks = sc.nextInt();
		
		 if(Marks >= 35) {
			 System.out.println("Student is pass  :)  ");
			 
		 }else {
			 System.out.println("Student is Fail  :(   ");
		 }
	}

}
