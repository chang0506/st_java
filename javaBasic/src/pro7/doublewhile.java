package pro7;

public class doublewhile {

	public static void main(String[] args) {
		int i = 0;

		while (i < 4) {
			System.out.println(i + 1 + "교시");
			int j = 0;
			while (j < 60) {
				int time = 0;
				if (j < 50) {
					time = j + 1;
					System.out.println("\t" + time + "분");
				} else {
					if (j == 50) {
						System.out.println("\t10분 쉬는시간");
					}
					time = j - 50 + 1;
					System.out.println("\t" + time + "분");
				}
				j++;
			}
			i++;
		}

	}

}
