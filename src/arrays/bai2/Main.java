package arrays.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of array:" );
        int number = scanner.nextInt();
        int[] array1 = new int[number];

        for (int i = 0; i < array1.length ; i++) {
            array1[i] = scanner.nextInt();
        }


        for (int i = 0; i <array1.length ; i++) {
            if (i == 0) System.out.print("{" +array1[i] + ",");
            if (i != array1.length - 1){
                System.out.print(array1[i] + ",");
            } else System.out.print(array1[i] + "}");
        }
    }
}
