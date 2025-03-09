import java.util.Scanner;

public class SelfPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter something (type 'exit' to quit): ");
            input = scanner.nextLine();
        } while (!input.equals("exit"));

        System.out.println("Exited.");
        scanner.close();
    }
}