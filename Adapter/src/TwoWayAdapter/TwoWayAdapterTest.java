package TwoWayAdapter;

public class TwoWayAdapterTest {
	public static void main(String[] args) {
		TwoWayAdaptee adaptee = new AdapteeRealize();
		TwoWayTarget target = new TwoWayAdapter(adaptee);
		target.request();
		
		TwoWayTarget target2 = new TargetRealize();
		TwoWayAdaptee adaptee2 = new TwoWayAdapter(target2);
		adaptee2.specificRequest();
	}
}

interface TwoWayTarget{
	public void request();
}

interface TwoWayAdaptee{
	public void specificRequest();
}

class TargetRealize implements TwoWayTarget{
	public void request() {
		System.out.println("Target code has been used: basic request");
	}
}

class AdapteeRealize implements TwoWayAdaptee{
	public void specificRequest() {
		System.out.println("Adaptee code has been used: specific request");
	}
}

class TwoWayAdapter implements TwoWayTarget, TwoWayAdaptee{
	private TwoWayTarget target;
	private TwoWayAdaptee adaptee;
	
	public TwoWayAdapter(TwoWayTarget target) {
		this.target = target;
	}
	
	public TwoWayAdapter(TwoWayAdaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	public void request() {
		adaptee.specificRequest();
	}
	
	public void specificRequest() {
		target.request();
	}
}