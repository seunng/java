package test09;

public class Person {
	private String name;
	private int age;
	private String address;
	
	public void setName(String name) {
		this.name = name;	
	}
	public void setAge(int age) {
		this.age = age;	
	}
	public void setaddress(String address) {
		this.address = address;	
	}

/*	public String toString() {
		String str = "내 이름은 : " + this.name;
		str += "내 나이는 : " + this.age;
		str += "내 주소는 : " + this.address;
		return str;
	}
*/
	public String getName() {
		return this.name;
	}
}

