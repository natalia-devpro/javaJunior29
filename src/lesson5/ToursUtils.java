package lesson5;

public class ToursUtils {

    public static void printToursByMoney(String[][] tours, String moneyToTrip) {
        //moneyToTrip = 100000
        int moneyOfUser = Integer.parseInt(moneyToTrip);

        for (int i = 0; i < tours.length; i++) {
            String tourCoastStr = tours[i][1];
            int tourCoast = Integer.parseInt(tourCoastStr);
            if ((tourCoast > (moneyOfUser - 20000) && (tourCoast < (moneyOfUser + 20000)))) {
                System.out.printf("Тур: %s,%s руб,транспорт - %s, отель - %s \n",
                        tours[i][0], tours[i][1], tours[i][3], tours[i][4]);
            }
        }

    }

    public static void printAverageCoast(String[][] tours) {
        int summa = 0;
        for (int i = 0; i < tours.length; i++) {
            String tourCoastStr = tours[i][1];
            int tourCoast = Integer.parseInt(tourCoastStr);
            summa = summa + tourCoast;
        }
        System.out.println("Средняя стоимость тура: " + (summa / tours.length) + "рублей");
    }

    public static void printToursByCountry(String[][] tours, String countryGoTo) {
        for (int i = 0; i < tours.length; i++) {
            String countryIWant = tours[i][1];
            if (countryIWant.equals(countryGoTo)) {
                System.out.printf("Тур: %s,%s руб,транспорт - %s, отель - %s \n",
                        tours[i][0], tours[i][1], tours[i][3], tours[i][4]);
            }

        }

    }
}
