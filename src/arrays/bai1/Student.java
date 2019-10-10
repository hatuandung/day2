package arrays.bai1;

import java.util.Scanner;

public class Student {
    public int[] grades;
    Scanner scanner = new Scanner(System.in);

    public void getAverage(int numberStudent) {
        grades = new int[numberStudent];

        double sum = 0;
        int count = 0;
        do {
            System.out.print("Enter the grade of student " + (count + 1) + ": ");
            int grade = scanner.nextInt();

            if (grade < 100 && grade > 0) {
                grades[count] = grade;
                sum = sum + grade;
                count++;
                continue;
            }
            System.out.println("Invalid grade, try again...");
        } while (count < numberStudent);

        System.out.println("The average is: " + sum / numberStudent);
    }

}
