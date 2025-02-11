package pro7;

import java.util.Random;

public class random2_2 {

	public static void main(String[] args) {
		Random r = new Random();
		int i = 0;
		int temp = 0;
		while (i < 10) {
			int rN = r.nextInt(10);
			System.out.println("temp" + temp);
			System.out.println("new temp" + rN + "\n");
			if (i == 0) {
				temp = rN;
			} else {
				if (temp < rN) {
					temp = rN;
				}
			}
			i++;
		}
		System.out.println("최대값: " + temp);

	}

}
