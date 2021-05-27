import java.util.Locale;
import java.util.Scanner;
// Parei no exercicio 4 e na aula 55
public class exercise21 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double result1,result2,result3;
		
		System.out.println("Type the quantity of tests:");
		int numberOfCases = sc.nextInt();
		
		for(int i = 0; i<numberOfCases; i++) {
			System.out.println("Type the first note");
			result1 = sc.nextDouble();
			System.out.println("Type the second note:");
			result2 = sc.nextDouble();
			System.out.println("Type the third note:");
			result3 = sc.nextDouble();
			System.out.printf("Media: %.1f /ln",result1*0.2+result2*0.3+result3*0.5);
		}
		
		sc.close();
	}

}
