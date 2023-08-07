import java.util.Scanner;

public class CalculatePay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the number of hours worked");
		double hoursWorked = scanner.nextDouble();
		
		System.out.println("Please enter the pay rate");
		double payRate = scanner.nextDouble();
		
		double pay = hoursWorked * payRate ;
		System.out.println("Employees pay is $"+ pay);
		
		
	}

}
