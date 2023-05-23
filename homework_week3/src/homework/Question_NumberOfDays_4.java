    package homework;
import java.util.Scanner;
/**  4. Number of Days In Month
 *      Write a method isLeapYear with a parameter of type int named year.
 *      The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 *      If the parameter is not in that range return false. Otherwise, if it is in the valid
 *      range, calculate if the year is a leap year and return true if it is, otherwise return
 *      false. A year is a leap year if it is divisible by 4 but not by 100, or it is divisible
 *      by 400.
 *
 */

    public class Question_NumberOfDays_4 {
    public static void isLeapYear() {
        System.out.println("TO CHECK IF IT IS A LEAP YEAR OR NOT");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a Year : "); // just to give user an instructions to enter a year
        int year = sc1.nextInt(); // this will let user input year in CONSOLE.
        System.out.println((year >= 1 && year <= 9999) ? "True" : " False ");
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("True  as it's a Leap Year");
            } else {
                System.out.println("False as not a Leap Year ");
            }
        }
    }
    public static int getDaysInMonth() {
        System.out.println("TO CALCULATE DAYS IN A MONTH");
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter a Month: ");
        int month= sc2.nextInt();
        System.out.println("Enter a Year : ");
        int year= sc2.nextInt();
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            System.out.println("-1 : Invalid Month or Year");
        } else {
            switch (month) {
                case 2:
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        System.out.println("Days are 29");
                        break;
                    }else {
                        System.out.println("Days are 28");
                        break;
                    }
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Days are 30");
                    break;
                default:
                    System.out.println("Days are 31");
            }

        }return year;
    }
    public static void main (String[]args){
        isLeapYear();
        getDaysInMonth();
    }
    }