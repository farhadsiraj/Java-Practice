public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 5000, 2020, "Red");
        // nissan.make = "Nissan";
        // nissan.price = 5000;
        // nissan.year = 2020;
        // nissan.color = "Red";
        System.out.println(nissan.make);
        System.out.println(nissan.price);
        System.out.println(nissan.year);
        System.out.println(nissan.color);

        Car dodge = new Car("Dodge", 11000, 2019, "Blue");
        // dodge.make = "Dodge";
        // dodge.price = 11000;
        // dodge.year = 2019;
        // dodge.color = "Blue";

        System.out.println(dodge.make);
        System.out.println(dodge.price);
        System.out.println(dodge.year);
        System.out.println(dodge.color);
    }
}
