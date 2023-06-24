package atcoder.beginners.selection.abc049c;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		sc.close();
		
		System.out.println(check(str));
	}
	
	public static String check(String str) {
		
		str = str.replaceAll("eraser", "");
		str = str.replaceAll("erase", "");
		str = str.replaceAll("dreamer", "");
		str = str.replaceAll("dream", "");

		if (str.length() == 0) {
			return "YES";
		} else {
			return "NO";
		}
	}
}
