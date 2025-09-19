package practise;

public class Method {

	public void m1() {
		System.out.println("m1 called");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 called");
	}
	
	public void m3() {
		System.out.println("m3 called");
		m4();
	}
	
	public void m4() {
		System.out.println("m4 called");
	}
}
