import java.util.Scanner;

public class exercise03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[4];
		int count = 0;
		
		while(count<=3) {
			System.out.printf("Type number %d:",count+1);
			numbers[count] = sc.nextInt();
			count++;
		}
		int difference = numbers[0]*numbers[1]-numbers[2]*numbers[3];
		System.out.printf("Difference: %d",difference);
		
		
		
		
		
		
		sc.close();
		

	}

}
