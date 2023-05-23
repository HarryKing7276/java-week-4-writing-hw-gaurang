package homework;
import java.util.Scanner;

public class Question_Switch_09 {
    /** 9. Same as above program-8 using switch statement
     *
     */
    public void sw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Uppercase Alphabet :");
        String af = sc.next();
        sc.close();
        switch (af){
            case "A":
                System.out.println("Amersham");
                break;
            case "B":
                System.out.println("Bath");
                break;
            case "C":
                System.out.println("Chelthnham");
                break;
            case "D":
                System.out.println("Dover");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Farnborough");
                break;
            default:
                System.out.println("Invalid Alphabet");
        }
    }
    public static void main(String[] args) {
        Question_Switch_09 obj=new Question_Switch_09();
        obj.sw();
    }


}
