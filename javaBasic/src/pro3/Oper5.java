package pro3;

public class Oper5 {

	public static void main(String[] args) {
		
		int score = 85;
		String result = null;
		
		result = score < 0 || score > 100 ? "계산불가"
				:score > 89 ? "A"
						:score > 79 ? "B"
								: score > 69 ? "c"
										: "F";
		System.out.println(result);

	}

}
