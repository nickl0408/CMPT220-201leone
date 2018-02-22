import java.util.Scanner;

public class Problem7_19 {

	static int Group = 10;

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("First, type how long the list is, then enter the list: ");
        Group = input.nextInt();
        int[] nums = new int[Group];
        for (int j = 0; j < Group; j++) {
            nums[j] = input.nextInt();
        }
        if (isSorted(nums)) System.out.print("The list is already sorted.\n");
        		else System.out.print("The list is not sorted.\n");

    }

    public static boolean isSorted(int[] numbers) {

        for (int j = 0; j < numbers.length - 1; j++) {

            if (numbers[j] > numbers[j + 1]) return false;

        }
        return true;
    }
    public static void printArray(int[] array, int numberPerLine) {

                for (int j = 0; j < array.length; j++) {

                    System.out.printf("%2d ", array[j]);
                    if ((j + 1) % numberPerLine == 0) System.out.println("");
              }
    }
}
