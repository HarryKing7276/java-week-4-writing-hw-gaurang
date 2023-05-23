package homework;

import java.util.Scanner;

public class Question_IfElse_10 {
    /**
     * 10. Write a java program to input any two number and ask user to enter their symbol
     * (+, -, /, *) find addition, Subtraction, multiplication and division according to
     * their symbol (using if else)
     */
    public void asmd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int x = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int y = sc.nextInt();
        System.out.println("Enter an Operator");
        String symbol = sc.next();
        if (symbol.equals("+")) {
            System.out.println("Addition of these numbers is :" + (x + y));
        } else if (symbol.equals("-")) {
            System.out.println("Subtraction of these numbers is :" + (x - y));
        } else if (symbol.equals("/")) {
            System.out.println("Division of these numbers is :" + (x / y));
        } else if (symbol.equals("*")) {
            System.out.println("Multiplication of these numbers is :" + (x * y));
        } else {
            System.out.println("Invalid Operator");
        }
    }

    public static void main(String[] args) {
        Question_IfElse_10 obj = new Question_IfElse_10();
        obj.asmd();
    }
}
