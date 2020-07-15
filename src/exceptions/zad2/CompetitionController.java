package exceptions.zad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompetitionController {
    private Scanner scanner = new Scanner(System.in);

    void run() {
        Competition competition = createCompetition();
        fillParticipantsInfo(competition);
        printCompetition(competition);
    }

    private Competition createCompetition() {
        System.out.println("Podaj nazwę zawodów:");
        String competitionName = scanner.nextLine();
        System.out.println("Podaj maksymalną liczbę uczestników:");
        int maxParticipants = readPositiveNumber();
        System.out.println("Podaj ograniczenie wiekowe:");
        int ageLimit = readPositiveNumber();
        return new Competition(competitionName, maxParticipants, ageLimit);
    }

    private void fillParticipantsInfo(Competition competition) {
        while (competition.hasFreeSpots()) {
            System.out.println("Dodaj nowego uczestnika");
            try {
                Participant participant = createParticipant();
                competition.addParticipant(participant);
            } catch (AgeViolationException e) {
                System.err.println("Uczestnik musi mieć ukończone " + competition.getAgeLimit() + " lat");
            } catch (MaxCompetitorsException e) {
                System.err.println("Maxymalna ilość uczestników została osiągnieta");
            } catch (DuplicateException e) {
                System.err.println("Uczestnik już zapisany");
            }
        }
    }

    private int readPositiveNumber() {
        int number = -1;
        while (number < 0) {
            try {
                number = scanner.nextInt();
                if (number < 0) System.out.println("Liczba musi być dodatnia, spróbuj jeszcze raz: ");
            } catch (InputMismatchException e) {
                System.err.println("Musisz podać liczbę, spróbuj jeszcze raz");
            } finally {
                scanner.nextLine();
            }
        }
        return number;
    }

    private Participant createParticipant() {
        System.out.println("Podaj imię:");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = scanner.nextLine();
        System.out.println("Podaj id (np. pesel):");
        String id = scanner.nextLine();
        System.out.println("Podaj wiek: ");
        int age = readPositiveNumber();
        return new Participant(firstName, lastName, id, age);
    }

    private void printCompetition(Competition competition) {
        System.out.println(competition.toString());
    }
}