class Movie {
    private String title;
    private String genre;
    private int duration;
    private String language;

    public Movie(String title, String genre, int duration, String language) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.language = language;
    }

    public String getDetails() {
        return title + " | " + genre + " | " + language + " | " + duration + " mins";
    }
}
