package hust.soict.hedspi.aims.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.hedspi.aims.media.Media;

public class Store {

    private final List<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        itemsInStore.add(media);
    }

    public void addMedia(List<Media> listMedia) {
        itemsInStore.addAll(listMedia);
    }

    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("Successfully removed a media from the store");
        } else {
            System.out.println("Media isn't existed in the store");
        }
    }

    public Media findMediaByTitle(String title) {
        for (Media m : itemsInStore) {
            if (m.isMatch(title)) {
                System.out.println("Media found!\n" + m.toString());
                return m;
            }
        }
        System.out.println("No such media in the store!");
        return null;
    }

    public void showStore() {
        int index = 1;
        for (Media media : itemsInStore) {
            System.out.println(index++ + ". " + media.toString());
        }
    }

    public List<Media> getItemsInStore() {
        return itemsInStore;
    }
}
