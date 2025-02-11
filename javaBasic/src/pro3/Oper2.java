package pro3;

public class Oper2 {
	
	public static void main(String[] args) {
// 관계연산
		System.out.println(10 >5);
		
		boolean result = 10 > 5;
		System.out.println(result);
		
		boolean result2 = 10 == 5;
		System.out.println(result2);
		
		boolean result3 = 10 != 5;
		System.out.println(result3);
		
		boolean result4 = 10 < 5;
		System.out.println(result4);
		
		System.out.println("" + result + result2);
/*
 * 논리연산 : boolean 끼리 연산하는 것
 * AND연산 (&&) = 곱
 * T && T -> T
 * T && F -> F
 * F && F -> F
 * 회원가입 할때 사용됨.
 * 아이디 영문 맞는지 비밀번호 숫자영어 특수기호 조합이 제대로 사용되었는지
 * 
 * OR연산(||) = 합
 * T || T -> T
 * T || F -> T
 * F || F -> F
 * 
 * NOT연산(!) = 부정
 * !T -> F
 * !F -> T
 * 
 * !(T && F ) -> T
 * 
 */
		System.out.println(!true);
		System.out.println(2000 % 4 == 0 && 2000 % 100 != 0);
		System.out.println(2000 % 4 == 0 && 2000 % 100 != 0 && 2000 % 5 == 0);
	}
}
