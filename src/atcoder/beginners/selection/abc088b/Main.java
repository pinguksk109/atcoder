package atcoder.beginners.selection.abc088b;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int card = sc.nextInt();

		
//		// 
//		Scanner str = new Scanner(System.in);
//        String[] array = new String[card];
//	    for (int i = 0; i < card; i++) {
//			array[i] = str.next();
//	    }
		
		int[] cards = new int [card];
		for(int i = 0; i < card; i++) {
			cards[i] = sc.nextInt();
		}
		sc.close();
		
		Score(cards);
	}
	
	public static void Score(int[] cards) {
		int aliceScore = 0;
		int bobScore = 0;
		
        for (int i = cards.length - 1; i >= 0; i -= 2) {
            aliceScore += cards[i];

            if (i - 1 >= 0) {
                bobScore += cards[i - 1];
            }
        }
		
		System.out.println(aliceScore - bobScore);
	}
}
