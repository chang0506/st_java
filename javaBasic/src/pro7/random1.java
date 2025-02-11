package pro7;

public class random1 {

	public static void main(String[] args) {
		double rN = Math.random();
		System.out.println(rN);

		int i = 0;
		while (i < 10) {
			double rN2 = Math.random();
			System.out.println(rN2);
			i++;
		}
		int j = 0;
		while (j < 10) {
			double rN3 = Math.random();
			System.out.println((int)rN3 * 10);
			j++;
		}
	}
}
