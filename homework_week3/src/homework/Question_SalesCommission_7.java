package homework;

import java.util.Scanner;

/**7.  Write a java program input sales id, seller's name, sales amount, and salary basic and
 *     then fined this sales Commission.
 *     Sales amount >= 50,000 35%
 *     Sales amount >= 30,000 20%
 *     >= 20,000 10% >= 10,000 5%
 *     < 10,000 2%
 */

public class Question_SalesCommission_7 {
    public void comm() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Sales ID : ");
        int sid = sc.nextInt();
        System.out.println("Enter Seller's Name : ");
        String sn = sc.next();
        System.out.println("Enter Sales Amount: ");
        double sa = sc.nextDouble();
        double com;
        if (sa >= 50000) {
            System.out.println("Commission is: " + sa * 0.35);
        } else if (sa >= 30000) {
            System.out.println("Commission is: " + sa * 0.20);
        } else if (sa >= 20000) {
            System.out.println("Commission is: " + sa * 0.10);
        } else if (sa >= 10000) {
            System.out.println("Commission is: " + sa * 0.05);
        } else {
            System.out.println("Commission is: " + sa * 0.02);
        }
    }

    public static void main(String[] args) {
        Question_SalesCommission_7 obj=new Question_SalesCommission_7 ();
        obj.comm();
    }

}

