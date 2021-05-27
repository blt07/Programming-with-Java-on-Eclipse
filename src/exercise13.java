import java.util.Locale;
import java.util.Scanner;

public class exercise13 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type a coordinate x:");
		double axleX = sc.nextDouble();
		System.out.print("Type a coordinate y:");
		double axleY = sc.nextDouble();
		
		if (axleX > 0 && axleY > 0) System.out.println("Q1");
		else if (axleX < 0 && axleY > 0) System.out.println("Q2");
		else if (axleX < 0 && axleY < 0) System.out.println("Q3");
		else if (axleX > 0 && axleY < 0) System.out.println("Q4");
		else if (axleX == 0 && axleY == 0) System.out.println("Origin");
		else if (axleX == 0 && axleY > 0) System.out.println("Axle Y");
		else if (axleX > 0 && axleY == 0) System.out.println("Axlw X");
		else System.out.println("It's not defined!");
		
		
		
		sc.close();

	}

}
