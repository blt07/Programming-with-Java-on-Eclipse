import java.util.Locale;
import java.util.Scanner;

//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
public class exercise15 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type your password:");
		double password = sc.nextDouble();
		
		while(password != 2002) {
			System.out.println("Your password is WRONG!");
			System.out.println("Type your password:");
			password = sc.nextDouble();
		}
		
		System.out.println("Your password is correct");
		
		
		
		sc.close();

	}

}
