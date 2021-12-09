package singleton;

public class President {
	private static volatile President instance = null;
	
	private President() {
		System.out.println("Create a new president");
	}
	
	public static synchronized President getInstance() {
		if(instance == null) {
			instance = new President();
		}
		else {
			System.out.println("Already have a president");
		}
		return instance;
	}
	
	public void getName() {
		System.out.println("I'm Trump");
	}
}
