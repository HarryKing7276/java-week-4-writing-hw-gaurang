package homework;
import java.util.Scanner;

public class Question_EmployeeSalarySlip_5 {
/**5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF
 *    and Gross salary
 *    HRA = basic salary 10%
 *    DA = Basic salary 8%
 *    TA = Basic salary 9%
 *    PF= Basic salary 20%
 *    Gross salary = basic salary + HRA + TA + DA –PF
 *    Print in following format
 *    _______________________________
 *    |           Salary Slip        |
 *    |______________________________|
 *    | Employee Id : 2564           |
 *    | Employee Name : Jay          |
 *    |______________________________|
 *    | Basic Salary : 25000.0       |
 *    | HRA 10% : 2500.0             |
 *    | TA 8% : 2250.0               |
 *    | DA 9% : 2000.0               |
 *    | PF - 20& : 5000.0            |
 *    |______________________________|
 *    | Gross Salary : 26750.0       |
 *    |==============================|
 */

public void wap(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employee ID: ");
    int ei= sc.nextInt();
    System.out.println("Employee Name");
    String en= sc.next();
    System.out.println("Enter Basic Salary : ");
    int bs= sc.nextInt();
    double hra=bs*0.10;
    double da= bs*0.08;
    double ta= bs*0.09;
    double pf= bs*0.20;
    double gs= bs+hra+ta+da-pf;
    sc.close();
    System.out.println("|------------------------|");
    System.out.println("|      Salary Slip       |");
    System.out.println("|------------------------|");
    System.out.println("|Employee ID   : " +ei+ "|");
    System.out.println("|Employee Name : " +en+ "|");
    System.out.println("|------------------------|");
    System.out.println("|Basic Salary : " +bs+"  |");
    System.out.println("|HRA 10%      : " +hra+ "|");
    System.out.println("|TA 8%        : " +ta+ " |");
    System.out.println("|DA 9%        : " +da+ " |");
    System.out.println("|PF 20%       : " +pf+ " |");
    System.out.println("|------------------------|");
    System.out.println("|Gross Salary : " +gs+ " |");
    System.out.println("|========================|");
}

    public static void main(String[] args) {
        Question_EmployeeSalarySlip_5 obj = new Question_EmployeeSalarySlip_5();
        obj.wap();


    }
}

