import java.util.Scanner;

public class Problem8_1 {

	public static void main(String[] args) {
		System.out.print("Eneter a 3 by 4 matrix, row by row");
		Scanner input = new Scanner(System.in);
		
		
		double[][] matrix = new double[3][4];
		for (int j = 0; j < matrix.length; j++)
			for (int k = 0; k < matrix[j].length; k++)
			matrix[j][k] = input.nextDouble();
		
		for (int j = 0; j < matrix[0].length; j++) {
            System.out.println("The sum of column " + j +" is " + sumColumn(matrix, j));
        }
		
	}

	 public static double sumColumn(double[][] x, int columnIndex) {

	        double total = 0;

	        for (int j = 0; j < x.length; j++) {
	            total += x[j][columnIndex];
	        }
	        return total;
	        
	 }
	        public static void displayMatrix(double[][] matrix) {
	            for (int line = 0; line < matrix.length; line++) {

	                for (int column = 0; column < matrix[line].length; column++) {
	                    System.out.printf("%2.0f ", matrix[line][column]);
	                }
	                System.out.printf("\n");
	            }
	        }
}
