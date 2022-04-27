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

        System.out.println("Name: " + person.getName() + "\n"
                + "Nationality: " + person.getNationality() + "\n"
                + "Date of Birth: " + person.getDateOfBirth() + "\n"
                + "Passport" + Arrays.toString(person.getPassport()) + "\n"
                + "Seat Number: " + person.getSeatNumber() + "\n");

        // // System.out.println("Name: " + persona.getName() + "\n"
        // // + "Nationality: " + persona.getNationality() + "\n"
        // // + "Date of Birth: " + persona.getDateOfBirth() + "\n"
        // // + "Passport" + Arrays.toString(persona.getPassport()) + "\n"
        // // + "Seat Number: " + persona.getSeatNumber() + "\n");
    }

}
