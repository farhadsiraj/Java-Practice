public class Bus {
    public static void main(String[] args) {
        int passengers = 0;

        // Strings use double quotes
        String sentence = "Number of passengers: ";

        // Java can use += and -= to add or subtract values
        passengers += 9;
        System.out.println(sentence + passengers);
        passengers -= 5;
        System.out.println(sentence + passengers);
        passengers -= 4;
        System.out.println(sentence + passengers);
        sentence = "End of shift";
        System.out.println(sentence);
    }
}
