package homework;
import java.util.Scanner;

public class Question_OddEven_6 {

    // 6. Write a java program to input any number and find out if it’s odd or even

    public void oe(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int y= sc.nextInt();
        if (y % 2 == 0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        Question_OddEven_6 obj= new Question_OddEven_6();
        obj.oe();
    }


}
