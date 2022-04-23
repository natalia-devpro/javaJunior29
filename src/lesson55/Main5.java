package lesson55;

public class Main5 {
    public static void main(String[] args) {
        int[][] chess = new int[8][8];

        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[i].length; j++){
                if((i + j) % 2 != 0 ){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
