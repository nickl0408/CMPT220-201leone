import java.util.Scanner;

public class Problem8_11 {

    public static void main(String[] args) {

        int[][] matrix = new int[3][3];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int x = input.nextInt();
        String binary = decToBin(x);

        
        int Index = 0;
        for (int j = 0; j < matrix.length; j++) {

            for (int k = 0; k < matrix[j].length; k++) {
                int coinSide = (binary.charAt(Index++) == '0') ? 0 : 1;
                matrix[j][k] = coinSide;
            }
        }
        for (int j = 0; j < matrix.length; j++) {

            for (int k = 0; k < matrix[j].length; k++) {
                char ch = (matrix[j][k] == 0) ? 'H' : 'T';
                System.out.print(ch + " ");
            }
            System.out.println("");
        }

    }

    public static String decToBin(int x) {

        StringBuilder y = new StringBuilder();
        while (x != 0) {
            y.append(x & 1);
            x = x >> 1;
        }
        while (y.length() < 9) {
            y.insert(0, "0");
        }
        return y.toString();
    }


}