import java.util.Locale;
import java.util.Scanner;

// Ler um número inteiro N e calcular todos os seus divisores.

public class exercise24 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		for(int count = 1; count <= number;count++) {
			if(number % count == 0) System.out.println(count);
		}
		
		
		sc.close();
	}

}
