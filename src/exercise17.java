import java.util.Locale;
import java.util.Scanner;

public class exercise17 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x,y;
		
		do{
			
			System.out.println("Type a number x");
			x = sc.nextDouble();
			System.out.println("Type a number y");
			y = sc.nextDouble();
			
			if(x>0 && y>0) System.out.println("Primeiro");
			else if(x<0 && y>0) System.out.println("Segundo");
			else if(x<0 && y<0) System.out.println("Terceiro");
			else if(x>0 && y<0) System.out.println("Quarto");
		
		}while(x != 0 && y != 0);
		
		sc.close();

	}

}
