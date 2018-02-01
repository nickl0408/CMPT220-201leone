import java.text.DecimalFormat;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {

		//Prompts the user to input the information about the employee and his pay
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of the employee: ");
		String employee = input.next();
		System.out.print("Enter the number of hours the employee worked in a week: ");
		double hours = input.nextDouble();
		System.out.print("Enter the employee's hourly pay rate: ");
		double hourlyPay = input.nextDouble();
		System.out.print("Enter the Federal Tax Witholding Rate: ");
		double fedRate = input.nextDouble();
		System.out.print("Enter the State Tax Witholding Rate: ");
		double stateRate = input.nextDouble();
		
		
		//Calculates the Gross Pay, FedTax Witholding Rate, StateTax Witholding Rate, Total Deduction and Net Pay
		double grossPay = hours + hourlyPay;
		double fedTaxWitholdingRate = fedRate + grossPay;
		double stateTaxWitholdingRate = stateRate + grossPay;
		double totalDeduction = fedTaxWitholdingRate + stateTaxWitholdingRate;
		double netPay = grossPay - totalDeduction;
		
		//Will list out eveerything about the employee and his pay
		System.out.println
			("Employee's Name: Smith " + employee +
				"\nHours Worked: " + hours +
				"\nPay Rate: " + formatCurrency(hourlyPay) +
				"\nGross Pay: " + formatCurrency(grossPay) +
				"\nDeductions: " + 
				"\n Federal Witholding: ("+ formatPercent(fedRate)+"): " + formatCurrency(fedTaxWitholdingRate) +
				"\n State Witholding: ("+ formatPercent(stateRate)+"): " +formatCurrency(stateTaxWitholdingRate) +
				"\n Total Deduction: " + formatCurrency(totalDeduction) +
				"\nNet Pay: " + formatCurrency(netPay));
		}
				
		public static String formatCurrency(double totalDeduction) {
			
			return DecimalFormat.getCurrencyInstance().format(totalDeduction);
			
		}
		
		public static String formatPercent(double percent) {
		
			return DecimalFormat.getPercentInstance().format(percent);
		

	}

}
