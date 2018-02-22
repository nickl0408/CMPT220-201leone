import java.util.Scanner;

public class Project_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int requirement = 1;
        double perimeter = 0.0;
        double paper2 = 2.0 * (Math.pow(2.0, -5.0 / 4) + Math.pow(2.0,-3.0 / 4));
        double paper1 = Math.sqrt(2) * paper2;
        
        int j;
        int k;
        
        j = input.nextInt();
        
        for (int x = 2; x <= j && j != 0 && requirement>0;x++)
        {
            requirement *= 2;
            k = input.nextInt();
            if (k >= requirement)
            {
                perimeter += requirement * paper2;
                requirement = 0;
            }
            else
            {
                requirement -= k;
                perimeter += k * paper2;
            }
            paper2 /= Math.sqrt(2);
        }
        
        double result = (perimeter - paper1) / 2.0;
        if (requirement == 0.0)
        {
            System.out.printf("%.10f\n",result);
        }
        else
        {
            System.out.print("impossible");
            System.out.print("\n");
            
        }
        

    }

}
