package lesson2;

public class Main {

    public static void main(String[] args) {
        int money = 1016;
        int pizzaCost = 230;
        int bubbleCost = 26;
        double candyCost = 2.5;

        // математические операторы в java
        // +    -    /    *
        // ++ (увеличение себя на еденицу)
        // -- (уменьшение себя на еденицу)
        // %  - вычисление остатка от деления 10 % 3 = 1; 12 % 2 = 0; 3 % 2 = 1;

        int canByPizza = money / pizzaCost;  // получится целое число!!! (4)
        int restAfterPizzaBy = money % pizzaCost; // выщитали 80 руб сдачи
        int canByBubble = restAfterPizzaBy / bubbleCost; // 80 / 26 = 3
        int restAfterBubbleBy = restAfterPizzaBy % bubbleCost; // 80 % 26 = 4

        int canByCandy =  (int)(restAfterBubbleBy / candyCost); ///  !!!
        double totalRest = restAfterBubbleBy - (candyCost * canByCandy);

        System.out.println("Кол-во пицц: " + canByPizza);
        System.out.println("Кол-во жвачек: " + canByBubble);
        System.out.println("Кол-во конфет: " + canByCandy);
        System.out.println("Остаток: " + totalRest);

        // преобразование типа int ---> double, byte --> int
        //


    }






}
