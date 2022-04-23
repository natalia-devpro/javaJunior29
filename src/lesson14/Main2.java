package lesson14;

public class Main2 {
    public static void main(String[] args) {
        Fridj fridj = new Fridj();
        fridj.putProduct("Бананы", 2);
        fridj.putProduct("Яблоко", 4);
        fridj.putProduct("Груша", 3);
        fridj.putProduct("Бананы", 4);

        fridj.getProduct("Яблоко", 2);
        fridj.printAllProducts();

      //  boolean canCook = fridj.canCook(recept);
    }
}
