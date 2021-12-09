package ObjectAdapter;

public class ObjectAdapterTest {
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee(); 
		Target target = new ObjectAdapter(adaptee);
		target.request();
	}
}

interface Target{
	public void request();
}

class Adaptee{
	public void specificRequest() {
		System.out.println("Code has been used.");
	}
}

class ObjectAdapter implements Target{
	private Adaptee adaptee;
	
	public ObjectAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	public void request() {
		adaptee.specificRequest();
	}
}

