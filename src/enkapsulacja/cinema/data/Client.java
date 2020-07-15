package enkapsulacja.cinema.data;

public class Client {

    String firstName1 = "Jan";
    String lastName1 = "Kowalski";
    int age1 = 15;

    public Client(String firstName1, String lastName1, int age1) {
        this.firstName1 = firstName1;
        this.lastName1 = lastName1;
        this.age1 = age1;
    }

    public String getFirstName1() {
        return firstName1;
    }

    public void setFirstName1(String firstName1) {
        this.firstName1 = firstName1;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }
}
