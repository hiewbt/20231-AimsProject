package hust.soict.hedspi.store;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    public void addDVD(DigitalVideoDisc disc) {
        itemsInStore.add(disc);
        System.out.println("The disc " + disc.getTitle() + " has been added");
    }

    public void removeDVD(DigitalVideoDisc disc) {
        itemsInStore.remove(disc);
        System.out.println("The disc " + disc.getTitle() + " has been removed");
    }
}
