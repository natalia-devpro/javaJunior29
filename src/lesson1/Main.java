package lesson1;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 5;

        // операторы, которые возвращают ответ TRUE или FALSE
        // >   >=   <   <=   ==    !=
        // && - объединение выражений
        // || - или то, или то

        // управляющая конструкция (используется когда нужно выполнить
        // что-то одно из нескольких вариантов

        if(a == b && b == c && c == a){
            System.out.println("Это равносторонний треугольник");
        }

        if(a != b && b != c && c != a){
            System.out.println("Это разносторонний треугольник");
        }

        if(a != b && b != c && c == a){
            System.out.println("Это равнобедренный треугольник");
        }

    }
}
