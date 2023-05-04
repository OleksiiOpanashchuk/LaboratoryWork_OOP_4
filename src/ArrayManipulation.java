public class ArrayManipulation {
    public static void main(String[] args) {
        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();

        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();

        i = 1;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i += 2;
        }
        System.out.println();

        for (int j = 0; j < numbers.length; j += 2) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();

        for (int k = numbers.length - 1; k >= 0; k--) {
            System.out.print(numbers[k] + " ");
        }
        System.out.println();
    }
}
