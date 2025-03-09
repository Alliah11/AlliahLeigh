public class GuidedTask2 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 50, 60};
        int target = 30;
        for (int num : arr) {
            if (num == target) {
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not Found");
    }
}