public class Main {
    public static void main(String[] args) {
        //for
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            sum1 = sum1 + i;
        }
        System.out.println(sum1);
        System.out.println((double) sum1 / 100);
        //while
        int i = 0;
        int sum2 = 0;
        while (i <= 100) {
            sum2 = sum2 + i;
            i++;
        }
        System.out.println(sum2);
        System.out.println((double) sum2 / 100);
        //do while
        int j = 0;
        int sum3 = 0;
        do {
            sum3 = sum3 + j;
            j++;
        } while (j <= 100);
        System.out.println(sum3);
        System.out.println((double) sum3 / 100);

        int sum4 = 0;
        int count = 0;
        for (int k = 111; i <= 8899; i++) {
            sum4 = sum4 + k;
            count++;
        }
        System.out.println(sum4);
        System.out.println((double) sum4 / count);

        int sum5 = 0;
        int count2 = 0;
        for (int g = 1; g <= 100; g++) {
            if (g % 2 != 0) {
                sum5 = sum5 + g;
                count2++;
            }
        }
        System.out.println("sum5: " + sum5);
        System.out.println((double) sum5 / count2);

        int sum6 = 0;
        int count3 = 0;
        for (int g = 1; g <= 100; g++) {
            if (g % 7 == 0) {
                sum6 = sum6 + g;
                count3++;
            }
        }
        System.out.println("sum6: " + sum6);
        System.out.println((double) sum6 / count3);

        int sumSquare = 0;
        int count4 = 0;
        for (int k = 1; k <= 100; k++) {
            sumSquare = sumSquare + (k * k);
        }
        System.out.println("Sum Square: " + sumSquare);

        double sumHamornic = 0, sumHamornic2 = 0;
        for (int k = 1; k <= 50000; k++) {
            sumHamornic = sumHamornic + (double) (1 / k);
        }
        System.out.println(sumHamornic);

        for (int k = 50000; k <= 1; k--) {
            sumHamornic2 = sumHamornic2 + (double) (1 / k);
        }
        System.out.println(sumHamornic2);


        for (int k = 0; k < 5; k++) {
            for (int l = 0; l < 5; l++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int k = 0; k < 7; k++) {
            for (int l = 0; l < 14; l++) {
                if ((l + k) % 2 == 1) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println("");
        }

        boolean checkOdd = TestEven.isOdd(21);

        if (checkOdd == true) System.out.println("Odd");
        else System.out.println("EVEN");

        boolean checkEight = TestEight.HAS_EIGHT(1990);
        if (checkEight == true) System.out.println("true");
        else System.out.println("false");

        MagicSum magicSum = new MagicSum();
        magicSum.input();


    }
}
