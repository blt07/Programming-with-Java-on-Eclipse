import java.util.Locale;
import java.util.Scanner;

public class exercise25 {
	
//	Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//	começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//	exemplo.
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		for(int line = 1; line <= number;line++) {
			System.out.println(line + " " + line*line + " " + line*line*line);
				
			}
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
