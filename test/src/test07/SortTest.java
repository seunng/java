package test07;

import java.util.Scanner;

public class SortTest {
	public static void main(String [] args) {
/*		int myP;
		myP = 20;
		int yourP = 10;
		
		int[] arr = new int[3]; //세 개의 방을 만드는 작업 - 처음 시작이 0이므로 0,1,2가 된다.
	}

		//선언만 해서는 안되고 초기화 시켜야지 0을 만들 수 있다.
		
		int[] arrNum= new int[5]; //int 데이터타입의 방을 새로 만드는 것 
		arrNum[0] = 10; // 0번째 방에 10이 대입되는 것
		arrNum[1] = 20;
		arrNum[2] = 70;
		arrNum[3] = 50;
		arrNum[4] = 40;
		
		for(int i=0;i<arrNum.length;i++) { //length를 쓰는 이유는 최대값일 경우를 생각해서 
			if(arrNum[i]%20==0 && arrNum[i]!=0) { 
			System.out.println(arrNum[i]);
			}
		}
		
		String[] arrStr = new String[5];
		arrStr[0] = "a";
		arrStr[1] = "b";
		arrStr[2] = "c";
		arrStr[3] = "d";
		arrStr[4] = "e";

		for(int i=0;i<arrStr.length;i++) {
			System.out.println(arrStr[i]);
			
			String str = "a,b,c,d,e";
			String[]arrStr = str.split(",");
			for(int i=0;i<arrStr.length;i++) {
				System.out.println(arrStr[i]);
			}

*/			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("학생들의 점수를 ,로 구분하여 입력 :");
			String pointStr = scan.nextLine();
			scan.close();
			
			String[] arrStr = pointStr.split(",");
			for(int i=0;i<arrStr.length;i++) {
				System.out.println(i+1+ "번째 점수:"+ arrStr[i]);
			
			int[]arrNum = new int[arrStr.length];
			arrNum[i] = Integer.parseInt(arrStr[i]);
			}
			for(arrStr[i]>arrStr[]) {
			int tmp = arrStr[i];
			arrStr[i] = arrStr[a];
			arrStr[a] = tmp;		
			}
			for(int i=0;i<arrStr.length;i++) {
				System.out.println(arrStr[i]);
	
			
			
	
	}

	}


		
