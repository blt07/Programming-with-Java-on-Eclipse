import java.util.Scanner;

public class exercise01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type the first number:");
		int num1 = sc.nextInt();
		System.out.print("Type the second number:");
		int num2 = sc.nextInt();
		System.out.print("SUM:" + (num1 + num2));
		
		
		
		sc.close();

	}

}
