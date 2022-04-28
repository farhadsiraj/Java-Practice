import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Bruce Wayne", "American", "02/19/1972", 1);

        if (person.applyPassport() == true) {
            person.setPassport();
        } else {
            System.out.println("We're sorry " + person.getName() + ". We cannot process your application.");
        }

        // person.chooseSeat();

        // // Person persona = new Person(person);

        // // persona.setName("Batman");
        // // persona.setNationality("Unknown");
        // // persona.setDateOfBirth("Unknown");
        // // persona.setPassport(new String[] { "Unknown", "Unknown", "Unknown" });
        // // persona.setSeatNumber(2);

        System.out.println(person);
    }

}
