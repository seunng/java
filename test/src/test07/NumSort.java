package test07;

public class NumSort {
	public static void main(String[] args) {
	int[] arrNum = new int[4];
	arrNum[0] = 30;
	arrNum[1] = 20;
	arrNum[2] = 10;
	arrNum[3] = 15;
	
	for(int i=0;i<arrNum.length;i++) {
		for(int a=i+1;a<arrNum.length;a++) {
			if(arrNum[i]>arrNum[a]) {
				int tmp = arrNum[i];
				arrNum[i] = arrNum[a];
				arrNum[a] = tmp;		
			}
		}
	}
	for(int i=0;i<arrNum.length;i++) {
		System.out.println(arrNum[i]);
		}
	}
}