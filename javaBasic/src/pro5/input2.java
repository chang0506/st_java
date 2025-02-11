package pro5;

import java.util.Scanner;

public class input2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.next();
		
		System.out.print("생일: ");
		int bir = sc.nextInt();
		
		sc.nextLine(); //버퍼
		System.out.print("주소: ");
		String add = sc.nextLine();
		
		System.out.print("연락처: ");
		String phone = sc.next();
		
		System.out.println("사용자의 이름은 "+ name 
				+"이고 생일은 "+ bir + "입니다.\n"
				+"주소는 "+ add + "에 거주합니다.\n"
				+"연락처는 "+phone+"입니다.");
		

	}

}
