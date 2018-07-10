package test12;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 1부터 5까지 중 하나를 입력하시오");
		String numStr = scan.nextLine();
		int num = Integer.parseInt(numStr);
		if (num == 1) {
			System.out.println("1등");
		} else if (num == 2) {
			System.out.println("2등");
		} else if (num == 3) {
			System.out.println("3등");
		} else {
			System.out.println("다시");
			System.out.println("입력한 숫자: " + numStr);
			
		}
	}
}
