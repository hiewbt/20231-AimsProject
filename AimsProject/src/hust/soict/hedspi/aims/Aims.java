package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Aims {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geoge Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        Book book1 = new Book(1, "B1", "cat", 20f);
        CompactDisc cd1 = new CompactDisc("CD1", "dog", 30f, "H1");

        mediae.add(dvd1);
        mediae.add(dvd2);
        mediae.add(dvd3);
        mediae.add(book1);
        mediae.add(cd1);

        for (Media m : mediae) {
            System.out.println(m.toString());
        }

    }
}
