import java.util.Locale;
import java.util.Scanner;

public class exercise09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type a number:");
		int number = sc.nextInt();
		System.out.print("Type other number:");
		int number2 = sc.nextInt();
		
		if((number%number2 == 0) || (number2%number == 0)) System.out.print("It's multiple!");
		else System.out.print("It's not multiple!");
		
		
		sc.close();

	}

}
