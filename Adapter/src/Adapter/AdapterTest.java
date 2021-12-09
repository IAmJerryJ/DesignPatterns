package Adapter;

public class AdapterTest {
	public static void main(String[] args) {
	System.out.println("Test Adapter: ");
	Target target = new ClassAdapter();
	target.request();
	}

}

interface Target{
	public void request();
}

class Adaptee{
	public void specificRequest() {
		System.out.println("Show request");
	}
}

class ClassAdapter extends Adaptee implements Target{
	public void request() {
		specificRequest();
	}
}