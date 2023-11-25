package hust.soict.hedspi.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store dvdStoreTest = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geoge Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        dvdStoreTest.addDVD(dvd1);
        dvdStoreTest.addDVD(dvd2);
        dvdStoreTest.addDVD(dvd3);

        dvdStoreTest.removeDVD(dvd2);
    }
}
