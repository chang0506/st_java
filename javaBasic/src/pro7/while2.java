package pro7;

import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		System.out.print("input: ");
		n = sc.nextInt();
		
		int i = 0;
		while(i < n) {
			System.out.println("i = "+(i+1));
			i++;
		}
		i = 0;
		while(i < n) {
			System.out.println("i = "+(n-i));
			i++;
		}
	}

}
