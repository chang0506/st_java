package pro7;

import java.util.Random;

public class random2 {

	public static void main(String[] args) {
		Random r = new Random();
		int rN = r.nextInt(10);
		System.out.println(rN);

		int i = 0;
		while (i < 10) {
			int rN2 = r.nextInt();
			System.out.println(rN2);
			i++;
		}
	}
}
