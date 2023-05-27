package atcoder.beginners.selection.abc087b;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] coins = new int[3];
		for(int i = 0; i < coins.length; i++) {
			coins[i] = scanner.nextInt();
		}
		int money = scanner.nextInt();
		scanner.close();
		
		System.out.println(countCoinCombination(coins, money));
	}
	
	private static int countCoinCombination(int[] coins, int money) {
		
		int count = 0;
		for(int i = 0; i <= coins[0]; i++) {
			for(int j = 0; j <= coins[1]; j++) {
				for(int k = 0; k <= coins[2]; k++) {
					int total = 500 * i + 100 * j + 50 * k;
					if(total == money) {
						count++;
					}
				}
			}
		}
		return count; 
	}
}
