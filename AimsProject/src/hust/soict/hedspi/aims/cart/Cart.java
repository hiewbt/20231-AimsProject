package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private float total = 0;
	ArrayList<DigitalVideoDisc> itemsOrderedList = new ArrayList<DigitalVideoDisc>(MAX_NUMBERS_ORDERED);
	public int qtyOrdered = 0;
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		itemsOrderedList.remove(disc);
		System.out.println("The disc " + disc.getTitle() + " has been removed");
		qtyOrdered = itemsOrderedList.size();
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrderedList.add(disc);
			System.out.println("The disc " + disc.getTitle() + " has been added");
			qtyOrdered = itemsOrderedList.size();
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
		total = 0;
        for (DigitalVideoDisc digitalVideoDisc : itemsOrderedList) {
            total += digitalVideoDisc.getCost();
        }
		return total;
	}

	public void cartItem() {
		for(int i = 0; i < itemsOrderedList.size(); i++) {
//			System.out.println(i+1 + "\t" + itemsOrderedList.get(i).getTitle() + "\t\t" + itemsOrderedList.get(i).getCost());
			System.out.printf("%-4d%-20s%.2f\n",i+1, itemsOrderedList.get(i).getTitle(), itemsOrderedList.get(i).getCost());
		}
		total = 0;
		System.out.printf("%-4s%-20s%.2f", "", "Total", totalCost());
	}

	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < itemsOrderedList.size(); i++) {
			System.out.println(i+1 + ". " + itemsOrderedList.get(i).toString());
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("****************************************************");
	}


	public void searchDvdById() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input Id: ");
		int id = keyboard.nextInt();
		keyboard.nextLine();
//		keyboard.close();
		for (DigitalVideoDisc digitalVideoDisc : itemsOrderedList) {
			if (digitalVideoDisc.getId() == id) {
				System.out.println(digitalVideoDisc.toString());
				return;
			}
		}

		System.out.println("No match is found!");
	}

	public void searchDvdByTitle() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input Title: ");
		String tempTitle = keyboard.nextLine();
//		keyboard.close();
		for (DigitalVideoDisc digitalVideoDisc : itemsOrderedList) {
			if (digitalVideoDisc.isMatch(tempTitle)) {
				System.out.println(digitalVideoDisc.toString());
				return;
			}
		}

		System.out.println("No match is found!");
	}
}