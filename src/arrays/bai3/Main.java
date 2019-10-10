package arrays.bai3;

public class Main {


    public static void main(String[] args) {
        int[] number = {1, 2, 3, 5};
        String array = "";
        for (int i = 0; i <number.length ; i++) {
            if (i == 0){
                array = array.concat("{");
            }
            if (i != number.length -1) array = array.concat(String.valueOf(number[i]) + ",");
            else array = array.concat(number[i] + "}");
        }

        System.out.println(array);
    }


}
