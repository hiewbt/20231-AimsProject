package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private float total = 0;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>(MAX_NUMBERS_ORDERED);

	public void addMedia(Media media) {
		if(itemsOrdered.size() < MAX_NUMBERS_ORDERED && !itemsOrdered.contains(media)) {
			itemsOrdered.add(media);
			System.out.println("The media " + media.getTitle() + " has been added");
		}
		else System.out.println("The cart is full. Cannot add to cart!");
	}

	public void addMedia(Media[] mediaList) {
		for (Media m : mediaList) {
			addMedia(m);
		}
	}

	public void removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("The media " + media.getTitle() + " has been removed");
		}
		else System.out.println("This media is not exist");

	}

	public float totalCost() {
		total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
		return total;
	}

//	public void cartItem() {
//		for(int i = 0; i < itemsOrdered.size(); i++) {
//			System.out.printf("%-4d%-20s%.2f\n",i+1, itemsOrdered.get(i).getTitle(), itemsOrdered.get(i).getCost());
//		}
//		total = 0;
//		System.out.printf("%-4s%-20s%.2f", "", "Total", totalCost());
//	}
//
//	public void print() {
//		System.out.println("***********************CART***********************");
//		System.out.println("Ordered Items:");
//		for (int i = 0; i < itemsOrdered.size(); i++) {
//			System.out.println(i+1 + ". " + itemsOrdered.get(i).toString());
//		}
//		System.out.println("Total cost: " + totalCost());
//		System.out.println("****************************************************");
//	}
//
//
//	public void searchDvdById() {
//		Scanner keyboard = new Scanner(System.in);
//		System.out.print("Input Id: ");
//		int id = keyboard.nextInt();
//		keyboard.nextLine();
//		for (DigitalVideoDisc digitalVideoDisc : itemsOrdered) {
//			if (digitalVideoDisc.getId() == id) {
//				System.out.println(digitalVideoDisc.toString());
//				return;
//			}
//		}
//
//		System.out.println("No match is found!");
//	}
//
//	public void searchDvdByTitle() {
//		Scanner keyboard = new Scanner(System.in);
//		System.out.print("Input Title: ");
//		String tempTitle = keyboard.nextLine();
//		for (DigitalVideoDisc digitalVideoDisc : itemsOrdered) {
//			if (digitalVideoDisc.isMatch(tempTitle)) {
//				System.out.println(digitalVideoDisc.toString());
//				return;
//			}
//		}
//
//		System.out.println("No match is found!");
//	}
}