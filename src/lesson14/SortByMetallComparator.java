package lesson14;

import java.util.Comparator;

public class SortByMetallComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        // o1 - первая монета
        // o2 - вторая монета
        if (!o1.getMetal().equals(o2.getMetal())) {
            return o1.getMetal().compareTo(o2.getMetal());
        }
        if (o1.getDiametr() != o2.getDiametr()) {
            return Double.compare(o1.getDiametr(), o2.getDiametr());
        }
        if (o1.getNominal() != o2.getNominal()) {
            return o1.getNominal() - o2.getNominal();
        }
        if (o1.getYears() != o2.getYears()) {
            return o1.getYears() - o2.getYears();
        }

        return 0;
    }
}
