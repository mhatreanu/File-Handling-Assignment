import java.util.*;
import java.lang.Math;
public class Armstrong {
	public static void main(String[] args) {
		int number;
		int number1;
		int remainder; 
		int sum = 0;
		int number2;
		int count=0;
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		number1=number;
		number2=number;
		while (number != 0) {
			number=number/10;
			count++;			
		}
	
		System.out.println(count);

		while (number2 != 0) {
			remainder = number2 % 10;
			sum = sum + (int)Math.pow(remainder,count);
			number2 = number2 / 10;
		}
		if (sum == number1) {
			System.out.println("Armstrong Number");
		} 
		else {
			System.out.println("Not Armstrong Number");
		}
		Scanner.close();
	}
	
}
