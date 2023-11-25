package hust.soict.hedspi.test.cart;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        // Create new cart
        Cart cart = new Cart();

        //  Create new DVD Objects and add them to cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
                "Geoge Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        // Test the print method
        cart.print();
        // To-do: Test the search methods here
        cart.searchDvdById();
        cart.searchDvdByTitle();
    }
}
