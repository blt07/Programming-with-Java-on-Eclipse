import java.util.Locale;
import java.util.Scanner;

public class exercise05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] codeOfPeace = new int[2];
		int[] numberOfPeaces = new int[2];
		double[] priceOfPeace = new double[2];
		int count = 0;
		double plus = 0;
		
		while(count<=1) {
			System.out.printf("Type the code of %d piece:",count +1);
			codeOfPeace[count] = sc.nextInt();
			System.out.printf("Type the %d piece:",count +1);
			numberOfPeaces[count] = sc.nextInt();
			System.out.printf("Type the %d piece:",count +1);
			priceOfPeace[count] = sc.nextDouble();
			plus = plus + numberOfPeaces[count]*priceOfPeace[count];
			count++;
			
		}
		
		System.out.print(plus);
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
