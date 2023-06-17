package atcoder.beginners.selection.abc05b;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer mochiNumber = sc.nextInt();
		Integer[] diameters = new Integer[mochiNumber];
		
		for(int i = 0; i < mochiNumber; i++) {
			diameters[i] = sc.nextInt();
		}
		sc.close();
		
		getAvailableMochi(diameters);
	}
	
	public static void getAvailableMochi(Integer[] diameters) {
		Set<Integer> uniqueDiameters = new HashSet<>();
		for(int num : diameters) {
			uniqueDiameters.add(num);
		}
		System.out.println(uniqueDiameters.size());
	}
}
