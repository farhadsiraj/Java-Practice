public class ReturnedValues {
    public static void main(String[] args) {
        double rectangle1 = measureRectangle(2.2, 4.3);
        double rectangle2 = measureRectangle(3.2, 4.1);
        double rectangle3 = measureRectangle(3.5, 1.2);

        stringPrinter(2.2, 4.3, rectangle1);
        stringPrinter(3.2, 4.1, rectangle2);
        stringPrinter(3.5, 1.2, rectangle3);
    }

    public static double measureRectangle(double length, double width) {
        double area = length * width;
        return area;
    }

    public static void stringPrinter(double length, double width, double area) {
        System.out.println(
                "The area of a rectangle with length " + length + " and width " + width + " is equal to " + area
                        + "\n");
    }
}
