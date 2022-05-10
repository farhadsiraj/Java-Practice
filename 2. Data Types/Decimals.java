public class Decimals {
    public static void main(String[] args) {

        double percentage = 55.7;
        System.out.println("In 2020 " + percentage + "% of the world's population is urban.");

        // Double vars will be stored with a decimal even if you store a whole number.
        double dividend = 25;
        System.out.println(dividend); // 25.0

        // Always use double for math operations. If you use Int it will return a whole
        // number without the remainder.
        double divisor = 2;
        System.out.println(dividend / divisor);
    }
}
