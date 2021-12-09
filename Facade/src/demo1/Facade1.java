package demo1;

public class Facade1 {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.method();
	}
}

class Facade{
	private SubSystem01 obj1 = new SubSystem01();
	private SubSystem02 obj2 = new SubSystem02();
	private SubSystem03 obj3 = new SubSystem03();
	
	public void method() {
		obj1.method();
		obj2.method();
		obj3.method();
	}
}

class SubSystem01{
	public void method(){
		System.out.println("Method 1");
	}
}

class SubSystem02{
	public void method(){
		System.out.println("Method 2");
	}
}

class SubSystem03{
	public void method(){
		System.out.println("Method 3");
	}
}
