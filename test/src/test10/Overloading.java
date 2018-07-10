package test10;

public class Overloading {
	int a = 3; // 이 메모리를 가져오려면 무조건 메모리를 새로 만들어야 한다. 또한 사용된 변수명은 다시 사용할 수 없음
	
	public void test() {

	}
	public int test(int a) {
		return 0;
		
	}
	public int test(String a) {
		return 0;
	}
	public void test(String b, int a) {
		
	}

	public static void main(String[] args) {

		
/*   	Overloading ot = new Overloading(); //메모리를 새로 만드는 작업
		ot.a = 10;
		ot.test(2); //위에 test(int a)를 말함
*/		
		
	}

}
