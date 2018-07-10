package test07;

public class MuiltLoop {
	public static void main (String[] args) {
		for(int i=1;i<10;i++) {
			System.out.println();
			for(int a=1;a<10;a++)
			System.out.println(a+"x"+i+"="+(i*a)+",");
		}
	}

}
