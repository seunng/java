package test12;

public class PrintObject {
	String str = "poStr";
	
	public String toString() {
		return "이 클래스의 str이란 변수는 " + str + " 이라는 값을 가지고 있죠";
	}
	
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(str);
	
		PrintObject po = new PrintObject();
		System.out.println(po.str);
	}

}
