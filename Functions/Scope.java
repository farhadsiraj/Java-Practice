public class Scope {
    static int dogs = 5;

    public static void main(String[] args) {
        System.out.println(dogs);
        someFunc();
    }

    public static void someFunc() {
        int apples = 1;
        System.out.println(apples);
        System.out.println(dogs);
    }
}
