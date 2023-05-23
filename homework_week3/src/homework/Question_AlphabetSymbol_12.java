package homework;

import java.util.Scanner;

public class Question_AlphabetSymbol_12 {
    /**   12. Write a program that tells us input value is number or an alphabet or symbol.
     *
     */

    public void value() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char c = scanner.next().charAt(0);
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " is a Alphabet.");
        } else if (c >= '0' && c <= '9') {
            System.out.println(c + " is a Number.");
        } else {
            System.out.println(c + " is Symbol.");
        }
    }

    public static void main(String[] args) {
        Question_AlphabetSymbol_12  obj=new Question_AlphabetSymbol_12 ();
        obj.value();
    }
}
