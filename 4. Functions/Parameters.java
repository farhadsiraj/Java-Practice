public class Parameters {
    public static void main(String[] args) {
        measureRectangle(2.2, 4.3);
        measureRectangle(3.2, 4.1);
        measureRectangle(3.5, 1.2);
    }

    public static void measureRectangle(double length, double width) {
        double area = length * width;
        System.out.println("Area: " + area);
    }
}
