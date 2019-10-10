import java.util.Scanner;

public class MagicSum {
    public int number;
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    public void input(){
        do {
            System.out.print("Enter the positive integer or -1 to exit ");
            number = scanner.nextInt();
            if (TestEight.HAS_EIGHT(number)== true){
                sum = sum + number;
            }
        }while (number> 0);

        System.out.println(sum);
    }
}
