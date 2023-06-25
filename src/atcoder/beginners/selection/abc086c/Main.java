package atcoder.beginners.selection.abc086c;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer N = sc.nextInt();
		int[] t = new int[N];
		int[] x = new int[N];
		int[] y = new int[N];
	
		for(int i = 0; i < N; i++) {
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println(isPlanExecutable(N, t, x, y));
		
	}

	private static boolean isPlanExecutable(Integer N, int[] x, int[] y, int[] t) {
		
		int T = 0;
		int X = 0;
		int Y = 0;
		
		for(int i = 0; i < N; i++) {

			int dt = Math.abs(T - t[i]);
			int dist = Math.abs(X - x[i]) + Math.abs(Y - y[i]);
			
			if ((t[i] + x[i] + y[i]) % 2 != 0 || dt < dist) return false;
			
			T = t[i];
			X = x[i];
			Y = y[i];
           
		}
        return true;
	}
}

