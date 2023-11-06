import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // int[] numbers = new int[5];
        // numbers[0] = 1;
        // numbers[1] = 2;
        // numbers[2] = 3;

        int[] numbers = { 2, 3, 4, 1, 5 };
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
