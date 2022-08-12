public class DVD {

    private String title;
    private String date;
    private String mpaaRating;
    private String directorName;
    private String studio;
    private String userRating;

    //DVD DTO
    public DVD(String myTitle, String myDate, String mpaaRate, String director, String studioName, String user){
        this.title= myTitle;
        this.date = myDate;
        this.mpaaRating = mpaaRate;
        this.directorName = director;
        this.studio = studioName;
        this.userRating = user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserRating() {
        return userRating;
    }

    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }
}
