package singleton;

public class SingletonLazy {
	public static void main(String[] args) {
		President zt1 = President.getInstance();
		zt1.getName();
		President zt2 = President.getInstance();
		zt2.getName();
		if(zt1 == zt2) {
			System.out.println("same President");
		}
		else {
			System.out.println("Differen President");
		}
	}
}
