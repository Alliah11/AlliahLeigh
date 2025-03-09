import java.util.Arrays;

public class SelfPractice1{
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};

        int[] mergedArray = mergeArrays(arr1, arr2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] mergedArray = new int[length1 + length2];

        System.arraycopy(arr1, 0, mergedArray, 0, length1);
        System.arraycopy(arr2, 0, mergedArray, length1, length2);
        return mergedArray;
    }
}
