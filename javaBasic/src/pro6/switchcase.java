package pro6;

public class switchcase {

	public static void main(String[] args) {
		switch ("30") {
		case "10":
			System.out.println("10입니다");
		case "20":
			System.out.println("20입니다");
		case "30":
			System.out.println("30입니다");
		case "40":
			System.out.println("40입니다");
		case "50":
			System.out.println("50입니다");
		}
		String a = "30";
		switch ("a") {
		case "10":
			System.out.println("10입니다");
		case "20":
			System.out.println("20입니다");
		case "30":
			System.out.println("30입니다");
		case "40":
			System.out.println("40입니다");
		case "50":
			System.out.println("50입니다");
		default:
			System.out.println("그 외");

		}
	}
}
