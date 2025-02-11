package pro6;

public class input {

	public static void main(String[] args) {
		int m = 2000;
		boolean c = true;
		
		if(m >= 3000 && c) {
			System.out.println("taxi");
		}else if (m <= 3000 || c) {
			System.out.println("bus");
		}else {
			System.out.println("walk");
		}
	}
}
