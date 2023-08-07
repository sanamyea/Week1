import java.util.Scanner;
public class HoursWorked {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	System.out.println("Please enter the number of hours worked in a day");
	int hoursDay = scanner.nextInt();
	
	int hoursWeek = hoursDay * 5;
	int hoursYear = hoursDay * 252;
	
	System.out.println("The number of hours worked in a week is " + hoursWeek) ;
	System.out.println("The number of hours worked in a year is " + hoursYear) ;
	
	
	
	}

}
