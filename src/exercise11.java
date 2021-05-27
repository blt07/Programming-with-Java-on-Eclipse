import java.util.Locale;
import java.util.Scanner;

public class exercise11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("__________________________");
		System.out.println("|CODE  |   FOOD  |  PRICE |");
		System.out.println("|  1   |  HOTDOG |  $4,00 |");
		System.out.println("__________________________");
		System.out.println("|  2   | X-SALAD |  $4,50 |");
		System.out.println("__________________________");
		System.out.println("|  3   | X-BACON |  $5,00 |");
		System.out.println("__________________________");
		System.out.println("|  4   | TORRADA |  $2,00 |");
		System.out.println("__________________________");
		System.out.println("|  5   |  SODA   |  $1,50 |");
		System.out.println("__________________________");
		
		System.out.print("Type your order");
		int number = sc.nextInt();
		System.out.print("How many itens do you have?");
		double number2 = sc.nextDouble();
		
		
		switch(number) {
		case 1:
			System.out.printf("Total: %.2f", number2*4);
			break;
		case 2:
			System.out.printf("Total: %.2f", number2*4.5);
			break;
		case 3:
			System.out.printf("Total: %.2f", number2*5);
			break;
		case 4:
			System.out.printf("Total: %.2f", number2*2);
			break;
		case 5:
			System.out.printf("Total: %.2f", number2*1.5);
			break;
		
		}
		
		sc.close();
		

	}

}
