public class GuidedTask1 {
    public static void main(String[] args) {
        int[] grades = {85, 90, 78, 92, 88};
        int sum = 0;

        for (int grade : grades) sum += grade;

        System.out.println("Average grade: " + sum / grades.length);
    }
}