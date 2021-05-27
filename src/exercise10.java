import java.util.Locale;
import java.util.Scanner;
// Continuar a lista de exercicios. Aula 38.
public class exercise10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type a initial hour:");
		int number = sc.nextInt();
		System.out.print("Type the end hour:");
		int number2 = sc.nextInt();
		
		if(number > number2) System.out.printf("The game was during: %d hours", 24-number+number2);
		else if(number < number2) System.out.printf("The game was during: %d hours", number2-number);
		else System.out.printf("The game was during: 24 hours");
		
		sc.close();

	}

}
