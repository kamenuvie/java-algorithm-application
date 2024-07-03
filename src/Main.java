
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main  {

    public static void main(String[] args) throws InputMismatchException {
        while (true) {
            try {
                System.out.print(
                        "Welcome to the algorithm hub.\n" +
                                "This application is purposely programmed to help users appreciate the concept of the basic searching and sorting algorithm \n" +
                                "given an array size. [Thus, the program is focused on Searching and Sorting Algorithm] \n\n"
                );

                System.out.print("LETS SEE HOW IT WORKS \n\n");
                Scanner Input = new Scanner(System.in);
                System.out.println(
                        "Which type of algorithm do you want to perform? Select any of your choice: \n" +
                                "1. Searching Algorithm \n" +
                                "2. Sorting Algorithm \n" +
                                ":"
                );
                int choice = Input.nextInt();

                if (choice == 1) {
                    System.out.print(
                            "You selected Searching Algorithm. Now, with the searching algorithm, we have two sub-types \n" +
                                    "thus, the linear and the binary search \n\n" +
                                    "Linear Search: Given an array of numbers, it searches through one by one until your target element is found or not \n\n" +
                                    "Binary Search: Given an array of numbers, it divides the list into two equal parts, searches the two consecutive \n" +
                                    "lists one after the other until the target element is found in either of them or not \n\n"
                    );

                    System.out.print("LETS SEE THE MAGIC BEHIND THESE METHODS. Select any of your choice:\n" +
                                    "1. Linear Search \n" +
                                    "2. Binary Search \n" +
                                    ":"
                                     );

                                      while (true) {
                                          try {


                                              int reply = Input.nextInt();
                                              switch (reply) {
                                                  case 1:
                                                      System.out.print("You selected a Linear Search. Lets see HOW it WORKS\n");
                                                      SearchAlgorithmMethods.linearSearch();
                                                      break;

                                                  case 2:
                                                      System.out.print("You selected a Binary search algorithm. Lets see HOW it WORKS \n");
                                                      SearchAlgorithmMethods.binarySearch();
                                                      break;

//
                                              }
                                          }
                                            catch (InputMismatchException e) {
                                        System.out.println("Invalid input. Please enter an integer relative to the Array .\n " +
                                                "Follow the prompt to avoid error \n" +
                                                " SELECT \n " +
                                                "1. Linear Search \n " +
                                                "2. Binary search \n" +
                                                "Make sure you choose from these alternatives\n" )
                                                ;


                                                int reply = Input.nextInt();
                                                switch (reply) {
                                                    case 1:
                                                        System.out.print("You selected a Linear Search. Lets see HOW it WORKS\n");
                                                        SearchAlgorithmMethods.linearSearch();
                                                        break;

                                                    case 2:
                                                        System.out.print("You selected a Binary search algorithm. Lets see HOW it WORKS \n");
                                                        SearchAlgorithmMethods.binarySearch();
                                                        break;

//
                                                }



                    };
                                      }


                } else if (choice == 2) {
                    System.out.print(" You selected A Sorting Algorithm . Sorting in general is simply arranging aa given element in an order.\n" +
                            "The various types of sorting include the Bubble sort, Selection sort, Insertion sort,Heap sort,Quick sort,Merge sort\n");

                    System.out.print
                            ("LETS SEE THE MAGIC BEHIND THIS SORTING METHODS. Select any lets do it together: \n" +
                                    "1: Bubble Sort \n" +
                                    "2: Selection Sort \n" +
                                    "3: Insertion Sort \n" +
                                    "4: CockShaker Sort\n" +
                                    ":"
                            );
                    int method = Input.nextInt();
                    switch (method){
                        case 1 :  System.out.print("You selected a Bubble Sort algorithm. Lets see HOW it WORKS \n");
                                    SortAlgorithmMethods.BubbleSort();
                                    break;

                        case 2 :    System.out.print("You selected a Selection Sort algorithm. Lets see HOW it WORKS \n");
                                    SortAlgorithmMethods.SelectionSort();
                                     break;

                        case 3 :    System.out.print("You selected a Insertion  sort algorithm. Lets see HOW it WORKS \n");
                                    SortAlgorithmMethods.InsertionSort();
                                    break;

                        case 4 :    System.out.print("You selected a CockShaker sort algorithm. Lets see HOW it WORKS \n");
                                    SortAlgorithmMethods.CockShakerSort();
                                    break;



                        default :   System.out.print("Invalid choice" +" "+"\uD83D\uDEAB \n");
                                    break;


                    }


                } else
                    System.out.print("Invalid choice" + " " + "\uD83D\uDEAB . Please enter 1 or 2 \n.");

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer on your next attempt.... \n." +
                        "NB ➡: Always follow instruction in order not to get lost");

            }
        }

 }
}


/*********************--------PROCEDURAL APPROACH--------------*********************/

//
//        System.out.println("Welcome to the algorithm hub.\n" );
//        while (true) {
//            System.out.print
//                    ("Select any algorithm type to perform operation : \n" +
//                            "Searching Algorithm\n" +
//                            "1. Linear Search \n" +
//                            "2. Binary Search \n\n" +
//                            "Sorting Algorithm \n" +
//                            "3. Bubble Sort \n" +
//                            "4. Selection Sort \n" +
//                            "5. Insertion sort \n"
//
//                    );
//            Scanner Input = new Scanner(System.in);
//            int Algorithm_Type = Input.nextInt();
//            if (Algorithm_Type == 1) {
//
//
//                System.out.println("You selected Linear Search algorithm");
//                System.out.println(" [Default Number-size = 10] :");
//                System.out.println("Enter your values randomly");
//                int[] arr = new int[10];
//                arr[0] = Input.nextInt(); arr[1] = Input.nextInt();arr[2] = Input.nextInt();arr[3] = Input.nextInt();
//                arr[4] = Input.nextInt();arr[5] = Input.nextInt();arr[6] = Input.nextInt();arr[7] = Input.nextInt();
//                arr[8] = Input.nextInt();arr[9] = Input.nextInt();
//                System.out.println(Arrays.toString(arr));
//                long startTime = System.nanoTime();
//                int index;
//                long endTime = System.nanoTime();
//                long duration = (endTime - startTime);  // Time in nanoseconds
//
//❌
//
//                System.out.println("Enter target key number : \n");
//                int target = Input.nextInt();
//
//
//                for (int i = 0; i < arr.length; i++) {
//                    if (arr[i] == target) {
//                        System.out.println("Target key :" + " " + target + " " + "found at index" + " " + i + " " + " ✅");
//                        System.out.println("Time taken: " + duration +" "+ "nanoseconds \n");
//                        break;
//                    } else {
//                        System.out.println("Target key :" + " " + target + " not found at index" + " " + i + " " + "\uD83D\uDEAB ");
//
//                    }
//
//                }
//
//
//            } else if (Algorithm_Type == 2) {
//                long startTime = System.nanoTime();
//                int index;
//                long endTime = System.nanoTime();
//                long duration = (endTime - startTime);  // Time in nanoseconds
//
//                System.out.println("You selected Binary Search algorithm :\n");
//                System.out.println(" [Default Array-size = 10] :");
//                System.out.println("Enter your values randomly");
//
//
//                int[] arr = new int[10];
//                arr[0] = Input.nextInt(); arr[1] = Input.nextInt();arr[2] = Input.nextInt();arr[3] = Input.nextInt();
//                arr[4] = Input.nextInt();arr[5] = Input.nextInt();arr[6] = Input.nextInt();arr[7] = Input.nextInt();
//                arr[8] = Input.nextInt();arr[9] = Input.nextInt();
//
//                System.out.println(Arrays.toString(arr));
//                System.out.println("Enter a target key to binary search :\n");
//                int key = Input.nextInt();
//
//                int low = 0;
//                int high = arr.length - 1;
//                int mid = (low + high - 1) / 2;
//
//
//                while (high >= low) {
//                    if (arr[mid] < key) {
//                        low = mid + 1;
//                    } else if (arr[mid] > key) {
//                        high = mid - 1;
//
//                    } else {
//                        return ;
//                    }
//
//
//                    for (int i = 0; i < arr.length; ++i) {
//
//                        if (arr[i] == key) {
//                            System.out.println("Key :" + " " + key + " " + "found at index" + " " + i + " ✅");
//                            System.out.println("Time taken: " + duration +" "+ "nanoseconds \n");
//                            break;
//                        } else {
////                            System.out.println("Key :" + " " + key + " " + "not found at index" + " " + i + "\uD83D\uDEAB ");
//                        }
//                    }
//                }break;
//
//
//            }else if(Algorithm_Type == 3){
//                 Input = new Scanner(System.in);
//
//                long startTime = System.nanoTime();
//                int index;
//                long endTime = System.nanoTime();
//                long duration = (endTime - startTime);  // Time in nanoseconds
//
//
//                System.out.println("You selected Bubble Sort algorithm :\n");
//                System.out.println(" [Default Array_size = 10] :");
//                System.out.println("Enter your values randomly");
//
//
//                int[] arr = new int[10];
//                arr[0] = Input.nextInt(); arr[1] = Input.nextInt();arr[2] = Input.nextInt();arr[3] = Input.nextInt();
//                arr[4] = Input.nextInt();arr[5] = Input.nextInt();arr[6] = Input.nextInt();arr[7] = Input.nextInt();
//                arr[8] = Input.nextInt();arr[9] = Input.nextInt();
//                System.out.println(Arrays.toString(arr) +" " +"[ UNSORTED ] \n");
//                System.out.println("Input S [SORT] : \n");
//                Input = new Scanner(System.in);
//                String reply = Input.nextLine();
//
//
//
//
//                int temp = 0;
//
//                for (int i = 0; i < arr.length; i++){
//                    for (int j = i+1; j< arr.length; j++){
//                        if (arr[j] < arr[i]){
//                            temp = arr[i];
//                            arr[i] = arr[j];
//                            arr[j] = temp;
//                        }
//                    }
//                }
//
//
//                    System.out.println(Arrays.toString(arr) + " " + "[ SORTED ] "+ "✅ \n" );
//                System.out.println("Time taken: " + duration +" "+ "nanoseconds \n");
//
//
//
//            }else if (Algorithm_Type == 4){
//                Input = new Scanner(System.in);
//
//                long startTime = System.nanoTime();
//                int index;
//                long endTime = System.nanoTime();
//                long duration = (endTime - startTime);  // Time in nanoseconds
//
//                System.out.println("You selected  selection sort  algorithm :\n");
//                System.out.println(" [Default Array-size = 10] :");
//                System.out.println("Enter your values randomly");
//
//                int[] arr = new int[10];
//                arr[0] = Input.nextInt(); arr[1] = Input.nextInt();arr[2] = Input.nextInt();arr[3] = Input.nextInt();
//                arr[4] = Input.nextInt();arr[5] = Input.nextInt();arr[6] = Input.nextInt();arr[7] = Input.nextInt();
//                arr[8] = Input.nextInt();arr[9] = Input.nextInt();
//
//                System.out.println(Arrays.toString(arr)+" "+ "Before Sorting \n");
//                System.out.println("Input S [SORT] : \n");
//                Input = new Scanner(System.in);
//                String target = Input.nextLine();
//
//                int temp = 0;
//                int minIndex = 0;
//
//                for (int i = 0 ; i < arr.length-1 ; i++){
//                    minIndex = i;
//                    for (int j = i+1; j<arr.length; j++){
//                        if (arr[minIndex] > arr[j])
//                            minIndex = j;
//
//
//
//                        temp = arr[minIndex];
//                        arr[minIndex] = arr[i];
//                        arr[i]= temp;
//
//
//                    }
//                }
//
//                System.out.println(Arrays.toString(arr) +" "+ "After Sorting"+" "+" ✅\n");
//                System.out.println("Time taken: " + duration +" "+ "nanoseconds");
//
//            } else if (Algorithm_Type == 5) {
//                long startTime = System.nanoTime();
//                int index;
//                long endTime = System.nanoTime();
//                long duration = (endTime - startTime);  // Time in nanoseconds
//
//
//                System.out.println("You selected Insertion sort algorithm :\n" );
//                System.out.println(" [Default Array-size = 10] :");
//                System.out.println("Enter your values randomly");
//
//
//                int[] arr = new int[10];
//                arr[0] = Input.nextInt(); arr[1] = Input.nextInt(); arr[2] = Input.nextInt(); arr[3] = Input.nextInt();
//                arr[4] = Input.nextInt(); arr[5] = Input.nextInt(); arr[6] = Input.nextInt(); arr[7] = Input.nextInt();
//                arr[8] = Input.nextInt(); arr[9] = Input.nextInt();
//                System.out.println(Arrays.toString(arr));
//                Input = new Scanner(System.in);
//                System.out.println("Input S [SORT] : \n");
//                String target = Input.nextLine();
//
//                for (int i = 0 ; i< arr.length; i++){
//                    for (int j = i +1 ; j < arr.length; j++){
//                         if (arr[j] < arr[i]){
//                             int temp = arr[i];
//                             arr[i] = arr[j];
//                             arr[j] = temp;
//
//                         }
//                    }
//                }
////                System.out.println(Arrays.toString(arr) +" "+ "After Sorting"+" "+" ✅\n");
//                System.out.println("Time taken: " + duration +" "+ "nanoseconds");
//
//
//
//            }
//        }
//
//
//    }



