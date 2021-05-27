import java.util.Locale;
import java.util.Scanner;

public class exercise20 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int number;
		int value;
		int countIn = 0;
		int countOut = 0;
		
		System.out.println("Type a number between 1 <= 1000");
		number = sc.nextInt();
		
		for (int count = 1; count <= number; count++) {
			value = sc.nextInt();
			if (value >= 10 && value <=20) countIn++;
			else countOut++;
		}
		
		System.out.println(countIn + " in");
		System.out.println(countOut + " out");
		sc.close();
	}

}
