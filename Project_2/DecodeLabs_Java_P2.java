import java.util.Scanner;

public class DecodeLabs_Java_P2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("============*********===============");
        System.out.println("     Student Grade Calculator");
        System.out.println("============*********===============");

        int numOfSubs;

        while (true) {
            System.out.print("Enter the number of subjects: ");

            if (sc.hasNextInt()) {
                numOfSubs = sc.nextInt();

                if (numOfSubs > 0) {
                    break;
                }else {
                    System.out.println("Number of subjects must be greater than 0.");
                }
            }else {
                System.out.println("Invalid input! Please enter a valid integer.");
                sc.next();
            }
        }

        int totalMarks = 0;

        for (int i = 1; i <= numOfSubs; i++){
            int mark;

            while (true) {
                System.out.print("Enter marks for Subject " + i + " (0-100): ");
                if (sc.hasNextInt()) {
                    mark = sc.nextInt();

                    if (mark >= 0 && mark <= 100) {
                        break;
                    }else {
                        System.out.println("Marks must be between 0 and 100.");
                    }
                }else {
                    System.out.println("Invalid input!");
                    sc.next();
                }
            }
            totalMarks += mark;
        }

        double averagePercentage = (double) totalMarks / numOfSubs;
        char grade;

        if (averagePercentage >= 90){
            grade = 'A';
        }else if (averagePercentage >= 80){
            grade = 'B';
        }else if (averagePercentage >= 70){
            grade = 'C';
        }else if (averagePercentage >= 60){
            grade = 'D';
        } else {
            grade = 'F';
        }

        String result;

        if (averagePercentage >= 40){
            result = "PASS";
        }else{
            result = "FAIL";
        }

        System.out.println("\n===========***********=============");
        System.out.println("            Result");
        System.out.println("=============***********===========");

        System.out.println("Number of Subjects : " + numOfSubs);
        System.out.println("Total Marks        : " + totalMarks);

        System.out.printf("Average Percentage : %.2f%%\n", averagePercentage);

        System.out.println("Grade              : " + grade);
        System.out.println("Result Status      : " + result);

        System.out.println("------------------------------------");

        sc.close();
    }
}