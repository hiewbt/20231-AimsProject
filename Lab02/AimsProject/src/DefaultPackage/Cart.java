package DefaultPackage;

import java.util.ArrayList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private float total = 0;
	ArrayList<DigitalVideoDisc> itemsOderedList = new ArrayList<DigitalVideoDisc>(MAX_NUMBERS_ORDERED);
	public int qtyOrdered = 0;
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		itemsOderedList.remove(disc);
		System.out.println("The disc " + disc.getTitle() + " has been removed");
		qtyOrdered = itemsOderedList.size();
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOderedList.add(disc);
			System.out.println("The disc " + disc.getTitle() + " has been added");
			qtyOrdered = itemsOderedList.size();
		}
		else System.out.println("The cart is full. Cannot add to cart!");
	}
	
	public float totalCost() {
		for(int i = 0; i < itemsOderedList.size(); i++) {
			total += itemsOderedList.get(i).getCost();
		}
		return total;
	}
}