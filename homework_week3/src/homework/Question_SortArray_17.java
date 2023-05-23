package homework;

/**17. Write a Java program to sort a numeric array and a string array.
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Question_SortArray_17 {

        public void m() {
            Scanner scanner = new Scanner(System.in);

            // Numeric array
            System.out.print("Enter the number of elements in the numeric array: ");
            int numSize = scanner.nextInt();
            int[] numericArray = new int[numSize];
            System.out.println("Enter the elements of the numeric array:");
            for (int i = 0; i < numSize; i++) {
                numericArray[i] = scanner.nextInt();
            }

            // String array
            System.out.print("Enter the number of elements in the string array: ");
            int strSize = scanner.nextInt();
            String[] stringArray = new String[strSize];
            System.out.println("Enter the elements of the string array:");
            for (int i = 0; i < strSize; i++) {
                stringArray[i] = scanner.next();
            }

            scanner.close();

            // Sort numeric array
            sortNumericArray(numericArray);

            // Sort string array
            sortStringArray(stringArray);

            // Sorted numeric array
            System.out.println("Sorted Numeric Array:");
            for (int num : numericArray) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Sorted string array
            System.out.println("Sorted String Array:");
            for (String str : stringArray) {
                System.out.print(str + " ");
            }
            System.out.println();
        }

        public static void sortNumericArray(int[] array) {
            Arrays.sort(array);
        }

        public static void sortStringArray(String[] array) {
            Arrays.sort(array);
        }


        public static void main(String[] args) {
            Question_SortArray_17   obj = new Question_SortArray_17 ();
            obj.m();


        }
    }

