package test09;

public class Obj {
	int num = 3;
	boolean bl = true; //변수의 선언,메소드의 선언만 가능
	
	int getNum() {
		return 1;
	}
	String getStr() {
		return "abc";
	}
	
	
	void test() { //중가로는 함수의 선언
		int num =10 ;
		System.out.println(this.num); //위에 있는 num을 불러옴
		System.out.println("난 오비제이의 함수");

	}
	void test2() {
		System.out.println(num); //this가 생략된 것
		System.out.println(bl);
		test();
	}
	public static void main(String[] args) {
		Obj o = new Obj();
		o.test();
		
		
		/*메소드 두 가지가 있음. 리턴하는 것과 리턴하지 않는 것 다른말로는 나머지와 보이드
		*/
	}

}
