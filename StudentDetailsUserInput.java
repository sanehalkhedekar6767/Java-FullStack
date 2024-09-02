
//Student Details using Scanner
import java.util.Scanner;
public class StudentDetailsUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name: ");
		String name = sc.next();
		
		System.out.println("Phone number: ");
		long phno = sc.nextLong();
		
		System.out.println("Adhaar number: ");
		long adhaar = sc.nextLong();

		System.out.println("Semester: ");
		int sem = sc.nextInt();

		System.out.println("Branch: ");
		String branch = sc.next();
		
		System.out.println("College: ");
		String college = sc.next();
		System.out.println("Student Details are---->");
		System.out.println("Name: "+name+ "\nPhone number: "+phno+ "\nAdhaar number: "+adhaar+ "\nSemester: "+sem+ "\nCollege: "+college);

	}

}
