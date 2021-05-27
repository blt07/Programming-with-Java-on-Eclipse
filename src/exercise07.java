import java.util.Locale;
import java.util.Scanner;

public class exercise07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("TYpe a number:");
		int number = sc.nextInt();
		
		if(number < 0) System.out.print("It's negative!");
		
		if(number > 0) System.out.print("It's not negative");
		
		
		
		
		sc.close();

	}

}
