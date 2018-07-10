package test01;

public class Condition {
	public static void main(String[] args) {
		
		boolean bl = 1!=1;
		
		if(bl) {
			System.out.println("1과1은 같다.");
		} else {	
			System.out.println("1과 1은 다르다.");
		}
		
		int age = 23;
		if(age>=20) {
			System.out.println("20대");
		}else if(age<=30){
			System.out.println("30대");
		}else if(age<=40){
			System.out.println("40대");
		}else {
			System.out.println("50대");//10대라고 써야함
		//적용되는 부분까지만 비교하고 끝낸다.
	    //else문은 비교문의 최하위로 더 else에 else는 쓸 수 없음
		}
		
	}

}
//==는 같냐는 것 =는 대입하는 것 != 맞냐고 물어보는 것 
