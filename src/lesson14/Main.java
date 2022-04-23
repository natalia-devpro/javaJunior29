package lesson14;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> tablo = new HashMap<>();
        tablo.put("Динамо", 23);
        tablo.put("ЦСК", 15);
        tablo.put("Спартак", 38);
        tablo.put("Динамо", 10 + tablo.get("Динамо"));

        // System.out.println(tablo);

        // проход по map (с помощью keySet)
        for (String comanda : tablo.keySet()) {
            System.out.println(comanda + " - " + tablo.get(comanda));
        }

        for (Map.Entry<String, Integer> para : tablo.entrySet()) {
            System.out.println(para.getKey() + " - " + para.getValue());
        }

    }
}
