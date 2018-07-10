package test01;

public class DataType {
	
	//class 파일로 컴파일 후 실행된다는 것을 생각하자
	public static void main(String[] args) {
	//소문자: 정해진 데이터타입, 대문자: 정해지지X 데이터타입
	
	//변수라는 것을 선언하기 위해서는 데이터타입 지정
	//데이터타입 변수명; <- 변수의 선언
	//데이터타입 변수명 = 데이터타입 알맞은 값 <- 변수의 초기화
	//자바에서는 변수의 선언만으로는 해당 변수를 사용 X
	    //규칙
		//-클래스면(자바명)반드시 첫글자 대문자
		//만약에 두개의 단어가 합쳐질경우 두번째 첫글자도 대문자
		//변수명 영문 소문자로 시작
		// - 만약 두 개의 단어 합쳐질경우 두번째 단어의 첫글자 대문자
		// (세번째도 이하 동일)
		
		//정수형
		byte b = 127;
		short s = 1543;
		int i = 18684; //기본 데이터타입
		long l = 416846l;
		
		float f = 1.24f;
		double d = 12.5;//기본 데이터타입
		
		char c = '전'; //한 글자(코따옴표)
		
		boolean bl = true;//조건문,분기문,조건식
		bl = false;
		//원시형 데이터타입(정해짐)
		
		String str = "전승현"; //문자열
		//정해지지 않은 데이터타입
		
		//변수명의 규칙: 1. 첫글자는 소문자
		//2. class의 첫글자는 대문자,두번째 단어의 첫글자도 대문자
		
		//=는 무조건 대입이다. 수식일 경우 연산 후에 대입해야한다.
		//==는 앞과 뒤가 같은지를 물어보는 것.
		
		int a = 2;
		int c = 4;
		
		System.out.println(a=c);
		System.out.println(a!=c);
		System.out.println(a>c);
		System.out.println(a<=c);
		System.out.println(a>=c);
		
		
		
	}

}
