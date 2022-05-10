import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] previousStaff = { "Tommy", "Joel", "Ellie" };

        // Since 'currentStaff' points to the same reference as 'previousStaff', making
        // a change to one will effect both (because its the same reference)
        // String[] currentStaff = previousStaff;
        // currentStaff[1] = "Abby";

        // The correct way is to make a new array and copy the values of the previous
        // array into the new array

        String[] currentStaff = Arrays.copyOf(previousStaff, previousStaff.length);

        // String[] currentStaff = new String[3];
        // for (int i = 0; i < previousStaff.length; i++) {
        // currentStaff[i] = previousStaff[i];
        // }
        currentStaff[1] = "Abby";

        System.out.println(Arrays.toString(previousStaff));
        System.out.println(Arrays.toString(currentStaff));

    }
}
