package atcoder.beginners.selection.abc083b;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int upper = scanner.nextInt();
		int min = scanner.nextInt();
		int max = scanner.nextInt();
		scanner.close();
		
		System.out.println(calculateSum(upper, min, max));
	}
	
	private static int calculateSum(int upper, int min, int max) {
		int sum = 0;
		
		for(int i = 1; i <= upper; i++) {
			int digitSum = calculateDigitSum(i);
			
			if(digitSum >= min && digitSum <= max) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	private static int calculateDigitSum(int num) {
		int sum = 0;
		
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		return sum;
	}
}
 