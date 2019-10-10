public class TestEight {
    public static boolean HAS_EIGHT(int number){
        int digit;
        while (number > 0){
            digit = number %10;
            if (digit == 8) return true;
            number = number /10;
        }
        return false;
    }
}
