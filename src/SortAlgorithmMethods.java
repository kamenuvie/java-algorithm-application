import java.util.Arrays;
import java.util.Scanner;

public class SortAlgorithmMethods {
    /***********---------BUBBLE SORT ALGORITHMS-------------*****************/

    public static void BubbleSort() {
        System.out.print("Enter the array size: ");
        Scanner Input = new Scanner(System.in);
        int arr_size = Input.nextInt();
        System.out.println("Enter the elements in the array:");
        int[] Array = new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            Array[i] = Input.nextInt();
            System.out.println(Arrays.toString(Array));


        }
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        int temp = 0;

        for (int i = 0; i < Array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[j] < Array[i]) {
                    temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;


                }
//                if (minIndex != i) {
//                    temp = Array[i];
//                    Array[i] = Array[minIndex];
//                    Array[minIndex] = temp;
//                }
                System.out.println("Position change pattern: " + Arrays.toString(Array));

            }
        }
        System.out.println(Arrays.toString(Array) + " " + "[ SORTED ] " + "✅ \n");
        System.out.println("Time taken: " + duration + " " + "nanoseconds \n");




    }


    /***********---------INSERTION SORT ALGORITHMS-------------*****************/

    public static void SelectionSort() {
        System.out.print("Enter the array size: ");
        Scanner Input = new Scanner(System.in);
        int arr_size = Input.nextInt();
        System.out.println("Enter the elements in the array:");
        int[] Array = new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            Array[i] = Input.nextInt();
            System.out.println(Arrays.toString(Array));


        }
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        for (int i = 0; i < Array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[j] > Array[minIndex])
                    minIndex = j;

//                int temp = Array[minIndex];
//                Array[minIndex] = Array[i];
//                Array[i] = temp;
            }
            if (minIndex != i) {
                int temp = Array[i];
                Array[i] = Array[minIndex];
                Array[minIndex] = temp;
            }
            System.out.println("After swap: " + Arrays.toString(Array));

        }
        System.out.println(Arrays.toString(Array) + " " + "After Sorting" + " " + " ✅\n");
        System.out.println("Time taken: " + duration + " " + "nanoseconds");
    }

    /***********---------SELECTION SORT ALGORITHMS-------------*****************/
    public static void InsertionSort() {
        System.out.print("Enter the array size: ");
        Scanner Input = new Scanner(System.in);
        int arr_size = Input.nextInt();
        System.out.println("Enter the elements in the array:");
        int[] Array = new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            Array[i] = Input.nextInt();
            System.out.println(Arrays.toString(Array));

        }
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        int n = Array.length;

        for (int i = 1; i < n; ++i) {
            int key = Array[i];
            int j = i - 1;

            while (j >= 0 && Array[j] > key) {
                Array[j + 1] = Array[j];
                j = j - 1;
            }

            Array[j + 1] = key;
            System.out.println("After inserting element " + key + ": " + Arrays.toString(Array));
        }

        System.out.println(Arrays.toString(Array) + " " + "After Sorting" + " " + " ✅\n");
    }


    public static void CockShakerSort() {
        System.out.print("Enter the array size: ");
        Scanner Input = new Scanner(System.in);
        int arr_size = Input.nextInt();
        System.out.println("Enter the elements in the array:");
        int[] Array = new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            Array[i] = Input.nextInt();
            System.out.println(Arrays.toString(Array));

        }
        System.out.println("Initial Array" + " " + Arrays.toString(Array));
        long startTime = System.nanoTime();

        boolean swapped;
        int start = 0;
        int end = Array.length;

        do {
            swapped = false;

            // Forward pass
            for (int i = start; i < end - 1; i++) {
                if (Array[i] > Array[i + 1]) {
                    int temp = Array[i];
                    Array[i] = Array[i + 1];
                    Array[i + 1] = temp;
                    swapped = true;
                    System.out.println("Position change pattern (Forward Pass): " + Arrays.toString(Array));
                }
            }

            // If nothing moved, then array is sorted
            if (!swapped) {
                break;
            }

            // Otherwise, reset the swapped flag so that it can be used in the next stage
            swapped = false;

            // Move the end point back by one, because the item at the end is in its rightful spot
            end--;

            // Backward pass
            for (int i = end - 1; i > start; i--) {
                if (Array[i - 1] > Array[i]) {
                    int temp = Array[i];
                    Array[i] = Array[i - 1];
                    Array[i - 1] = temp;
                    swapped = true;
                    System.out.println("Position change pattern (Backward Pass): " + Arrays.toString(Array));
                }
            }

            // Increase the starting point, because the last stage would have moved the next smallest number to its rightful spot
            start++;

        } while (swapped);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println(Arrays.toString(Array) + " " + "[SORTED] " + "✅ \n");
        System.out.println("Time taken: " + duration + " nanoseconds \n");
    }


}



