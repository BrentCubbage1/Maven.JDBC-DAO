package daos;

public class Game {

    private int appID;
    private String name;
    private String genre;
    private Double rating;
    private int releaseYear;

    public Game() {
    }

    public Game(int appID, String name, String genre, Double rating, int releaseYear) {
        this.appID = appID;
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public int getAppID() {
        return appID;
    }

    public void setAppID(int appID) {
        this.appID = appID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
