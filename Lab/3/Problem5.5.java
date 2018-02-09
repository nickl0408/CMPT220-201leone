/*
   Conversion from kilograms to pounds and pounds to kilograms Write a
   program that displays the following two tables side by side 
*/

public class KilotoPound{
    public static void main(String[] args){
        System.out.printf("%-10s %8s  |     %-8s %10s%n",
            "Kilograms ",
            "    Pounds ",
            "Pounds ",
            "      Kilograms ");
            
        int pounds = 20;
        for (int j = 1; j < 200; j += 2){
            System.out.printf(" %-10d %8.1f    |        %-8d %10.2f%n", 
            j,
            j * 2.2,
            pounds,
            pounds * 0.4545);
            pounds += 5;
        }    
    }
}