package lesson3;

public class Main {
    public static void main(String[] args) {
        // формула создания любого ссылочного объекта
        // 1 - тип ссылки
        // 2 - название ссылки
        // 3 - = new (созадние нового объекта)
        // 4 - тип объекта

        // заполнить массив четными от 10 до ...
        int[] numbers = new int[10];

//        numbers[0] = 10;
//        numbers[1] = 12;
//        numbers[2] = 14;
//        numbers[3] = 16;
//        numbers[4] = 18;
//
//        numbers[5] = 20;
//        numbers[6] = 22;
//        numbers[7] = 24;
//        numbers[8] = 26;
//        numbers[9] = 28;

        int value = 10;
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = value;
            value = value + 2;
        }

        // выводим на консоль каждую ячейку
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
