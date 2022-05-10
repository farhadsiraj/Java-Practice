import java.util.HashMap;

public class KeyValues {

    public static void main(String[] args) {
        String[] vegetables = new String[] { "Cauliflower", "Spaghetti Squash", "Parsley" };
        double[] prices = new double[] { 4.99, 1.99, 6.99 };

        HashMap<String, Double> items = new HashMap<String, Double>();
        items.put("Cauliflower", 4.99);
        items.put("Spaghetti Squash", 1.99);
        items.put("Parsley", 6.99);

        // put is used to add a new entry or update an existing entry
        items.put("Parsley", 3.99);
        System.out.println(items.get("Parsley"));
    }

}
