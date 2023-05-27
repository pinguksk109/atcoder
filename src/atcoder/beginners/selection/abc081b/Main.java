package atcoder.beginners.selection.abc081b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		int[] values = new int[count];
		for(int i = 0; i < count; i++) {
			values[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println(calculate(values));
	}

	private static int calculate(int[] values) {
		
		List<Integer> result = new ArrayList<Integer>();
		for(int value : values) {
			int i = 0;
			while(value % 2 == 0) {
				value /= 2;
				i++;
			}
			result.add(i);
		}
		return Collections.min(result);
	}
}
