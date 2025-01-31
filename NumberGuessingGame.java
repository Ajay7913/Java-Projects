import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        do {
            System.out.print("Guess the number (1-100): ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < number) {
                System.out.println("Too low, try again.");
            } else if (guess > number) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            }
        } while (guess != number);
    }
}
