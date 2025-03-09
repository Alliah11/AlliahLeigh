import java.util.Random;
import java.util.Scanner;

public class SelfPractice1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int number = rand.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Guess the number (1-100): ");
            guess = scanner.nextInt();
        } while (guess != number);

        System.out.println("Nice one! You guessed the number.");
        scanner.close();
    }
}