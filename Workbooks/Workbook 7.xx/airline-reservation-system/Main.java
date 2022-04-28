import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[] { new Person("Cleopatra", "Egypt", "69 BC", 1),
                new Person("Alexander the Great", "Macedon", "356 BC", 2),
                new Person("Julius Caesar", "Rome", "100 BC", 3),
                new Person("Hannibal", "Carthage", "247 BC", 4),
                new Person("Confucius", "China", "551 BC", 5),
                new Person("Pericles", "Greece", "429 BC", 6),
                new Person("Spartacus", "Thrace", "111 BC", 7),
                new Person("Marcus Aurelius", "Rome", "121 AD", 8),
                new Person("Leonidas", "Greece", "540 BC", 9),
                new Person("Sun Tzu", "China", "544 BC", 10),
                new Person("Hammurabi", "Babylon", "1750 BC", 11),
        };
        Airline airline = new Airline();

        for (int i = 0; i < people.length; i++) {
            airline.setPerson(people[i]);
        }
    }

    // public static void main(String[] args) {

    // Person person = new Person("Bruce Wayne", "American", "02/19/1972", 1);

    // if (person.applyPassport() == true) {
    // person.setPassport();
    // } else {
    // System.out.println("We're sorry " + person.getName() + ". We cannot process
    // your application.");
    // }

    // // person.chooseSeat();

    // // // Person persona = new Person(person);

    // // // persona.setName("Batman");
    // // // persona.setNationality("Unknown");
    // // // persona.setDateOfBirth("Unknown");
    // // // persona.setPassport(new String[] { "Unknown", "Unknown", "Unknown" });
    // // // persona.setSeatNumber(2);

    // System.out.println(person);
    // }

}
