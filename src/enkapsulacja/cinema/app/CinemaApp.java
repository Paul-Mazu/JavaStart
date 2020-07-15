package enkapsulacja.cinema.app;

import enkapsulacja.cinema.data.Client;
import enkapsulacja.cinema.data.Movie;
import enkapsulacja.cinema.logic.CinemaSystem;

public class CinemaApp {
    public static void main(String[] args) {

        Movie movie = new Movie("Omen", "Horror", 128, 16, 72, 72, 0);

        Client client = new Client("Jan", "Kowalski", 15);
        Client client1 = new Client("Anna", "Zalewska", 19);
        Client client2 = new Client("Anna", "Zalewska", 19);

        CinemaSystem system = new CinemaSystem();

        system.ifFreeSeats(movie, client);
        system.ifFreeSeats(movie, client1);
        system.ifFreeSeats(movie, client2);
        system.ifFreeSeats(movie, client2);
        system.ifFreeSeats(movie, client2);
        for (int i = 0; i < 70; i++) system.ifFreeSeats(movie, client2);
        system.howManySeats(movie);



    }
}
