
public class Main {

    public static void main(String[] args) {

        Person person = new Person("Bruce Wayne", "American", "02/19/1972", 1);

        System.out.println("Name: " + person.getName() + "\n"
                + "Nationality: " + person.getNationality() + "\n"
                + "Date of Birth: " + person.getDateOfBirth() + "\n"
                + "Seat Number: " + person.getSeatNumber() + "\n");
    }

}
