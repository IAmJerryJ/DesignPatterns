package BridgeTest;

public class BridgeTest {
	public static void main(String[] args) {
		Implementor imp = new ConcreteImplementorA();
		Abstraction abs = new RefinedAbstraction(imp);
		abs.operation();
	}
}

interface Implementor{
	public void OperationImpl();
}

class ConcreteImplementorA implements Implementor{
	public void OperationImpl() {
		System.out.println("Concrete implementor A has been called. ");
	}
}

class ConcreteImplementorB implements Implementor{
	public void OperationImpl() {
		System.out.println("Concrete implementor B has been called. ");
	}
}

abstract class Abstraction{
	protected Implementor imple;
	
	public Abstraction(Implementor imple) {
		this.imple = imple;
	}
	
	public abstract void operation();
}

class RefinedAbstraction extends Abstraction{
	public RefinedAbstraction(Implementor imple) {
		super(imple);
	}
	
	public void operation() {
		System.out.println("Refined Abstraction has been called. ");
		imple.OperationImpl();
	}
}