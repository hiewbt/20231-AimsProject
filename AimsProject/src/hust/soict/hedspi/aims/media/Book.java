package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> author = new ArrayList<String>();

    public Book() {

    }

    public void addAuthor(String authorName) {
        if (!author.contains(authorName)) {
            author.add(authorName);
        }
        else System.out.println("Fail to add! The authorName is existed");
    }

    public void removeAuthor(String authorName) {
        if (author.contains(authorName)) {
            author.remove(authorName);
        }
        else System.out.println("Fail to delete! The authorName is not exist");
    }
}
