package lesson5;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String[][] tours = {{"Италия","40000","7 дней","самолет","4 звезды"},
                {"Франция","50000","5 дней","самолет","4 звезды"},
                {"Норвегия","86000","6 дней","автоус","2 звезды"},
                {"Мальдивы","255000","8 дней","самолет","3 звезды"},
                {"Италия","60000","7 дней","самолет","5 звезд"},
                {"Мальдивы","290000","10 дней","самолет","5 звезд"}};
        //1 - выбор тура по бюджету
        Scanner in = new Scanner(System.in);
        String choice;
        System.out.println("Каким способом вы хотите найти тур?\n" + "По бюджету/стране\n" + "Если по бюджету,то напишите: по бюджету\n" +
                "Если по стране,напишите : по стране");
        choice= in.nextLine();
        if (choice=="по бюджету"){
            System.out.println("на какой бюджет расчитываете?");
            String moneyToTrip = in.nextLine();
            ToursUtils.printToursByMoney (tours, moneyToTrip);
        } else {
            if (choice == "по стране") {
                System.out.println("в какую страну вы хотите поехать?");
                System.out.println("Италия,Франция,Норвегия,Мальдивы,Италия");
                String countryGoTo = in.nextLine();
                ToursUtils.printToursByCountry(tours, countryGoTo);
            }
        }
    }
}
