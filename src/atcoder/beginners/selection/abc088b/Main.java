package atcoder.beginners.selection.abc088b;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer card = sc.nextInt();
		
		Integer[] cards = new Integer [card];
		for(int i = 0; i < card; i++) {
			cards[i] = sc.nextInt();
		}
		sc.close();
		
		calculateScore(cards);
	}
	
	public static void calculateScore(Integer[] cards) {
		int aliceScore = 0;
		int bobScore = 0;
		
		Arrays.sort(cards, Collections.reverseOrder());
		
		for(int i = 0; i < cards.length; i++) {
			if(i % 2 == 0) {
				aliceScore += cards[i];
			} else {
				bobScore += cards[i];
			}
		}
		System.out.println(aliceScore - bobScore);
	}
}
