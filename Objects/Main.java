import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] parts = { "tires", "keys" };

        Car nissan = new Car("Nissan", 5000, 2020, "Red", parts);

        // Fields should be private so you can't accidently edit them using dot syntax
        // like below

        // nissan.make = "Nissan";
        // nissan.price = 5000;
        // nissan.year = 2020;
        // nissan.color = "Red";

        // Instead you should be using get methods and set methods to access and edit
        // object fields

        nissan.setColor("Lime Green");

        double newPrice = nissan.getPrice() / 2;

        nissan.setPrice(newPrice);

        // Creating a copy of the nissan instance using the copy constructor
        Car nissan2 = new Car(nissan);
        nissan2.setParts(new String[] { "tires", "filter" }); // returns new array without having to store in a var
        System.out.println(Arrays.toString(nissan2.getParts()));
        nissan2.drive();

        System.out.println(nissan.getMake());
        System.out.println(nissan.getPrice());
        System.out.println(nissan.getYear());
        System.out.println(nissan.getColor());
        System.out.println(Arrays.toString(nissan.getParts()));

        Car dodge = new Car("Dodge", 11000, 2019, "Blue", parts);

        dodge.setColor("Electric Blue");

        dodge.setPrice(dodge.getPrice() / 2);

        System.out.println(dodge.getMake());
        System.out.println(dodge.getPrice());
        System.out.println(dodge.getYear());
        System.out.println(dodge.getColor());
        System.out.println(Arrays.toString(dodge.getParts()));
    }
}
