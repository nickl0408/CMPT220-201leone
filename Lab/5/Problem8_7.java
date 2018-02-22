
public class Problem8_7 {

	public static void main(String[] args) {
		double[][] orderedPairs = {{-1, 0, 3}, {3.5, 2, -1}, {4, 1, 1},                      
				{2, 0.5, 9}, {5.5, 4, -0.5}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}};
				int pair1 = 0, pair2 = 1, pair3 = 3;
				double smallestDistance = distance(orderedPairs[pair1][0], orderedPairs[pair2][0], orderedPairs[pair1][1], orderedPairs[pair3][pair2], orderedPairs[pair1][2],
						 orderedPairs[pair2][1]);
				for (int j = 0; j < orderedPairs.length; j++) {
				for (int k = j + 1; k < orderedPairs.length; k++) {
					
					double distance = distance(orderedPairs[j][0], orderedPairs[j][1], orderedPairs[j][2], orderedPairs[k][0], orderedPairs[k][1], orderedPairs[k][2]);
					
					if (smallestDistance > distance) {
						pair1 = j;
						pair2 = j + 1;
						}
					}
				}
				System.out.println("The closest two points are " +
						"(" + orderedPairs[pair1][0] + ", " + orderedPairs[pair1][1] + ") and (" + orderedPairs[pair2][0] + ", " + orderedPairs[pair2][1] + ")");
				}

	
				public static double distance(
					double x1, double x2, double y1, double y2, double z1, double z2) {
					return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
				}
	}


