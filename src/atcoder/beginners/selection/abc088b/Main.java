package atcoder.beginners.selection.abc088b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//不要だが、問題の入力の形に揃える為に必要
		Integer card = sc.nextInt();
		sc.nextLine();
		
		List<Integer> cards = new ArrayList<>();
		String str = sc.nextLine();
		String[] cardsString = str.split(" ");
		for(String cardString : cardsString) {
			int number = Integer.parseInt(cardString);
			cards.add(number);
		}
		
		sc.close();
		
		calculateScore(cards);
	}
	
	public static void calculateScore(List<Integer> cards) {
		int aliceScore = 0;
		int bobScore = 0;
		
		Collections.sort(cards, Collections.reverseOrder());
		
		for(int i = 0; i < cards.size(); i++) {
			if(i % 2 == 0) {
				aliceScore += cards.get(i);
			} else {
				bobScore += cards.get(i);
			}
		}
		System.out.println(aliceScore - bobScore);
	}
}
