import java.util.Scanner;
public class NumberGuessGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jackpot = 1+(int)(100*Math.random()), guess, counter = 1;
		System.out.println("Guess the number");
		guess = sc.nextInt();
		while(guess!=jackpot) {
			if(guess<jackpot) {
				System.out.println("Guess higher");
				
			}
			else {
				System.out.println("Guess lower");

			}
			System.out.println("Guess the number: ");
			guess = sc.nextInt();
			counter+=1;
		}
		System.out.println("Guess Correct");
		System.out.println("You took"+" "+counter+" attempts");

		
		
		
	}

}
