package lesson8;

public class Main {
    public static void main(String[] args) {
        Pramoygolnik pramoygolnik1 = new Pramoygolnik(30, 50);
        Pramoygolnik pramoygolnik2 = new Pramoygolnik(3, 5);

        int plPram1 = pramoygolnik1.ploshad();
        System.out.println(plPram1);

        int perPram1 = pramoygolnik1.periment();
        System.out.println(perPram1);

        System.out.println(pramoygolnik1.equals(pramoygolnik2));

        System.out.println(pramoygolnik1.hashCode());
        System.out.println(pramoygolnik1.hashCode());

        System.out.println(pramoygolnik1.toString());


    }
}
