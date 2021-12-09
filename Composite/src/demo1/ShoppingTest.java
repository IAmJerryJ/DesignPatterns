package demo1;

import java.util.ArrayList;

public class ShoppingTest {
	public static void main(String[] args) {
		Double s = 0.0;
		Bags BigBag, mediumBag, smallRedBag, smallWhiteBag;
		Goods sp;
		BigBag = new Bags("Big Bag");
		mediumBag = new Bags("Medium Bag");
		smallRedBag = new Bags("Small Red Bag");
		smallWhiteBag = new Bags("Small White Bag");
		sp = new Goods("Tim Tam", 1, 8.1);
		smallRedBag.add(sp);
		sp = new Goods("Milk",2, 7);
		smallRedBag.add(sp);
		sp = new Goods("Chocolate", 1, 8.24);
		smallWhiteBag.add(sp);
		sp = new Goods("Penaut Butter", 5 , 3.15);
		mediumBag.add(sp);
		mediumBag.add(smallRedBag);
		sp = new Goods("Earphone", 3, 70);
		BigBag.add(sp);
		BigBag.add(mediumBag);
		BigBag.add(smallWhiteBag);
		System.out.println("You have purchased: ");
		BigBag.show();
		s = BigBag.calculation();
		System.out.println("The total Price is: " + s + "dollars");
		
	}
}

interface Articles{
	public double calculation();
	public void show();
}

class Goods implements Articles{
	private String name;
	private int quantity;
	private double unitPrice;
	
	public Goods(String name, int quantity, double unitPrice) {
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	
	public double calculation() {
		return quantity*unitPrice;
	}
	
	public void show() {
		System.out.println(name + "(quantity: " + quantity + ", unit price: " + unitPrice + "dollars)");
	}
	
}

class Bags implements Articles{
	private String name;
	private ArrayList<Articles> bags = new ArrayList<Articles>();
	
	public Bags(String name) {
		this.name = name;
	}
	
	public void add(Articles a) {
		bags.add(a);
	}
	
	public void remove(Articles a) {
		bags.remove(a);
	}
	
	public Articles getChild(int i) {
		return bags.get(i);
	}
	
	public double calculation() {
		double total = 0;
		for(Object obj: bags) {
			total += ((Articles)obj).calculation();
		}
		return total;
	}
	
	public void show() {
		for(Object obj: bags) {
			((Articles)obj).show();
		}
	}
}