public class BooleanComparisons {
    public static void main(String[] args) {
        int chemistryGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 75;

        // Greater Than
        System.out.println(chemistryGrade > biologyGrade);

        // Less Than
        System.out.println(chemistryGrade < biologyGrade);

        // Greater Than or Equal To
        System.out.println(chemistryGrade >= englishGrade);

        // Less Than or Equal To
        System.out.println(chemistryGrade <= englishGrade);

        // Equal To
        System.out.println(biologyGrade == englishGrade);

        // Not Equal To
        System.out.println(biologyGrade != englishGrade);

        System.out.println("Strings");
        String sentence = "Hello World";
        String sentence2 = "Hello World";

        // To compare Strings, you need to use the .equals() method
        // Using == or !== will return weird results.
        System.out.println(sentence.equals(sentence2));

        // For not equals you need to use ! to negate the first string
        System.out.println(!sentence.equals(sentence2));

    }
}
