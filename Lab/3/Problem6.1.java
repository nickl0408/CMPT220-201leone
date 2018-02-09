
public class Pentegonal {

	public static void main(String[] args) {
		System.out.println("The First 100 Pentegonal Numbers in Numerical Order are ");
		for (int j = 1; j < 101; j++) {
			System.out.printf("%7d " , getPentNum(j));
			if (j % 10 == 0)
				System.out.println();
		}

	}
	
	public static int getPentNum(int n) {
		return(n *(3 * n - 1)) / 2;
	}
}
