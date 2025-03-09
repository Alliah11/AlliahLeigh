import java.util.Scanner;

public class SelfPractice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Entered array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}