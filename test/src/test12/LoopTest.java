package test12;


public class LoopTest {
	public static void main(String[] args) {

		int[] arr = new int[10];
		for(int i=0;arr.length>i;i++) {
			arr[i] = (i+1)*3;
		}
		for(int i=0;arr.length>i;i++) {
				System.out.println(arr[i]);
			
			}
		}
	}