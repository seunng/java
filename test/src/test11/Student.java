package test11;

public class Student {
	private String clazz;
	private String name;
	private int grade;
	
	public void setterC(String clazz) {
		this.clazz = clazz;
	}
	public void setterN(String name) {
		this.name = name;
	}
	public void setterG(int grade) {
		this.grade = grade;
	}
	
	public void println() {
		System.out.println(clazz);
		System.out.println(name);
		System.out.println(grade);
	}
}
