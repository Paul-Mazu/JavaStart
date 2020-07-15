package enkapsulacja.cinema.data;

public class Movie {
    String movieTitle;
    String movieType;
    int movieTime;
    int ageRequired;
    int maxSeats;
    int freeSeats;
    int ticketNumer;

    public Movie(String movieTitle, String movieType, int movieTime, int ageRequired, int maxSeats, int freeSeats, int ticketNumer) {
        this.movieTitle = movieTitle;
        this.movieType = movieType;
        this.movieTime = movieTime;
        this.ageRequired = ageRequired;
        this.maxSeats = maxSeats;
        this.freeSeats = freeSeats;
        this.ticketNumer = ticketNumer;
    }


    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public int getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(int movieTime) {
        this.movieTime = movieTime;
    }

    public int getAgeRequired() {
        return ageRequired;
    }

    public void setAgeRequired(int ageRequired) {
        this.ageRequired = ageRequired;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public void setFreeSeats(int freeSeats) {
        this.freeSeats = freeSeats;
    }

    public int getTicketNumer() {
        return ticketNumer;
    }

    public void setTicketNumer(int ticketNumer) {
        this.ticketNumer = ticketNumer;
    }
}
