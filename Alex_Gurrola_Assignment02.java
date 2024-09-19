package pack1;

import javax.swing.JOptionPane;

public class Assignment02 {

	public static void main(String[] args) {
		
		String firstName;
		Character middleInitial;
		String lastName;
		int age;
		double grossAnnualPay;
		double taxRate;
		double netAnnualPay;
		
		firstName = JOptionPane.showInputDialog("First name: ");
		
		String middle = JOptionPane.showInputDialog("Middle initial: ");
		middleInitial = middle.charAt(0);
		
		lastName = JOptionPane.showInputDialog("Last name: ");
		
		String yourAge = JOptionPane.showInputDialog("Age: ");
		age = Integer.parseInt(yourAge);
		
		String gross = JOptionPane.showInputDialog("Gross Annual Pay: ");
		grossAnnualPay = Double.parseDouble(gross);
		
		String tax = JOptionPane.showInputDialog("Tax rate: ");
		taxRate = Double.parseDouble(tax);
		
		netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);
		
		System.out.printf("Hello %s %c %s, \n"
				+ "You are %d years old now.\n"
				+ "It is amazing that you made $%.2f this year. "
				+ "with the tax rate of %.2f, you can take home $%.2f."
				, firstName, middleInitial, lastName, age, grossAnnualPay, taxRate, netAnnualPay);
							
	}
}
