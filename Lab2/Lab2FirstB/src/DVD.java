public class DVD extends LibraryItem{
    String title;
    String author;
    int publicationYear;
    int cost;
    private Quality quality;
    private int amountOfMovies;

    public DVD(String title, String author, int publicationYear, int cost){
        super(title, author, publicationYear, cost);
    }
    public void setQuality(Quality quality){
        this.quality = quality;
    }
    public void getQuality() {
        System.out.println("The quality of this DVD is " + this.quality);
    }
    public void setAmountOfMovies(int amountOfMovies){
        this.amountOfMovies = amountOfMovies;
    }
    public void addMovie(){
        this.amountOfMovies += 1;
    }
    public void getAmountOfMovies(){
        System.out.println("The number of movies on this DVD is " + this.amountOfMovies);
    }
}
