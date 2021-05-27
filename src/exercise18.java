import java.util.Locale;
import java.util.Scanner;

public class exercise18 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double choice;
		int contA = 0, contG = 0, contD = 0;
		
		do{
		System.out.println("Type 1 for Alcohol, 2 for gas, 3 for diesel or 4 to quit.");
		choice = sc.nextDouble();	
		if (choice == 1) contA++;
		else if (choice == 2) contG++;
		else if (choice == 3) contD++;
		else if (choice == 4) break;
		}while((choice != 1 || choice != 2 || choice !=3));
		
		System.out.println("Muito Obrigado!");
		System.out.println("ALcohol: " + contA );
		System.out.println("Gas: " + contG );
		System.out.println("Diesel: " + contD );
		sc.close();

	}

}
