package AbstractFactory;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		try {
			AbstractFactory af = new ConcreteFactory1();
			Product hi = af.newProduct();
			hi.show();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

interface Product{
	public void show();
}

class concreteProduct1 implements Product{
	public void show() {
		System.out.println("Concrete product 1 shows: ...");
	}
}

class concreteProduct2 implements Product{
	public void show() {
		System.out.println("Concrete product 2 shows: ...");
	}
}

interface AbstractFactory{
	public Product newProduct();
}

class ConcreteFactory1 implements AbstractFactory{
	public Product newProduct() {
		System.out.println("Concrete Factory 1 creating -> Concrete Product 1");
		return new concreteProduct1();
	}
}

class ConcreteFactory2 implements AbstractFactory{
	public Product newProduct() {
		System.out.println("Concrete Factory 2 creating -> Concrete Product 2");
		return new concreteProduct2();
	}
}