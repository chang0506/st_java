package pro6;

public class if2 {

	public static void main(String[] args) {
		int sc = 85;
		String result = null;
		if (sc < 0 || sc > 100) {
			System.out.println("error");
			result = "계산불가";
		} else {
			if (sc > 89) {
				System.out.println("90점대");
				result = "A";
			} else {
				if (sc > 79) {
					System.out.println("80점대");
					result = "B";
				} else {
					if (sc > 69) {
						System.out.println("70점대");
						result = "C";
					} else {
						if (sc > 59) {
							System.out.println("60점대");
							result = "D";
						} else {
							System.out.println("0~59");
							result = "F";
						}

					}
				}
			}
		}
	}
}
