import java.util.Scanner;
public class RetrieveSubstring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String message = sc.nextLine();
		
		for(int i = 0; i<=message.length();i++) {
			int j = 0;
			System.out.println(message.substring(j,i));
		}
		
	}

}
