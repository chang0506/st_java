package pro4;

public class String1 {

	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.println("\"안녕\"하세요");
		
		String addr = "경남 양산시 평산동";
		
		int index = addr.indexOf("시");
		System.out.println(index);
		
		String subAddr = addr.substring(0,4);
		System.out.println(subAddr);
// intdexOf 문자열에서 해당 문자열의 값의 위치
// substring 문자열에서 범위를 지정하여 문자열 잘라주기
		String pro = "부산광역시 서구 부민동";
		int index_pro = pro.indexOf("부");
		int index_pro1 = pro.lastIndexOf("부");
		String result = pro.substring(index_pro,index_pro1 - 1);
		System.out.println(result);
		
		String repl = pro.replace(' ','-');
		System.out.println(repl);
//replace 는 문자열은 바꿀수없다 문자형만 가능
		String repl2 = pro.replaceAll(" 서","-");
		System.out.println(repl2);
//replaceAll 은 문자열을 바꿀수있다.
		String Pn = "010/3333/2222, 010/2323/4555";
		
		String rePn = Pn.replaceAll("010", "011")
				.replaceAll("/","-")
				.replaceAll(", ","/");
		System.out.println(rePn);
	}
}
