package hust.soict.hedspi.store;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();


//    public void addDVD(DigitalVideoDisc disc) {
//        itemsInStore.add(disc);
//        System.out.println("The disc " + disc.getTitle() + " has been added");
//    }
//
//    public void removeDVD(DigitalVideoDisc disc) {
//        itemsInStore.remove(disc);
//        System.out.println("The disc " + disc.getTitle() + " has been removed");
//    }

    public void addMedia(Media... media) {
        itemsInStore.addAll(Arrays.asList(media));
    }

    public void removeMedia(Media media) {
        itemsInStore.remove(media);
    }
}
