import java.util.Locale;
import java.util.Scanner;

public class exercise14 {
// Parei no Video 42
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type your salary:");
		double salary = sc.nextDouble();
		
		if (salary <= 2000) System.out.println("Isento");
		else if (salary > 2000 && salary<=3000) System.out.printf("R$ %.2f",(salary-2000)*0.08);
		else if (salary > 3000 && salary<4500) System.out.printf("R$ %.2f",80+(salary-3000)*0.18);
		else if (salary >= 4500) System.out.printf("R$ %.2f",80+1500*0.18+(salary-4500)*0.28);
		else System.out.println("It's not defined");
		
		sc.close();


	}

}
