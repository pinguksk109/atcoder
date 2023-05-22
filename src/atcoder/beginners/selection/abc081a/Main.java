package atcoder.beginners.selection.abc081a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		int s1 = Integer.parseInt(String.valueOf(str.charAt(0)));
		int s2 = Integer.parseInt(String.valueOf(str.charAt(1)));
		int s3 = Integer.parseInt(String.valueOf(str.charAt(2)));
		int i = 0;
		
		if(s1 == 1) {
			i++;
		}
		if(s2 == 1) {
			i++;
		}
		if(s3 == 1) {
			i++;
		}
		System.out.println(i);
	}
}
