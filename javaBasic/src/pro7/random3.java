package pro7;

import java.util.Random;

public class random3 {

	public static void main(String[] args) {
		Random r = new Random();
		int i = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;

		while (i < 20) {
			a = r.nextInt(50);
			b = r.nextInt(50);
			c = r.nextInt(50);

			if (a > b) {
				if (max < a) {
					max = a;
				}
			} else {
				if (max < b) {
					max = b;
				}

			}
			if (max < c) {
				max = c;
			}
			i++;
		}
		System.out.println("max = " + max);
	}
}
