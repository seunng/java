package test07;

import java.util.Scanner; //ctrl shift o

public class Condition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 출력값을 넣어줘야하기 때문에 스캐너를 넣음
		System.out.println("시작값을 정해주세요 :");
		String startNum = scan.nextLine();
		System.out.println("종료값을 정해주세요 :");
		String endNum = scan.nextLine();

		
/*		 System.out.printf("start :%s, end :%s, startNum, endNum");
		 System.out.println("start: "+startNum +", end : "+endNum") 
		 scan.close();*/
		 

		// for문은(비교문) string 허용안됨 - integer로 변경하여 사용하게해줌

		int sNum = Integer.parseInt(startNum);
		int eNum = Integer.parseInt(endNum);

		if (sNum > eNum) {
			int tmp = sNum;
			sNum = eNum;
			eNum = tmp;
		}
		for (int i = sNum; i <= eNum; i++){
			System.out.println(i);
		}
		scan.close();
	}
}