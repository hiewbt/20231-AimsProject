package hust.soict.hedspi.aims.media;

public class Track {
    private String title;
    private int lenght;

    public Track(String title, int lenght) {
        this.title = title;
        this.lenght = lenght;
    }

    public String getTitle() {
        return title;
    }

    public int getLenght() {
        return lenght;
    }

}
