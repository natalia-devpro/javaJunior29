package lesson2;

public class Main7 {
    public static void main(String[] args) {
        int money = 100000; // 244 232
        int years = 5;
        int prosent = 18;

        for (int month = 0; month < years * 12; month++) {
            money = money + ((money / 100 * prosent) / 12);
        }
        System.out.println(money);
    }
}
