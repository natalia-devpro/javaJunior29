package lesson4;

public class Main3 {
    public static void main(String[] args) {
        int[][] chees = new int[8][8];

        // вывести вторую диагональ (без первой) единичками
        for(int i = 0; i < chees.length; i++){
            for(int j = 0; j < chees[i].length; j++){
                if(i != j){
                    System.out.print(" " + " ");
                }else {
                    System.out.print("1" + " ");
                }
            }
            System.out.println();
        }
    }
}
