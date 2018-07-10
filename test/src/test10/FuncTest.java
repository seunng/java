package test10;

public class FuncTest {
	int a = 4;
	int b = 8;
	
	public void add(int a, int b ) {
		System.out.println("인트더하기 : " + (a+b));
		
	}
	public void add(long a, long b ) {
		System.out.println("롱더하기 : " + (a+b));
	}
		
	public static void main(String [] args) {
		FuncTest ft = new FuncTest();
		ft.add(1,2);
		ft.add(1l,2l);
		
		
		
	}

}
