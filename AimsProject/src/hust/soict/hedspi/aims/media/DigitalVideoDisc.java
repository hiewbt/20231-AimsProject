package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc(String title) {
        this.setTitle(title);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title,category,cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this(title, category, cost);
        this.setDirector(director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(title, category, director, cost);
        this.setLength(length);
    }

    public DigitalVideoDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
        super(id, title, category, director, length, cost);
    }

    @Override
    public String toString() {
        return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost() + "$";
    }

    public boolean isMatch(String tempString) {
        return this.getTitle().equals(tempString);
    }

    @Override
    public void play() throws PlayerException {
        if (this.getLength() <= 0) {
            throw new PlayerException("ERROR: DVD length is non-positive!");
        } else {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        }
    }
}
