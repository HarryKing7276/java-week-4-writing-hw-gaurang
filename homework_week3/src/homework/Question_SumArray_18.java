package homework;

import java.util.Scanner;

/**    18. Write a Java program to sum values of an array.
 *
 */

public class Question_SumArray_18 {
    public void smu(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the required size of the array : ");
        int size = sc1.nextInt();
        int myArray[] = new int [size];
        int sum = 0;
        System.out.println("Enter the elements of the array one by one ");

        for(int i=0; i<size; i++){
            myArray[i] = sc1.nextInt();
            sum = sum + myArray[i];
        }
        System.out.println("Sum of the elements of the array :"+sum);
    }
    public static void main(String args[]){
        Question_SumArray_18 obj = new Question_SumArray_18();
        obj.smu();
    }
}





