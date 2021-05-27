import java.util.Locale;
import java.util.Scanner;

public class exercise06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] variables = new double[3];
		int count = 0;
		
		while(count <= 2) {
		System.out.printf("Type the %d value:",count +1);
		variables[count] = sc.nextDouble();
		count++;
		}
		
		System.out.printf("Triangle: %.3f ",variables[0]*variables[2]/2);
		System.out.printf("Circle: %.3f ",variables[2]*variables[2]*3.14159);
		System.out.printf("Trapeze: %.3f ",((variables[0]+variables[1])/2) * variables[2]);
		System.out.printf("Square: %.3f ",Math.pow(variables[1],2));
		System.out.printf("Rectangle: %.3f ",variables[0]*variables[1]);
		
		sc.close();

	}

}
