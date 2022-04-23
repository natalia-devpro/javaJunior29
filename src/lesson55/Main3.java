package lesson55;

public class Main3 {
    public static void main(String[] args) {
        int[][] numbers = {{2, 4, 7, 5},
                           {4, 5, 7, 8},
                           {1, 4, 2, 2}};
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
