package atcoder.beginners.selection.abc085c;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer moneyCount = sc.nextInt();
		Integer sumMoney = sc.nextInt();
		sc.close();
		
		getTotalAmount(moneyCount, sumMoney);
	}

	private static void getTotalAmount(Integer moneyCount, Integer sumMoney) {
		
		for(int x = 0; x <= moneyCount; x++) {
			for(int y = 0; y <= moneyCount - x; y++) {
				int remainingMoney = sumMoney - (10000 * x + 5000 * y);
				int yRemaining = moneyCount - x - y;
				
				if(remainingMoney == 1000 * yRemaining) {
					System.out.println(x + " " + y + " " + yRemaining);
					break;
				} else {
					System.out.println("-1 -1 -1");
				}
			}
		}
	}
}
