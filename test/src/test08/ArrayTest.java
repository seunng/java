package test08;

public class ArrayTest {
	public static void main(String [] args) {
	
		int[] arr = new int[2];
		
		arr[0] = 12;
		arr[1] = 12;
		arr[2] = 12;
		
		for(int i =0;i<arr.length;i++) {
			for(int a= i+1;i<arr.length;a++) {
				if(arr[i]>arr[a]) {
					int imp = arr[i];
				     arr[i] = arr[a];
				     arr[a] = tmp;
				}
			}
				}
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}
	}
	
}
