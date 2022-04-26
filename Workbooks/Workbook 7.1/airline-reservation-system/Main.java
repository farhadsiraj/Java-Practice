import java.security.Permissions;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Bruce Wayne", "American", "02/19/1972", 1);

        System.out.println("Name: " + person.name + "\n"
                + "Nationality: " + person.nationality + "\n"
                + "Date of Birth: " + person.dateOfBirth + "\n"
                + "Seat Number: " + person.seatNumber + "\n");
    }

}
