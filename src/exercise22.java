import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

public class exercise22 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double number1,number2;
		
		System.out.println("Type a quantity of numbers:");
		double number = sc.nextDouble();
		
		for(int count = 0; count < number; count++) {
			number1 = sc.nextDouble();
			number2 = sc.nextDouble();
			if(number2 != 0) System.out.println(number1/number2);
			else System.out.println("It's impossible calculate it!");
		}
		
		
		
		sc.close();

	}

}
