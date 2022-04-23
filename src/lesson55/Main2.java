package lesson55;

public class Main2 {

    public static void main(String[] args) {
        int[] numbers = {23, 56, 89, 67, 45, 124};

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            String currentNumStr = currentNumber + "";
            if(currentNumStr.contains("4")){
                System.out.println(currentNumStr);
            }
        }
    }

}
