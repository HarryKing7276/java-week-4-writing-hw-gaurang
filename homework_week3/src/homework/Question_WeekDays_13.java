package homework;

import java.util.Scanner;

public class Question_WeekDays_13 {


    public void wd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int wds = sc.nextInt();
        sc.close();
        switch (wds){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }
    public static void main(String[] args) {
        Question_WeekDays_13   obj=new Question_WeekDays_13();
        obj.wd();
    }

}
