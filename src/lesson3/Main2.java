package lesson3;

public class Main2 {
    public static void main(String[] args) {
        // есть массив челых чисел. 4,7,5,2,9
        // сумму четных чисел в массиве ---- 6

        int[] numbers = {4, 7, 5, 2, 9};
        int summ = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                summ = summ + numbers[i];
            }
        }
        System.out.println(summ);
    }
}
