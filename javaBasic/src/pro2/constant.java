package pro2;

public class constant {

	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM = 0;
// 바뀌지 않는 상수는 앞에 final 웬만하면 대문자로 변수지정
		int num = 10;
		
		num = 11;
		
		System.out.println("최댓값: "+MAX_NUM);
		System.out.println("최솟값: "+MIN_NUM);
		System.out.println("현재값: "+num);
	}

}
