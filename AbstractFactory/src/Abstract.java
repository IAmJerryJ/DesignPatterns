
public class Abstract {
	public static void main(String[] args) {
		AbstractFactory f1 = new ConcreteFactory1();
		AbstractFactory f2 = new ConcreteFactory2();
		Product1 p11 = f1.newProduct1();
		Product2 p21 = f1.newProduct2();
		Product2 p22 = f2.newProduct2();
		p11.show();
		p21.show();
		p22.show();
	}
}

interface Product1{
	public void show();
}

class Product11 implements Product1{
	public void show() {
		System.out.println("Shows Factory 1 produced product1");
	}
}

class Product12 implements Product1{
	public void show() {
		System.out.println("Shows Factory 2 produced product1");
	}
}

interface Product2{
	public void show();
}

class Product21 implements Product2{
	public void show() {
		System.out.println("Shows Factory 1 produced product2");
	}
}

class Product22 implements Product2{
	public void show() {
		System.out.println("Shows Factory 2 produced product2");
	}
}

interface AbstractFactory{
	public Product1 newProduct1();
	public Product2 newProduct2();
}

class ConcreteFactory1 implements AbstractFactory{
	public Product1 newProduct1() {
		System.out.println("Factory1 produced product1");
		return new Product11();
	}
	
	public Product2 newProduct2() {
		System.out.println("Factory1 produced product2");
		return new Product21();
	}
}

class ConcreteFactory2 implements AbstractFactory{
	public Product1 newProduct1() {
		System.out.println("Factory2 produced product1");
		return new Product12();
	}
	
	public Product2 newProduct2() {
		System.out.println("Factory2 produced product2");
		return new Product22();
	}
}