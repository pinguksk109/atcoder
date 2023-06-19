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
}
