import java.util.Arrays;

public class SelfPractice2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6};

        int[] uniqueArray = removeDuplicates(arr);

        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        if (n == 0 || n == 1) {
            return arr;
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1]; 

        return Arrays.copyOf(temp, j); 
    }
}
