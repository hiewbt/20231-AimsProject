package DefaultPackage;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int lenght;
    private float cost;

    public void setTitle(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int lenght, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        this.lenght = lenght;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLenght() {
        return lenght;
    }

    public float getCost() {
        return cost;
    }
}
