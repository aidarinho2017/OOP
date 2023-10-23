public class TestLibraryItem{
    public static void main(String[] args) {
        DVD Messi = new DVD("ggg", "ggg", 12, 1009);
        Messi.setQuality(Quality.High);
        Messi.getQuality();
        Messi.setAmountOfMovies(10);
        Messi.getAmountOfMovies();
        Messi.addMovie();
        Messi.getAmountOfMovies();
    }
}
