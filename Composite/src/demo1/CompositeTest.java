package demo1;

import java.util.ArrayList;

/*
 * composite pattern
 * @ Runde Jia
 * 
 */
public class CompositeTest {
	public static void main(String[] args) {
		Component composite1 = new Composite();
		Component composite2 = new Composite();
		Component leaf1 = new Leaf("1");
		Component leaf2 = new Leaf("2");
		Component leaf3 = new Leaf("3");
		composite1.add(leaf1);
		composite2.add(leaf2);
		composite2.add(leaf3);
		composite1.operation();
		composite2.operation();
	}
}

interface Component{
	public void add(Component c);
	public void remove(Component c);
	public Component getChild(int i);
	public void operation();
}

class Leaf implements Component{
	private String name;
	public Leaf(String name) {
		this.name = name;
	}
	
	public void add(Component c) {}
	
	public void remove(Component c) {}
	
	public Component getChild(int i) {return null;}
	
	public void operation() {
		System.out.println("Leaf" + name + " has been called");
	}
}

class Composite implements Component{
	private ArrayList<Component> childern = new ArrayList<Component>();
	
	public void add(Component c) {
		childern.add(c);
	}
	
	public void remove(Component c) {
		childern.remove(c);
	}
	
	public Component getChild(int i) {
		return childern.get(i);
	}
	
	public void operation() {
		for(Object c: childern) {
			((Component) c).operation();
		}
	}
}