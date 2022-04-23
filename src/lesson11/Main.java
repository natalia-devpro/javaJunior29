package lesson11;

public class Main {
    public static void main(String[] args) {
        Slon slon1 = new Slon();
        Slon slon2 = new Slon();

        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();

        Medved medved1 = new Medved();
        Medved medved2 = new Medved();

        AbstractAnimal[] animals = new AbstractAnimal[6];
        animals[0] = medved1;
        animals[1] = tiger2;
        animals[2] = medved2;
        animals[3] = slon2;
        animals[4] = tiger1;
        animals[5] = slon1;

        // for each
        for(AbstractAnimal currentAnimal:animals){
            currentAnimal.voice();  // проявление полиморфизма
            /** Полиморфизм - это свойство java, которое проявляется в момент запуска программы
             *  Данное свойство позволяет работать с разными типами данных как с одним и тем же
             *  Но в то же самое время: реализация программы отрабатывает как буд-то мы
             *  работаем с разными типами
             */
        }

    }
}
