package pro4;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder StringB = new StringBuilder();
		System.out.println(StringB);
		
		StringB.append("이름: ");
		StringB.append("전창현");
		StringB.delete(1,2);
		
		System.out.println(StringB.toString());
	}
}
