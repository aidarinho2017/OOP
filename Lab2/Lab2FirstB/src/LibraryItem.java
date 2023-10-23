abstract public class LibraryItem {
    String title;
    String author;
    int publicationYear;
    int cost;
    public LibraryItem(String title, String author, int publicationYear, int cost){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.cost = cost;
    }
    abstract public void setQuality(Quality quality);
    abstract public void getQuality();





}
