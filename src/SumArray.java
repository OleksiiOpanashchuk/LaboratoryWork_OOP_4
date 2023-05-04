public class SumArray {
    public static void main(String[] args) {

        double[] arr = {11, 27, 34, 41, 8};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Сума елементів масиву: " + sum);
    }
}
