import java.util.Locale;
import java.util.Scanner;

public class exercise19 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int number;
		
		do {
			System.out.println("Type a number between 1 <= 1000");
			number = sc.nextInt();
		}while(number < 0 || number>1000);
		
		for (int count = 1; count <= number; count+=2) {
			System.out.println(count);
		}
		
		
		sc.close();
	}

}
