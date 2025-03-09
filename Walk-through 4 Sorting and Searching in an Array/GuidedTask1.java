public class GuidedTask1 {
    public static void main(String[] args) {
        int[] arr = {65, 26, 13, 23, 10};

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int num : arr) System.out.print(num + " ");
    }
}