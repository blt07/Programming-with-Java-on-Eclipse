import java.util.Locale;
import java.util.Scanner;

public class exercise23 {
// Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
// Lembrando que, por definição, fatorial de 0 é 1.
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type a number");
		double number = sc.nextDouble();
		double factorial = 1;
		
		for(double count = number; count >=1;count--) {
			factorial = factorial*count;
		}
		
		System.out.println("Result: " + factorial);
		
		
		
		
		
		
		sc.close();

	}

}
