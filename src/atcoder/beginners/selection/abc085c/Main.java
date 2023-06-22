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

	private static String getTotalAmount(Integer moneyCount, Integer sumMoney) {
		int i = 0;
		for(int x = 0; x <= moneyCount; x++) {
			for(int y = 0; y <= moneyCount - x; y++) {
				int remainingMoney = sumMoney - (10000 * x + 5000 * y);
				int yRemaining = moneyCount - x - y;
				
				if(remainingMoney == 1000 * yRemaining) {
					System.out.println(x + " " + y + " " + yRemaining);
					i++;
					return "end";
				}
			}
		}
		if(i == 0) {
			System.out.println("-1 -1 -1");
		}
		return "end";
	}
}
