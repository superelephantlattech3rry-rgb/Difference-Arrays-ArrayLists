import java.util.Scanner;

public class ArrayFactory {

    // Computes the sum of an array except for the largest value
    public static int sumWithoutLargest(int[] arr) {

        int sum = 0;
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return sum - largest;
    }

    // Searches for the largest and smallest elements and swaps them
    public static void swapLargestSmallest(int[] arr) {

        int largestIndex = 0;
        int smallestIndex = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[largestIndex]) {
                largestIndex = i;
            }

            if (arr[i] < arr[smallestIndex]) {
                smallestIndex = i;
            }
        }

        int temp = arr[largestIndex];
        arr[largestIndex] = arr[smallestIndex];
        arr[smallestIndex] = temp;
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the array values:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        int sum = sumWithoutLargest(numbers);
        System.out.println("\nSum without largest: " + sum);
        System.out.print("Resulting array: ");
        printArray(numbers);

        swapLargestSmallest(numbers);
        System.out.println("\nAfter swapping largest and smallest:");
        System.out.print("Resulting array: ");
        printArray(numbers);
    }
}
