import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};

        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        numbers = sortArray(numbers);

        System.out.println("\nSorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
