public class ArrayNonPairs{
    public static void main(String[] args) {
        int[] numbers = new int[50];

        for (int i = 0; i < 50; i++) {
            numbers[i] = i * -1;
        }


        for (int i = 1; i < 50; i++) {
            System.out.println(numbers[i]);
        }
    }
}