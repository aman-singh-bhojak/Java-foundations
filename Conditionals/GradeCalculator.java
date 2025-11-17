import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("========Calculator=======");
        System.out.println("Enter your marks out of 100: ");
        int marks = in.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks!");
        } else {
            char grade;
            String remark;
            if (marks >= 90) {
                grade = 'A';
                remark = "Excellent";
            } else if (marks >= 80) {
                grade = 'B';
                remark = "Very Good";
            } else if (marks >= 70) {
                grade = 'C';
                remark = "Good";
            } else if (marks >= 60) {
                grade = 'D';
                remark = "Satisfactory";
            } else if (marks >= 50) {
                grade = 'E';
                remark = "Pass";
            } else {
                grade = 'F';
                remark = "Fail";
            }
            System.out.println("Marks: " + marks + "\nGrade: " + grade + "\nRemarks: " + remark);
        }
        in.close();
    }
}
