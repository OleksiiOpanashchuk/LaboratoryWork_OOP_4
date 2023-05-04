public class UnpairedElements {
    public static void main(String[] args) {
        int[] arr = { 21, -17, -48, 15, -150, 31 };

        System.out.println("Масив до зміни знаку:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // змінюємо знак непарних елементів
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = -arr[i];
            }
        }

        System.out.println("\nМасив після зміни знаку:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
