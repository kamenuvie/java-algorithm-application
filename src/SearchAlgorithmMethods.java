import java.util.Arrays;
import java.util.Scanner;

public class SearchAlgorithmMethods {
    public static void linearSearch() {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arr_size = Input.nextInt();
        System.out.println("Enter the elements in the array:");
       int[]  Array = new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            Array[i] = Input.nextInt();
            System.out.println(Arrays.toString(Array));

        }
        System.out.print("Enter the target element to find :");

        long startTime = System.nanoTime();

        int target= Input.nextInt();
        for (int i = 0; i < arr_size; i++) {

            if (Array[i] == target) {
                long endTime = System.nanoTime();
                long duration = endTime - startTime;
                for ( i = 0; i < Array.length; i++) {
                    if (Array[i] == target) {
                        System.out.println("Target key :" + " " + target + " " + "found at index" + " " + i + " " + " ✅");
                        System.out.println("Time taken: " + duration +" "+ "nanoseconds \n");


                    } else {
                        System.out.println("Target key :" + " " + target + " not found at index" + " " + i + " " + "\uD83D\uDEAB ");


                    }

                }
                return;
            }
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Target key: " + target + " not found \uD83D\uDEAB");
        System.out.println("Time taken: " + duration + " nanoseconds\n");
    }






        public static void binarySearch() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the array size: ");
            int arrSize = input.nextInt();

            int[] array = new int[arrSize];
            System.out.println("Enter the elements in the array:");
            for (int i = 0; i < arrSize; i++) {
                array[i] = input.nextInt();
                System.out.println( Arrays.toString(array));
            }

            // Ensure the array is sorted for binary search
            Arrays.sort(array);
            System.out.println("Sorted array: " + Arrays.toString(array));

            System.out.print("Enter the target number: \n");
            int target = input.nextInt();

            long startTime = System.nanoTime();
            int index = performBinarySearch(array, target);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            if (index != -1) {
                System.out.println("Key: " + target + " found at index " + index + " ✅");
            } else {
                System.out.println("Key: " + target + " not found in the array.");
            }
            System.out.println("Time taken: " + duration + " nanoseconds\n");
        }

        public static int performBinarySearch(int[] array, int target) {
            int low = 0;
            int high = array.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (array[mid] < target) {
                    low = mid + 1;
                } else if (array[mid] > target) {
                    high = mid - 1;
                } else {
                    return mid; // Target found
                }
            }
            return -1; // Target not found
        }
    }



