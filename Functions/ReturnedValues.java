public class ReturnedValues {
    public static void main(String[] args) {
        double rectangle1 = measureRectangle(2.2, 4.3, "area");
        double rectangle2 = measureRectangle(3.2, 4.1, "perimeter");

        stringPrinter(2.2, 4.3, rectangle1, "area");
        stringPrinter(3.2, 4.1, rectangle2, "perimeter");

    }

    public static double measureRectangle(double length, double width, String option) {
        if (length < 0 || width < 0) {
            System.out.println("length or width cannot be negative");
            System.exit(0);
        }
        switch (option) {
            case "area":
                return length * width;
            case "perimeter":
                return 2 * (length * width);
            default:
                return 404;
        }

    }

    public static void stringPrinter(double length, double width, double measure, String option) {
        System.out.println(
                "The " + option + " of a rectangle with length " + length + " and width " + width + " is equal to "
                        + measure
                        + "\n");
    }
}
