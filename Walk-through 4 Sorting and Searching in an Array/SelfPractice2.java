public class SelfPractice2 {
    public static void main(String[] args) {
        String[] cars = {"Ferrari", "Nissan", "Toyota", "Lamborghini", "Ford"};

        for (int i = 1; i < cars.length; i++) {
            String currentCar = cars[i];
            int position = i - 1;

            while (position >= 0 && cars[position].compareTo(currentCar) > 0) {
                cars[position + 1] = cars[position];
                position--;
            }
            cars[position + 1] = currentCar;
        }
      
        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}