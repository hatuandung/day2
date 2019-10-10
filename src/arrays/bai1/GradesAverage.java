package arrays.bai1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class GradesAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter the number of student: ");
        int numberStudent  = scanner.nextInt();
        student.getAverage(numberStudent);

    }


}
