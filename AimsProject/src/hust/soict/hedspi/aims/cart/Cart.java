package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

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

	public void addDigitalVideoDisc(DigitalVideoDisc [] divList) {
		for (DigitalVideoDisc item:divList) {
			addDigitalVideoDisc(item);
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		addDigitalVideoDisc(disc1);
		addDigitalVideoDisc(disc2);
	}


	public float totalCost() {
        for (DigitalVideoDisc digitalVideoDisc : itemsOderedList) {
            total += digitalVideoDisc.getCost();
        }
		return total;
	}

	public void cartItem() {
		for(int i = 0; i < itemsOderedList.size(); i++) {
//			System.out.println(i+1 + "\t" + itemsOderedList.get(i).getTitle() + "\t\t" + itemsOderedList.get(i).getCost());
			System.out.printf("%-4d%-20s%.2f\n",i+1, itemsOderedList.get(i).getTitle(), itemsOderedList.get(i).getCost());
		}
		total = 0;
		System.out.printf("%-4s%-20s%.2f", "", "Total", totalCost());
	}

}