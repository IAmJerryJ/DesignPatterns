package demo1;

public class DecoratorTest {
	public static void main(String[] args) {
		Component comp = new ConcreteComponent();
		Decorator dec = new ConcreteDecorator(comp);
		dec.operation();
	}
}

interface Component{
	public void operation();
}

class ConcreteComponent implements Component{
	public ConcreteComponent() {
		System.out.println("Concrete Component has been created");
	}
	
	public void operation() {
		System.out.println("Conrete operation has been called");
	}
}

class Decorator implements Component{
	private Component component;
	public Decorator(Component component) {
		this.component = component;
	}
	
	public void operation() {
		component.operation();
	}
}

class ConcreteDecorator extends Decorator{
	public ConcreteDecorator(Component component){
		super(component);
	}
	
	public void operation() {
		super.operation();
		addedFunction();
	}
	
	public void addedFunction() {
		System.out.println("Added function has been called");
	}
}