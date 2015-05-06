import java.util.Random;

/**
 * Created by Ramzes on 06.05.2015.
 */
public class GuessMain {

	public static void main(String[] args) {

		int toGuess = makeNumber(1, 20);
		int attempt=0;
		System.out.println(toGuess);


		ReadDigit readDigit = new ReadDigit();



		while (true) {
			int userDight = readDigit.read();
			attempt++;
			int res = toGuess - userDight;

			if (res == 0) {
				System.out.println("You Guess, number is " + toGuess + ". Guess from attempt "+attempt);
				break;
			} else if (res > 0) {
				System.out.println("Number is bigger than " + userDight);
			} else {
				System.out.println("Number is less than " + userDight);
			}
		}

	}


	public static int makeNumber(int min, int max) {
		Random rand = new Random();
		return rand.nextInt((max - min) + 1) + min;

	}


}
