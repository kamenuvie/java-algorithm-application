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


    public static int binarySearch(){
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
        System.out.print("Enter the target number:\n");
        int target = Input.nextInt();
        for (int i = 0; i < Array.length; ++i) {

                        if (Array[i] == target) {
                            System.out.println("Key :" + " " + target + " " + "found at index" + " " + i + " ✅");
                            System.out.println("Time taken: " + duration +" "+ "nanoseconds \n");
                            break;
                        } else {
                            System.out.println("Key :" + " " + target + " " + "not found at index" + " " + i + "\uD83D\uDEAB ");
                        }
                    }

        int low = 0;
        int high = Array.length - 1;
        int mid = (low + high - 1) / 2;


        while (high >= low) {
            if (Array[mid] < target) {
                low = mid + 1;
            } else if (Array[mid] > target) {
                high = mid - 1;

            } else {
                return mid ;
            }

        }
        return -1; // not found
    }
}

