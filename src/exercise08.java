import java.util.Locale;
import java.util.Scanner;

public class exercise08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("TYpe a number:");
		int number = sc.nextInt();
		
		if(number % 2 == 0) System.out.print("It's a even number!");
		
		else System.out.print("It's a odd number!");
		
		sc.close();

	}

}
