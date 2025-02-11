package pro6;

public class if1 {

	public static void main(String[] args) {
		boolean money = false;
		if (money) {
			System.out.println("taxi");
		}
		if (!money) {
			System.out.println("walk");
		}

		boolean money2 = false;
		if (money2)
			System.out.println("taxi");
		System.out.println("change");
		if (!money2) {
			System.out.println("walk");
		}
		boolean money3 = false;
		if (money3) {
			System.out.println("taxi");
		} else {
			System.out.println("walk");
		}
		// command shift f :정
	}

}
