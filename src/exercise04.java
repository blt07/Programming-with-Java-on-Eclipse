import java.util.Scanner;
import java.util.Locale;
public class exercise04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type your identificate number:");
		int identificateNumber = sc.nextInt();
		
		System.out.print("Type your hours worked:");
		double hoursWorked = sc.nextDouble();
		
		System.out.print("Type your salary:");
		double salaryPerHour = sc.nextDouble();
		
		double salary = hoursWorked * salaryPerHour;
		
		System.out.printf("Number: %d    Salary: %.2f" , identificateNumber,salary);
		
		
		sc.close();

	}

}
