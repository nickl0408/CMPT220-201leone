
public class Problem6_13 {

	public static void main(String[] args) {
		double computeSeries = 1.0;
		double allRows = 20.0;
		
		System.out.println("\ni	   m(j)    ");
		System.out.println("________________");
		
		for (double j = computeSeries; j <= allRows; j++) {
			System.out.printf("%-10.0f", j);
			System.out.printf("%7.4f\n", sumOfSeries(j));
			
		}
		
	}
	
	public static double sumOfSeries(double n) {
		double sum = 0;
		for (double j = 1; j<=n; j++) {
			sum += j / (j + 1);
			
		}

		return sum;
		
	}

}
