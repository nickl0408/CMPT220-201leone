import java.util.Scanner;

public class Problem8_5 {

	public static void main(String[] args) {
		System.out.print("Enter a 3 by 3 matrix");
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[3][3];
		for (int j = 0; j < matrix.length; j++)
			for (int k = 0; k < matrix[j].length; k++)
			matrix[j][k] = input.nextDouble();
		
		System.out.print("Enter another 3 by 3 matrix");
		double[][] matrix1 = new double[3][3];
		for (int j = 0; j < matrix1.length; j++)
			for (int k = 0; k < matrix1[j].length; k++)
			matrix1[j][k] = input.nextDouble();
		
		double[][] addedMatrix = addMatrix(matrix, matrix1);
		
		for (int j = 0; j < matrix[j].length; j++) {
			
				
			for (int k = 0; k < matrix[j].length; k++) {
				System.out.printf("%2.1f ",matrix[j][k]);
				if (j == 1 && k == 2) System.out.printf("%4s ", " + ");
	            else System.out.printf("%3s ", " ");
			}
			for (int k = 0; k < matrix1[j].length; k++) {
				System.out.printf("%2.1f ",matrix1[j][k]);
				if (j == 1 && k == 2) System.out.printf("%4s ", " = ");
            else System.out.printf("%3s ", " ");
			}
			for (int k = 0; k < addedMatrix[j].length; k++) {
                System.out.printf("%3.1f ", addedMatrix[j][k]);
            }
		System.out.println(" ");
		}
	
}
	
	 public static double[][] addMatrix(double[][] x, double[][] y) {

		        double[][] addedMatrix = new double[x.length][x[0].length];

		        for (int j = 0; j < x.length; j++) {
		            for (int k = 0; k < x[0].length; k++) {
		                addedMatrix[j][k] = x[j][k] + y[j][k];
		            }
		        }

		        return addedMatrix;
		    }
		}