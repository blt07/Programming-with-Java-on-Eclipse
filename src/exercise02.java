import java.util.Scanner;

public class exercise02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type the circumference radius:");
		double radius = sc.nextDouble();
		System.out.printf("AREA: %.4f",Math.pow(radius,2) * 3.14159);
		
		
		sc.close();

	}

}
