package string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        s1 = s1.replace("a", "b");
        System.out.println(s1);
        s2 = s2.replace("b", "a");
        System.out.println(s2);

        System.out.println(s1.charAt(1));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.concat(s2));
        System.out.println(s1.endsWith("a"));
        System.out.println(s1.startsWith("a"));
        System.out.println(s1.equals("d"));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.indexOf("ad"));
        System.out.println(s1.lastIndexOf("da"));
        String[] s3 = s1.split("a");

        for (int i = 0; i <s3.length ; i++) {
            System.out.println(s3[i]);
        }
        System.out.println(s1.substring(1));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
    }
}
