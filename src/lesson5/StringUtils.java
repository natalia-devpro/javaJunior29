package lesson5;

public class StringUtils {
    /**
     * Формула создания метода:
     * 1 - модификатор доступа (одно из 4х слов)
     * public - виден внутри всего проекта
     * package (или ничего не поставить) - виден внутри пакета и дочерним классам
     * protected - внутри текущего класса и дочерним класса
     * private - внутри текущего класса
     *
     * 2 - static (или пишем или нет)
     * 3 - возвращаемый тип (int, String, int[] ... void (если ничего не возвращаем))
     * 4 - название метода (с маленькой буквы, максимально описывая что делает метод)
     * 5 - входящие параметры в () - то без чего невозможно выполнить данный метод
     * указываем через запятую тип название, тип название ...
     * 6 - тело выполнения метода
     */

    // содадим метод который принимает текст и сомвол, считает сколько
    // символов таких в тексте и возвращает числом
    public static int countCharsFromText(String text, char ch){
        // text = "ksrydnr rersmue uemroseumo"
        // ch = r
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            char currentCh = text.charAt(i);
            if(ch == currentCh){
                count++;
            }
        }
        return count;
    }

    // метод принимает входящим параметром текст,
    // и печатает на консоль этот же текст в обратном порядке
    public static void printReverse(String text){
        // text = khriweyribwertieunge
        for(int i = text.length() - 1; i >= 0; i--){
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}
