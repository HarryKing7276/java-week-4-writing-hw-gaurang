package homework;

/**3. Write a java program to input student Name, roll No, and three subjects Math,
 *    Science and English marks (marks is between 0 to 100 and if it is out of range
 *    print error message “Invalid Input, Marks should between 0 to 100”) and find out
 *    total, percentage and result.
 *    If he is pass or fail on basis of percentage (pass>=35) and also give them grade
 *    if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following
 *    format.
 */

public class Question_MarkSheet_3 {
    public static void main(String[] args) {
        String name = "Jay";
        int rollNo = 8;
        int mathMarks = 98;
        int scienceMarks = 90;
        int englishMarks = 85;

        // Check if marks are within the valid range
        if (!isValidMark(mathMarks) || !isValidMark(scienceMarks) || !isValidMark(englishMarks)) {
            System.out.println("Invalid Input! Marks should be between 0 and 100.");
            return;
        }

        // Total and percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks / 3.0);

        // Result and grade
        String result = (percentage >= 35) ? "Pass" : "Fail";
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else {
            grade = "C";
        }

        // Print statement for mark sheet
        System.out.println("|_____________________________________|");
        System.out.println("|           Mark Sheet                |");
        System.out.println("|_____________________________________|");
        System.out.println("|   Name    :   " +            name +"                   |");
        System.out.println("|   Roll No :   " + rollNo +         "                     |");
        System.out.println("|_____________________________________|");
        System.out.println("|   Subjects :   Marks                |");
        System.out.println("|_____________________________________|");
        System.out.println("|   Math    :   "+ mathMarks  + "                    |");
        System.out.println("|   Science :   " + scienceMarks +   "                    |");
        System.out.println("|   English :   " + englishMarks +   "                    |");
        System.out.println("|_____________________________________|");
        System.out.println("|   Total   :   " + totalMarks +     "                   |");
        System.out.println("|_____________________________________|");
        System.out.println("|   Percentage :   " + percentage +  "               |");
        System.out.println("|   Result  :   " + result +         "                  |");
        System.out.println("|   Grade   :   " + grade +          "                    |");
        System.out.println("|_____________________________________|");
    }

    public static boolean isValidMark(int mark) {
        return mark >= 0 && mark <= 100;
    }
}

