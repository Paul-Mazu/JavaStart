package enkapsulacja.cinema.logic;

import enkapsulacja.cinema.data.Client;
import enkapsulacja.cinema.data.Movie;

public class CinemaSystem {

    public void ifFreeSeats(Movie movie, Client client) {
        if (movie.getFreeSeats() == 0) System.out.println("Brak wolnych miejsc");
        else if (movie.getAgeRequired() > client.getAge1()) System.out.println("Seans dostepny dla osob powyzej: " + movie.getAgeRequired() + " lat.");
        else {
            System.out.println("Dziekujemy za zakup, bilet numer: " + movie.getTicketNumer());
            movie.setTicketNumer(movie.getTicketNumer()+1);
            movie.setFreeSeats(movie.getFreeSeats()-1);
        }
    }

    public void howManySeats(Movie movie) {
        System.out.println("Pozostalo " + movie.getFreeSeats() + " wolnych miejsc");
    }
}
