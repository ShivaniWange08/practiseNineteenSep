package practise;

public class AccessModifier {
	
	public void getMsg(String string){
		System.out.println("Public Access Modifier");
	}
	
	private void getMsg1(String str) {
		System.out.println("Private AM");
	}
	
	protected void getMsg2(String s) {
		System.out.println("Protected AM");
	}

}
